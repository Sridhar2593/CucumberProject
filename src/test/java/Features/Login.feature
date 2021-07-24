@LoginFeature
Feature: Login Feature
  
  Description: This feature will be used to login to Simplilearn Application

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the simplilearn application
    When User click on the Login button
    And User enters correct username "<UserName>"
    And User enters correct Password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home page
    And User should be able to see the Welcome message

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | abcd1234 |
      #| 123@xyz.com | abc123   |

  @NegativeLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the simplilearn application
    When User click on the Login button
    And User enters correct username "<UserName>"
    And User enters correct Password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home page
    And User should be able to see the Welcome message

    Examples: 
      | UserName    | Password |
      | rdx@xyz.com | abcd1234 |
      #| 123@xyz.com | abc123   |
