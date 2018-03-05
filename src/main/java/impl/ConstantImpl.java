package impl;

import contract.Constant;
import contract.Visitor;

public class ConstantImpl implements Constant {

    private final int value;

    ConstantImpl(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
