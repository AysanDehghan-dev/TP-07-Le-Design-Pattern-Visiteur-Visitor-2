package tp07;

public class Somme extends Expression {

    private Expression droite, gauche;


    public Somme(Expression gauche, Expression droite) {
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
        return visitor.visitSomme(this);
    }
    

    
}
