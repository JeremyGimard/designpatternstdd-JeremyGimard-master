package visitors;

import contract.*;

import java.util.Map;


/**
 * Visiteur pour évaluer les expressions arithmétiques, dans un environnement.
 * TODO: à implanter (cf. README)
 */
public final class VisitorEval implements Visitor<Integer> {

    private final Map<String, Integer> env;

    public VisitorEval(Map<String, Integer> env) {
        this.env = env;
    }

    @Override
    public Integer visit(Constant c) {
        return null;
    }

    @Override
    public Integer visit(Add e) {
        return null;
    }

    @Override
    public Integer visit(Div e) {

        return null;
    }

    @Override
    public Integer visit(Mult e) {
        return null;
    }

    @Override
    public Integer visit(Sub e) {
        return null;
    }

    @Override
    public Integer visit(Var v) {
        return null;
    }

}
