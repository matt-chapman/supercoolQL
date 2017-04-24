package com.matthewchapman.ql.ast.expression.binary;

import com.matthewchapman.ql.ast.Expression;
import com.matthewchapman.ql.visitors.ExpressionVisitor;

/**
 * Created by matt on 24/02/2017.
 * <p>
 * Logical OR class
 */
public class LogicalOr extends BinaryOperation {

    public LogicalOr(Expression left, Expression right, int line, int charPositionInLine) {
        super(left, right);
        this.line = line;
        this.column = charPositionInLine;
    }

    @Override
    public String toString() {
        return "(" + getLeft() + " || " + getRight() + ")";
    }

    @Override
    public <T, C> T accept(ExpressionVisitor<T, C> visitor, C context) {
        return visitor.visit(this, context);
    }
}
