package com.matthewchapman.ql.ast.expression;

import com.matthewchapman.ql.ast.Expression;
import com.matthewchapman.ql.visitor.QLExpressionVisitor;

/**
 * Created by matt on 24/02/2017.
 * <p>
 * Contains multiple expressions to be evaluated in one block and return a single result
 */

public class ParameterGroup extends Expression {

    private final Expression expression;

    public ParameterGroup(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String toString() {
        return expression.toString();
    }

    @Override
    public <T, C> T accept(QLExpressionVisitor<T, C> visitor, C context) {
        return visitor.visit(this, context);
    }
}
