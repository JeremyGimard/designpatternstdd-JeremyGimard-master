package impl;

import contract.BinOp;
import contract.Expression;
import contract.Visitor;

public abstract class BinOpImpl implements BinOp {

    private final Expression left;
    private final Expression right;

    BinOpImpl(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression getLeft() {
        return this.left;
    }

    @Override
    public Expression getRight() {
        return this.right;
    }

}
