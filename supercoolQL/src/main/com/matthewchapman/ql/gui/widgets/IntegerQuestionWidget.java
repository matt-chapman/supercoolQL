package com.matthewchapman.ql.gui.widgets;

import com.matthewchapman.ql.ast.statement.Question;
import com.matthewchapman.ql.environment.values.IntegerValue;
import com.matthewchapman.ql.environment.values.Value;
import com.matthewchapman.ql.gui.QuestionChangeObserver;
import javafx.geometry.HPos;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;

/**
 * Created by matt on 22/03/2017.
 */
public class IntegerQuestionWidget extends QuestionWidget {

    private final TextField answer;

    public IntegerQuestionWidget(Question question, Value value, QuestionChangeObserver observer) {
        super(question);

        answer = new TextField();
        answer.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                try {
                    observer.notifyQuestionChanged(super.getQuestionID(), new IntegerValue(Integer.parseInt(answer.getText())));
                } catch (NumberFormatException e) {
                    answer.setText("0");
                }
            }
        });

        answer.setText(value.getValue().toString());
        this.add(answer, 1, 0);
        GridPane.setHalignment(answer, HPos.LEFT);
    }

    @Override
    public void setCalculated() {
        answer.setEditable(false);
        answer.setDisable(false);
    }

    @Override
    public void setFocus() {
        this.answer.requestFocus();
    }
}
