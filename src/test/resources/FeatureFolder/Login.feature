Feature: 
  To validate the login functionality of ICINC application

  Scenario: 
    User enter the valid username and invalid password

    Given User will launch the chrome  brower and pass the url and maximise the window
    When User should cilck the SignIn or RegisterLink
    When user enter the valid username and invalid password
      | prncjessica@gmail.com | jessi@123 |
      | monica@123            | moni@123  |
    And user click the login button
    Then user should move to the valid credential page

  Scenario: 
    User enter the valid username and valid password

    Given User will launch the chrome  brower and pass the url and maximise the window
    When User should cilck the SignIn or RegisterLink
    When user  should click forgotton password
    And user should the valid id
    Then user should move to the invalid credential page

  Scenario: 
    User should leave empty username and  empty password

    Given User will launch the chrome  brower and pass the url and maximise the window
    When User should cilck the SignIn or RegisterLink
    And user click the login button
    Then user should move to the invalid credential page

  Scenario: 
    User enter the valid username and valid password

    Given User will launch the chrome  brower and pass the url and maximise the window
    When User should cilck the SignIn or RegisterLink
    When user enter the valid username and valid password
    And user click the login button
    Then user should move to the valid credential page
