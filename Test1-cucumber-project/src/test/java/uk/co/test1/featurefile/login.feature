Feature: Login feature

  as a user I want to login into nop commerce website
  Scenario: User should navigate to Login page successfully
    Given I am on Home page
    When  I click on Login Link
    Then  I should navigate to Login page successfully and see the text "Welcome, Please sign in!"