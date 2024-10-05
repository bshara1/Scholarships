Feature: navigate to Scholarships
  Scenario: get Scholarships Name
    Given login and then go to Scholarships page from home page
    When I get the Scholarships name
    Then I print the Scholarships name


  Scenario: fill valid Scholarships info
    Given login and then navigate to Scholarships page from Home page and select Outstanding Scholarship
    When  fill the valid info for Scholarships
    Then click on send button


    Scenario: Empty Scholarships info
      Given login and then navigate to Scholarships page from Home page then select Outstanding Scholarship
      When  dont fill info for Scholarships
      Then click on send button2