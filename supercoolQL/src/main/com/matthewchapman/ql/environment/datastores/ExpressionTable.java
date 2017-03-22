package com.matthewchapman.ql.environment.datastores;

import com.matthewchapman.ql.ast.Expression;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matt on 20/03/2017.
 */
public class ExpressionTable {

    private final Map<String, Expression> expressions;

    public ExpressionTable() {
        expressions = new HashMap<>();
    }

    public void addExpression(String name, Expression expression) {
        expressions.put(name, expression);
    }

}
