
@regression
Feature: 
  Validate the ordering Functionality of ICING application

  Scenario: 
      Validate the search box functionality of application

    Given User should  launch  brower and pass the url and maximise the window
    When User should cilck the LogIn or Register
    When user  should type the valid username and valid password
    And user  should click  login button
    And user should enter the product name into searchbox
    And user should click the search button
    And user should select the product and click the product
    Then user should move to the product page
