Feature: As a user I want to get calculation results using Calculator

  @calculate
  Scenario: Summarize two ints
    Given first int is 10 and second int is 12 for summarize
    Then summarize result will be 22

  @calculate
  Scenario: Multiply two ints
    Given first int is 10 and second int is 12 for multiply
    Then multiply result will be 120