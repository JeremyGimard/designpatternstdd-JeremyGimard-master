package visitors;

import contract.*;
import static impl.ExpressionHelper.*;
import static impl.Factory.INSTANCE;

/**
 * Visiteur pour simplifier une expression.
 * TODO: à implanter (cf. README)
 */
public final class VisitorSimplify implements Visitor<Expression> {
    @Override
    public Expression visit(Constant c) {
        return null;
    }

    @Override
    public Expression visit(Add e) {
        return null;
    }


    @Override
    public Expression visit(Div e) {
            return null;
    }

    @Override
    public Expression visit(Mult e) {
        return null;
    }

    @Override
    public Expression visit(Sub e) {

        return null;
    }

    @Override
    public Expression visit(Var v) {
        return null;
    }

}
