Feature: Your Store Login
         As a User
         I want to verify login functionality

Scenario: verify login functionality with valid credentials

  Given    User is on Home page
  Then     User should see message "Your Store" on the home page
  When     User clicks on My Account link
  And      User clicks on Login Link
  Then     User should navigate to Login link
  And      User should see message on Login page display "Returning Customer"



