package net.serenitybdd.tutorials.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.tutorials.questions.TheTodoItems;
import net.serenitybdd.tutorials.tasks.AddATodoItem;
import net.serenitybdd.tutorials.tasks.StartWith;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

public class AddItemsStepDefinitions {

    Actor actor;

    @Managed
    public WebDriver hisBrowser;

    private String added;


    @Given("{word} was able to start with an empty todo list")
    public void wasAbleToStartWithAnyEmptyTodoList(String actorName) {
        actor = Actor.named(actorName);
        actor.can(BrowseTheWeb.with(hisBrowser));
        actor.wasAbleTo(StartWith.anEmptyTodoList());
    }

    @When("^.* attempts to add a todo item called (.*)$")
    public void attemptsToAddATodoItemCalled(String todoItem) {
        actor.attemptsTo(AddATodoItem.called(todoItem));
        added = todoItem;
    }

    @Then("^.* should see that todo list displays the item added$")
    public void shouldSeeThatTodoListDisplaysTheItemAdded() {
        actor.should(seeThat(TheTodoItems.displayed(), hasItem(added)));
    }

}
