package net.serenitybdd.tutorials.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.tutorials.po.component.TheTodoList;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class AddATodoItem implements Task {

    private final String itemName;

    @Step("{0} adds an item called '#itemName'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(itemName).into(TheTodoList.WHAT_NEEDS_TO_BE_DONE)
                        .thenHit(Keys.RETURN)
        );
    }

    public AddATodoItem(String itemName) {
        this.itemName = itemName;
    }

    public static Task called(String itemName) {
        return Instrumented.instanceOf(AddATodoItem.class).withProperties(itemName);
    }
}
