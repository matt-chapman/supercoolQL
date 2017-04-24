package com.matthewchapman.ql.ast;

/**
 * Created by matt on 21/02/2017.
 * <p>
 * Base class for all nodes of the AST, provides no implementation. Exists
 * only for providing a common base for the Antlr visitors to return.
 */

public abstract class TreeNode {

    protected int line;
    protected int column;

    public int getLine() {
        return this.line;
    }

    void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return this.column;
    }

    void setColumn(int column) {
        this.column = column;
    }
}
