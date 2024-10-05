Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given I navigate to the login page from home page
    When I enter the Email and password
      | Salim96tr@gmail.com   | Test@123 |
    And I click on login button
    Then I should see the home page

    Scenario Outline: login with invalid credentials
      Given I navigate to the login page from home page
      When I enter the email as "<Email>" and password as "<Password>"
      And I click on the login button
      Then Error message should appear

      Examples:
        |       Email            |       Password          |
        |  Salim96tr@gmail.com   |       Wrong123          |
        |       Wrong            |       Test@123          |
        |       Wrong            |       Wrong123          |

