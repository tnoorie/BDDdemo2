Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario: Post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type message in the box
    And Click on Post button
    Then Message should get posted
