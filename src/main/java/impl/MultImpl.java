package impl;

import contract.Expression;
import contract.Mult;
import contract.Visitor;

final class MultImpl extends BinOpImpl implements Mult {
    MultImpl(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
