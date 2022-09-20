@tumtest
Feature: user_login

  @test
  Scenario: login with user credentials

   # Given user is on the home page--->hook ta halloluyor
    And user hover over on human avatar and clicks on login button in homepage
    And user sends username "username"
    And user sends password "password"
    And user clicks on the LOG IN button in loginpage
    Then user verifies they logged in their own page
   # Then close the application