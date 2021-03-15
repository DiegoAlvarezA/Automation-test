@Test
Feature: Registration
  In order to use utest
  As a user
  I want to be able to register

  Scenario: Pepito can register successfully
    Given Pepito is in the home page
    And He clicks the sign up button
    And He sees the first registration step
    And He fills the first form step
    And He sees the second registration step
    And He fills the second form step
    And He sees the third registration step
    And He fills the third form step
    And He sees the fourth registration step
    When He fills the fourth form step
    Then he sees the welcome message page
