Feature: Feature to test the Error message for invalid login

  Scenario Outline: Verify the Invalid Credentials message is correctly displayed when entering random username and password
    Given user navigates to the URL
    When entering random "<username>" and "<password>"
    Then Invalid Credentials message is displayed correctly

    Examples: 
      | username  | password |
      | user1     | user2    |
      | prashanth | Password |
