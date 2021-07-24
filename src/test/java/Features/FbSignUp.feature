@SignUpFeature
Feature: Facebook Signup

  Scenario Outline: Verify that user able to Create New Account
    Given User has opened the Facebook application
    When User click on the Create New Account button
    And User enters "<FirstName>" "<LastName>" "<MobileNumber>" and "<Password>"
    And User Selects "<Month>" "<Date>" and "<Year>"
    And User click on Signup button
    Then User should able to see Success message

    Examples: 
      | FirstName | LastName | MobileNumber | Password | Month | Date | Year |
      | Sri       | Sridhar  |   9978987899 | adb@123  |    07 |   24 | 2007 |

  @DataTable
  Scenario: Verify that user able to Create New Account
    Given User has opened the Facebook application
    When User click on the Create New Account button
    And User Creates the new account
      | Field        | Value      |
      | FirstName    | Sri        |
      | LastName     | Sridhar    |
      | MobileNumber | 9978987899 |
      | Password     | abc@123    |
    And User Selects
      | Field | Value |
      | Date  |    07 |
      | Month |    07 |
      | Year  |  1990 |
    And User click on Signup button
    Then User should able to see Success message
