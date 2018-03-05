package impl;

import contract.Add;
import contract.Expression;
import contract.Visitor;

final class AddImpl extends BinOpImpl implements Add {

    AddImpl(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
