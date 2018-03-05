package impl;

import contract.Var;
import contract.Visitor;

final class VarImpl implements Var {
    private final String name;

    VarImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }

}
