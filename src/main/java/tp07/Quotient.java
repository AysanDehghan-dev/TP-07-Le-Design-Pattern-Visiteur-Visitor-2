package tp06;

public class Quotient extends Expression {
    private Expression droite, gauche;


    public Quotient(Expression gauche, Expression droite) {
        this.droite = droite;
        this.gauche = gauche;
    }

    public Expression getDroite() {
        return droite;
    }

    public Expression getGauche() {
        return gauche;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitQuotient(this);
    }
}
