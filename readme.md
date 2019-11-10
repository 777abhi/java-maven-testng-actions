SeleniumAdv
    └── TestNG_ExcludeTests
        ├── pom.xml
        ├── src
        │   └── test
        │       └── java
        │           └── arithmeticOperation
        │               ├── Addition.java
        │               ├── Multiplication.java
        │               └── Subtraction.java
        └── testng.xml

        
        vi src/test/java/arithmeticOperation/Addition.java
        vi src/test/java/arithmeticOperation/Multiplication.java
        vi src/test/java/arithmeticOperation/Subtraction.java

        src.test.java.arithmeticOperation.Addition

       ## Hands on 3 - 
         - In Addition Class perform the "Enable Tag"
         - In Division Class perform the "Depend On Methods Tag"
         - In Multiplication Class perform the "Priority Tag"
         - In Subtraction Class perform the "TimeOut Tag"
		 
		 
	## Hands on 4 - 
	1) Add the below Testng Helper Attributes tags in the following scripts.

 - Open Arithmetic.java and perform the group tags for the below methods.

 - AddtionMethod1 method
 - AddtionMethon2 method
 - AddtionMethod3 method
2) Write Hard Asset (assertEquals) for all the method and try to pass all the methods.

3) Create the required tags inside Testng.xml file & link the class file present in arithmeticOperation package.

4) Once done with scripting come to the project folder where the pom.xml file is present.

5) Now Let's execute the test with the help of maven command

##hands on 5
Click the below command to download phantomjs driver. wget https://bitbucket.org/ariya/phantomjs/downloads/phantomjs-2.1.1-linux-x86_64.tar.bz2 && tar xvjf phantomjs-2.1.1-linux-x86_64.tar.bz2 && rm -f *.bz2

Now, Before getting into let's see the project structure for better understanding. Lets execute sudo apt-get install tree once installed type tree in terminal.

We have already created some java class under googleSearch package in src/test/java path.

1) Link GoogleSearch.java class file in testng.xml & add the Parameter tags to pass the values into the script.

2) Create @Parameters for (URL & Google Search Keyword as Fresco Play) in GoogleSearch.java class.

3) @Test - Write the script for google search text field and pass the parameter into the script to execute.

4) Once done with scripting come to the project folder where the pom.xml file is present.

5) Now Let's execute the test with the help of maven command mvn clean install | tee output.txt
##hands on 6
Type ls to find the project SeleniumAdv and get into the folder by typing cd SeleniumAdv

Click the below command to download phantomjs driver. wget https://bitbucket.org/ariya/phantomjs/downloads/phantomjs-2.1.1-linux-x86_64.tar.bz2 && tar xvjf phantomjs-2.1.1-linux-x86_64.tar.bz2 && rm -f *.bz2

Now, Before getting into let's see the project structure for better understanding. Lets execute sudo apt-get install tree once installed type tree in terminal.

We have already created some java class under googleSearch package in src/test/java path.

1) Create 3 set's of data in @DataProvider getdata method & use the keywords (Fresco Play, Fresco Apps, Ultimatix) for Google Search text field in GoogleSearch.java class.

2) Write the element locators and the pass the data provider annotations in @Test & make sure to pass the respected googleSearch keyword in "System.out.println("We have successfully Searched for " + parameter of googleSearch keyword); "

3) Once done with scripting come to the project folder where the pom.xml file is present.

4) Now Let's execute the test with the help of maven command mvn clean install | tee output.txt
##hands on 7
Type ls to find the project SeleniumAdv and get into the folder by typing cd SeleniumAdv

Click the below command to download phantomjs driver. wget https://bitbucket.org/ariya/phantomjs/downloads/phantomjs-2.1.1-linux-x86_64.tar.bz2 && tar xvjf phantomjs-2.1.1-linux-x86_64.tar.bz2 && rm -f *.bz2

Now, Before getting into let's see the project structure for better understanding. Lets execute sudo apt-get install tree once installed type tree in terminal. launchBrowser We have already created the java class file under launchBrowser package in src/test/java path.

1) In Registration.json file write the following data (URL, Username, Passwords & Confirm Password) values to drive these data into the script.

2) Write the required Global Variables.

3) In @BeforeTest add (JSON Parser & JSON Object) in the script.

4) In @Test find the Element locators and pass the parameter into the script to execute. Write the script for the following (URL, User Name:, Password:, Confirm Password, Submit Button) and perform the registration.

5) Once done with scripting come to the project folder where the pom.xml file is present.

6) Now Let's execute the test with the help of maven command mvn clean install | tee output.txt

