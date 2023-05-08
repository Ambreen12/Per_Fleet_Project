@smoke
@PER10-264
Feature: Per Fleet Project Login out Functionality
  User Story:
  As a user, I should be able to log out

  Background: User is on the login page
    Given User is on the perfleet login page
    When user enters driver username
    And user enters driver  password
    Then User is on the perfleet homepage login page

@wip
@PER10-262
  Scenario: user can log out
    When user will  click on his name
  Then user will click on logout button
    And end up on the login page

  @PER10-263
  Scenario: user cannot go to home page again without logging in again
    When user clicks on step back button
    Then user comes back on the login page not the home page