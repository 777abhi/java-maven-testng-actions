

```java
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

public class ExcelUpdater {

    public static void main(String[] args) throws IOException {
        String excelFilePath = "path/to/excel/file.xlsx"; // Replace with your file path
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet masterSheet = workbook.getSheet("Master"); // Replace with your master sheet name

        // Iterate over the rows of the master sheet
        for (Row row : masterSheet) {
            Cell updateCell = row.getCell(0); // Assuming 'Update' is the first column
            Cell sheetNameCell = row.getCell(1); // Assuming 'Sheet Name' is the second column

            if (updateCell != null && "Yes".equals(updateCell.getStringCellValue())) {
                String sheetName = sheetNameCell.getStringCellValue();
                Sheet sheetToUpdate = workbook.getSheet(sheetName);
                if (sheetToUpdate != null) {
                    updateSheet(sheetToUpdate);
                }
            }
        }

        inputStream.close();

        // Write the changes back to the file
        FileOutputStream outputStream = new FileOutputStream(excelFilePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    private static void updateSheet(Sheet sheet) {
        int headerRowNum = 4; // 5th row, index starts from 0
        Row headerRow = sheet.getRow(headerRowNum);
        if (headerRow != null) {
            // Generate a random value
            String randomValue = generateRandomValue();

            // Iterate over the cells of the header row
            Iterator<Cell> cellIterator = headerRow.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                int columnIndex = cell.getColumnIndex();

                // Update all cells under this header with the random value
                for (int i = headerRowNum + 1; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    if (row != null) {
                        Cell cellToUpdate = row.getCell(columnIndex);
                        if (cellToUpdate != null) {
                            cellToUpdate.setCellValue(randomValue);
                        }
                    }
                }
            }
        }
    }

    private static String generateRandomValue() {
        // Generate a random alphanumeric string
        Random random = new Random();
        return Long.toString(Math.abs(random.nextLong()), 36);
    }
}
```

Before running this code, ensure you have the Apache POI library included in your project using Maven. Add the following dependency to your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>5.2.0</version> <!-- Use the latest version -->
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.0</version> <!-- Use the latest version -->
    </dependency>
</dependencies>
```

Replace `'path/to/excel/file.xlsx'` and `'Master'` with your actual file path and master sheet name respectively.

**Note**: This code assumes that the 'Update' column is the first column and the 'Sheet Name' is the second column in the master sheet. Adjust the indices accordingly if your Excel file has a different structure.


To execute the Java code from the command prompt, follow these steps:

1. **Compile the Java Code**:
   - Open a terminal or command prompt.
   - Navigate to the directory where your Java file (`ExcelUpdater.java`) is located.
   - Compile the Java code using the following command:
     ```bash
     javac ExcelUpdater.java
     ```

2. **Run the Compiled Class**:
   - After successful compilation, you'll have a `.class` file (e.g., `ExcelUpdater.class`).
   - Run the compiled class using the following command:
     ```bash
     java ExcelUpdater
     ```

3. **Ensure Maven Dependencies**:
   - Make sure you have the Apache POI library dependencies in your `pom.xml` (as mentioned in the previous response).
   - If you haven't already, build your project using Maven:
     ```bash
     mvn clean install
     ```

4. **Replace Placeholder Values**:
   - Replace `'path/to/excel/file.xlsx'` with the actual path to your Excel file.
   - Adjust the master sheet name and other parameters as needed.

Remember to have Java and Maven installed on your system. If you encounter any issues, ensure that your environment variables are correctly set up for Java and Maven.


