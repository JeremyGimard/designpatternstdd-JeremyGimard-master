package contract;

/**
 * Modélise une expression acceptant un visiteur.
 */
public interface Expression {
    <T> T accept(Visitor<T> v);
}
