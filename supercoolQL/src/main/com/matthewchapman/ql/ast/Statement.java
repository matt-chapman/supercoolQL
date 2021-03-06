package com.matthewchapman.ql.ast;

import com.matthewchapman.ql.visitors.StatementVisitor;

/**
 * Created by matt on 21/02/2017.
 * <p>
 * Base Statement class. All statements derive from this. Implements visitable
 * to allow derived classes to be visited.
 */
public abstract class Statement extends TreeNode {

    public abstract <T, C> T accept(StatementVisitor<T, C> visitor, C context);

    public abstract String getName();
}
