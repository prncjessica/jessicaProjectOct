Feature: 
  To validate the invalid login functionality of ICINC application

  Scenario Outline: 
    
    User enter the invalid username and invalid password

    Given User should launch the chrome  brower and pass the url and maximise the window
    When User should cilck the SignIn or Register
    When user enter the invalid "<username>" and invalid "<password>"
    And user  should click the login button
    Then user should move to the invalid credential page

    Examples: 
      | username         | password |
      | monica@gmail.com | moni@123 |
      | saru@gmail.com   | saru@123 |
