package net.serenitybdd.tutorials.po.component;

import net.serenitybdd.screenplay.targets.Target;

public class TheTodoList {
    public static Target WHAT_NEEDS_TO_BE_DONE = Target.the("'What needs to be done?' field").locatedBy(".new-todo");
    public static Target ITEMS = Target.the("List of todo items").locatedBy(".view label");
}
