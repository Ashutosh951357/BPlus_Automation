Feature: Check UPI transfer
Scenario: Validate user is able to do UPI transfer after login
  Given User navigate to Homepage
  When User should able to click on upi transfer button
  Then User should be able to select Upi account and transfer amount
