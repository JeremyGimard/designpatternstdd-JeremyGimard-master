package exemples;

import contract.Expression;
import sun.jvm.hotspot.oops.Instance;

import static impl.Factory.INSTANCE;

/**
 * TODO: à implanter (cf. README)
 */
public class ExpressionExemples {

    ExpressionExemples() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * ( 2 + 3 ) * 4
     *
     * @return
     */
    public static Expression expression1() {
        return INSTANCE.newMult(INSTANCE.newAdd(INSTANCE.newConstant(2), INSTANCE.newConstant(3)),INSTANCE.newConstant(4));
    }

    /**
     * ( x + 3 ) * ( x * 4 )
     *
     * @return
     */
    public static Expression expression2() {

        return INSTANCE.newMult(INSTANCE.newAdd(INSTANCE.newVar("x"),INSTANCE.newConstant(3)), INSTANCE.newMult(INSTANCE.newVar("x"), INSTANCE.newConstant(4)));
    }

    /**
     * ( x + 10 ) * ( y - 8 )
     *
     * @return
     */
    public static Expression expression3() {

        return INSTANCE.newMult(INSTANCE.newAdd(INSTANCE.newVar("x"),INSTANCE.newConstant(10)),INSTANCE.newSub(INSTANCE.newVar("y"),INSTANCE.newConstant(8)));
    }

    /**
     * ( x * 3 ) / ( y + 15 )
     *
     * @return
     */
    public static Expression expression4() {

        return INSTANCE.newDiv(INSTANCE.newMult(INSTANCE.newVar("x"),INSTANCE.newConstant(3)),INSTANCE.newAdd(INSTANCE.newVar("y"),INSTANCE.newConstant(15)));
    }

    /**
     * ( y + 0 ) / ( x * 1 )
     *
     * @return
     */
    public static Expression expression5() {
        return INSTANCE.newDiv(INSTANCE.newAdd(INSTANCE.newVar("y"),INSTANCE.newConstant(0)),INSTANCE.newMult(INSTANCE.newVar("x"),INSTANCE.newConstant(1)));
    }

    /**
     * ( O / y ) * ( x / 1 )
     *
     * @return
     */
    public static Expression expression6() {

        return INSTANCE.newMult(INSTANCE.newDiv(INSTANCE.newConstant(0),INSTANCE.newVar("y")),INSTANCE.newDiv(INSTANCE.newVar("x"),INSTANCE.newConstant(1)));
    }
}
