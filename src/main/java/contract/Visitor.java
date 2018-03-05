package contract;

/**
 * Modélise un visiteur paramétré par un type de donnée T.
 * @param <T>
 */
public interface Visitor<T> {
    T visit(Constant c);
    T visit(Add e);
    T visit(Div e);
    T visit(Mult e);
    T visit(Sub e);
    T visit(Var v);
}
