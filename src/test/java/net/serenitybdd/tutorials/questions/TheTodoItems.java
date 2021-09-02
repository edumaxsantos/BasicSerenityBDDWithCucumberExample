package net.serenitybdd.tutorials.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.tutorials.po.component.TheTodoList;

import java.util.List;

public class TheTodoItems implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(TheTodoList.ITEMS)
                .viewedBy(actor)
                .asList();
    }

    public static Question<List<String>> displayed() {
        return new TheTodoItems();
    }
}
