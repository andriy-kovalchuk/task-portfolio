# Portfolio Framework

## Overview
This framework is designed to verify portfolio data using automated UI test.

### **Key Details**
- **Language**: Java
- **Testing Libraries**: Selenium, Cucumber, JUnit

---

## **Test Configuration**
Set up the required test data in the `test.properties` file by providing the following details:
- `url`: The application URL.
- `username`: The username for login.
- `password`: The password for login.
- `expectedPortfolioValue`: The expected portfolio value for the given account (provide currency and total amount): e.g. $5123.00

---

## **Running Tests**
You can execute tests in two ways:

1. **From IntelliJ or your IDE**:
    - Run the test file directly(opening any of these 2 files and right-click will give an option to run a test.):
        - `src/test/java/com/website/runner/TestRunner.java`
        - `src/test/resources/features/PortfolioVerification.feature`

2. **From the Project's Terminal**:
    - Use the Maven command below to execute specific tests:
      ```bash
      mvn test -Dcucumber.options="--tags @tc1"
      ```
---    
## **Browser Configuration**
By default, the framework is configured to run in **Chrome headless mode**.  
To switch to non-headless mode or another browser, modify the `browser` variable in the `test.properties` file. Available options are:
- `chrome`
- `chrome-headless`
- `firefox`
- `safari`

---

## **Dependencies (for Linux Users)**
Ensure the following dependencies are installed:

1.**Homebrew**(if not already installed):
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
2.**Java11**:
   ```bash
   brew install openjdk@11
   ```
3.**Maven**:
   ```bash
   brew install mvn
   ```
4.**ChromeDriver**:
   ```bash
   brew install chromedriver
   ```
5.**Additional Setup (If Required):**
   Adjust ChromeDriver Permissions.
   If you face permission issues with ChromeDriver:
   ```bash
   xattr -d com.apple.quarantine /usr/local/bin/chromedriver
   chmod +x /usr/local/bin/chromedriver
   ```
You can also complete this step manually:
1. Go to **System Settings** > **Privacy & Security**.
2. Scroll down to the message: `"chromedriver" was blocked from use`
3. Click **Allow Anyway**.
4. Rerun the test.
---

## **Test Implementation**
The main test logic is implemented in the following class:
- `src/test/java/com/website/step_implementations/PortfolioVerificationSteps.java`

---
## **Final notes:**
- This solution will not work if 2FA is enabled for the account.
- During testing, I encountered an issue where the system did not recognize the device after logging in, prompting an email confirmation. I had to manually approve the device via email to be able to proceed to portfolio page.
- I've implemented a 60-second wait for the next web element to be located before test fails.
- It's recommended that whoever runs this test ensures that email step is disabled internally or bypassed in the QA environment. However, when automating in the production environment, I was unable to bypass this step.

