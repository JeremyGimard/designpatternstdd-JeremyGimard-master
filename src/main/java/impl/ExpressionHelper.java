package impl;

import contract.Constant;
import contract.Expression;
import contract.Var;
import visitors.VisitorEval;

/**
 * Helper pour déteminer certaines caractéristiques spécifiques des expressions.
 * TODO: à implanter (cf. README)
 */
public final class ExpressionHelper {

    private ExpressionHelper() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * L'expression est-elle une constante ?
     * @param e
     * @return
     */
    public static boolean isConstant(Expression e) {
        return false;
    }

    /**
     * L'expression vaut-elle zero ?
     * @param e
     * @return
     */
    public static boolean isZero(Expression e) {
       return false;
    }

    /**
     * L'expression vaut-elle 1 ?
     * @param e
     * @return
     */
    public static boolean isOne(Expression e) {
        return false;
    }

    /**
     * L'expression est-elle une variable ?
     * @param e
     * @return
     */
    public static boolean isVar(Expression e) {
        return false;
    }

    /**
     * L'expression est-elle une addition ?
     * @param e
     * @return
     */
    public static boolean isAdd(Expression e) {
        return false;
    }

    /**
     * L'expression est-elle une soustraction ?
     * @param e
     * @return
     */
    public static boolean isSub(Expression e) {
        return false;
    }
    /**
     * L'expression est-elle une multiplication ?
     * @param e
     * @return
     */
    public static boolean isMult(Expression e) {
        return false;
    }
    /**
     * L'expression est-elle une dvision ?
     * @param e
     * @return
     */
    public static boolean isDiv(Expression e) {
        return false;
    }
}
