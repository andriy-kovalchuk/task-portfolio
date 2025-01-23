Feature: User should be able to login and see correct portfolio balance

  Scenario: User should be able to login with valid data and verify correct total portfolio value
    Given user is on the main page
    When user clicks LogIn button on the main page
    And user enters valid username
    And user enters valid password
    And user clicks continue
    Then total portfolio balance must be displayed correctly
