Feature: Add item to todo list
    As a user named Justin
    I want to be able to see items that I've added to the list

  Scenario: Add an item to an empty list
    Given "Justin" was able to start with an empty todo list
    When  Justin attempts to add a todo item called "Feed the cat"
    Then Justin should see that todo list displays the item added