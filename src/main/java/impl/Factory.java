package impl;

import contract.Expression;

public final class Factory {

    public static final Factory INSTANCE = new Factory();

    public Expression newConstant(int value){ return new ConstantImpl(value);}


    public Expression newAdd(Expression left, Expression right) {
        return new AddImpl(left, right);
    }

    public Expression newSub(Expression left, Expression right) {
        return new SubImpl(left, right);
    }

    public Expression newMult(Expression left, Expression right) {
        return new MultImpl(left, right);
    }

    public Expression newDiv(Expression left, Expression right) {
        return new DivImpl(left, right);
    }

    public Expression newVar(String s) {
        return new VarImpl(s);
    }
}
