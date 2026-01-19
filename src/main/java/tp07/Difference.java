package tp06;

public class Difference extends Expression{
    private Expression gauche, droite;


    public Difference(Expression gauche, Expression droite) {
        this.gauche = gauche;
        this.droite = droite;
    }


    public Expression getDroite() {
        return droite;
    }

    public Expression getGauche() {
        return gauche;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitDifference(this);
    }

}
