package visitors;

import contract.*;

import static impl.Constants.*;

/**
 * Visiteur pour afficher une expression.
 * TODO: à implanter (cf. README)
 */
public final class VisitorPrettyPrint implements Visitor<String> {

    @Override
    public String visit(Constant c) {
        return WS+c+WS;
    }

    @Override
    public String visit(Add e) {
        return LEFT_PAR+WS+e+PLUS+WS+e+RIGHT_PAR;
    }

    @Override
    public String visit(Div e) {
        return LEFT_PAR+e+DIV+e+RIGHT_PAR;
    }

    @Override
    public String visit(Mult e) {
        return LEFT_PAR+e+MULT+e+RIGHT_PAR;
    }

    @Override
    public String visit(Sub e) {
        return LEFT_PAR+e+MINUS+e+RIGHT_PAR;
    }

    @Override
    public String visit(Var v) {
        return WS+v+WS;
    }

}
