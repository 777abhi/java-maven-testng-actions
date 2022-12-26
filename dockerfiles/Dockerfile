FROM amazoncorretto

# Install Bash
RUN sudo apt-get update && \
    sudo apt-get install -y bash

# Install Maven
RUN sudo apt-get update && \
    sudo apt-get install -y maven

# Copy the project files to the container
COPY . .

# Start Bash when the container is run
CMD ["/bin/bash"]