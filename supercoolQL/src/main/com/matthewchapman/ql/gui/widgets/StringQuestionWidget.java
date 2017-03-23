package com.matthewchapman.ql.gui.widgets;

import com.matthewchapman.ql.ast.statement.Question;
import com.matthewchapman.ql.environment.values.StringValue;
import com.matthewchapman.ql.environment.values.Value;
import com.matthewchapman.ql.gui.QuestionChangeObserver;
import javafx.geometry.HPos;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;

/**
 * Created by matt on 22/03/2017.
 */
public class StringQuestionWidget extends QuestionWidget {

    public StringQuestionWidget(Question question, Value value, QuestionChangeObserver observer) {
        super(question, value, observer);

        TextField answer = new TextField();
        answer.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.ENTER) {
                observer.notifyQuestionChanged(super.getQuestionID(), new StringValue(answer.getText()));
            }
        });

        answer.setText(value.getValue().toString());
        this.add(answer, 1, 0);
        GridPane.setHalignment(answer, HPos.LEFT);
    }
}
