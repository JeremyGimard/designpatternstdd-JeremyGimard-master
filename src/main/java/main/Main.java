package main;

import contract.Expression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import exemples.ExpressionExemples;
import visitors.VisitorEval;
import visitors.VisitorPrettyPrint;
import visitors.VisitorSimplify;

import java.util.HashMap;
import java.util.Map;

/**
 * Ceci n'est pas une vraie classe de test...
 */
public final class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class.getCanonicalName());

    public static void main(String[] args) {
        VisitorPrettyPrint vp1 = new VisitorPrettyPrint();
        Expression e1 = ExpressionExemples.expression1();
        Expression e2 = ExpressionExemples.expression2();
        String s1 = e1.accept(vp1);
        String s2 = e2.accept(vp1);
        LOGGER.info("Expression S1: {}", s1);
        LOGGER.info("Expression S2: {}", s2);


        Map<String, Integer> values = new HashMap<>();
        values.put("x", 3);
        values.put("y", 2);
        VisitorEval ve = new VisitorEval(values);
        int v1 = e1.accept(ve);
        int v2 = e2.accept(ve);
        Expression e3 = ExpressionExemples.expression3();
        int v3 = e3.accept(ve);
        LOGGER.info("Evaluation de Expression S1: {}", v1);
        LOGGER.info("Evaluation de Expression S2: {}", v2);
        LOGGER.info("Evaluation de Expression S3: {}", v3);

        Expression e5 = ExpressionExemples.expression5();
        Expression e6 = ExpressionExemples.expression6();
        VisitorSimplify vs = new VisitorSimplify();
        Expression simp5 = e5.accept(vs);
        Expression simp6 = e6.accept(vs);
        LOGGER.info("Expression S5 simplifiée: {}", simp5.accept(vp1));
        LOGGER.info("Expression S6 simplifiée: {}", simp6.accept(vp1));
    }
}
