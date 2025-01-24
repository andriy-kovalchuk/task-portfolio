# Portfolio Framework

## Overview
This framework is designed to verify portfolio data using automated UI tests.

### **Key Details**
- **Language**: Java
- **Testing Libraries**: Selenium, Cucumber, JUnit

---

## **Test Configuration**
Set up the required test data in the `test.properties` file by providing the following details:
- `url`: The application URL.
- `username`: The username for login.
- `password`: The password for login.
- `expectedPortfolioValue`: The expected portfolio value for the given account.

---

## **Running Tests**
You can execute tests in two ways:

1. **From IntelliJ or your IDE**:
    - Run the test file directly(opening any of these 2 files and right-click will give an option to run a test.):
        - `src/test/java/com/website/runner/TestRunner.java`
        - `src/test/resources/features/PortfolioVerification.feature`

2. **From the Terminal**:
    - Use the Maven command below to execute specific tests:
      ```bash
      mvn test -Dcucumber.options="--tags @tc1"
      ```

---

## **Test Implementation**
The main test logic is implemented in the following class:
- `src/test/java/com/website/step_implementations/PortfolioVerificationSteps.java`

---

## **Browser Configuration**
By default, the framework is configured to run in **Chrome headless mode**.  
To switch to non-headless mode or another browser, modify the `browser` variable in the `test.properties` file. Available options are:
- `chrome`
- `safari`
- `firefox`
- `chrome-headless`

---

## **Dependencies (for Linux Users)**
Ensure the following dependencies are installed:

1. **Maven**:
   ```bash
   brew install mvn
   ```
2. **ChromeDriver**:
   ```bash
   brew install chromedriver
   ```
3. **Homebrew**(if not already installed):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
