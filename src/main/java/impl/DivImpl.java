package impl;

import contract.Div;
import contract.Expression;
import contract.Visitor;

final class DivImpl extends BinOpImpl implements Div {
    DivImpl(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
