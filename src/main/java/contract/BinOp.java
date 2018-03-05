package contract;

/**
 * Modélise un operateur binaire.
 */
public interface BinOp extends Expression {
    /** Retourne l'expression fille gauche
     *
     * @return l'expression fille gauche
     */
    Expression getLeft();

    /** Retourne l'expression fille droite
     *
     * @return l'expression fille droite
     */
    Expression getRight();
}
