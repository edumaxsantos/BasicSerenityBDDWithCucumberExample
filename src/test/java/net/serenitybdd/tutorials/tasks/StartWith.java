package net.serenitybdd.tutorials.tasks;


import net.serenitybdd.core.steps.Instrumented;
import org.assertj.core.util.Lists;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartWith {

    public static StartWithAnEmptyList anEmptyTodoList() {
        return instrumented(StartWithAnEmptyList.class);
    }

    public static StartWithATodoListContaining aTodoListContaining(String... todos) {
        return Instrumented.instanceOf(StartWithATodoListContaining.class).withProperties(Lists.list(todos));
    }


}
