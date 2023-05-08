@PER10-261
Feature: Per Fleet Project Login Functionality

  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  Accounts are: Driver, sales manager , store manager

Background: User is on the login page
  Given User is on the perfleet login page
  @PER10-260
  Scenario: Login as a Driver
    When user enters driver username
    And user enters driver  password
    Then user should see the dashboard
  @PER10-271
  Scenario: Login as a salesmanager
    When user enters salesmanager username
    And user enters salesmanager  password
    Then user should see the dashboard
  @PER10-272
  Scenario: Login as a storemanager
    When user enters storemanager username
    And user enters storemanager  password
    Then user should see the dashboard

  @PER10-273
  Scenario: Login as a Driver invalid credentials
    When user enters driver  invalid username
    And user enters  correct driver  password
    Then user should see the Invalid username or password message
  @PER10-277
 Scenario Outline: Login as a Driver without  credentials
    When user enters driver email "<email>"
    And user enters  drıver password "<password>"
    Then user should see this field required message
Examples: Email and password with some empty field
    |email|password|
    |     |123     |
    |user |        |

  @PER10-279
  Scenario: Login as a Driver to the user name
    When user enters driver username
    And user enters driver  password
    Then user should see the dashboard
