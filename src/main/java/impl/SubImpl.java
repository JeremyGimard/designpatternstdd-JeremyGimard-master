package impl;

import contract.Expression;
import contract.Sub;
import contract.Visitor;

final class SubImpl extends BinOpImpl implements Sub {

    SubImpl(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
