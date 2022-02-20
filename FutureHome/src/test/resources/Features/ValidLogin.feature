Feature: Feature to test the successful login and retrieving the user name functionality

  Scenario: Verify user is able to login successfully and retrieve the user name
    Given user navigates to the desired URL
    When entering username and password by Capturing in the screen
    Then login should be successful
    And Print the Name of the user
