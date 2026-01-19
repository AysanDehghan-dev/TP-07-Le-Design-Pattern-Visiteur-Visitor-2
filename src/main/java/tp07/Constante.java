package tp06;

public class Constante extends Expression {
    private double valeur;


    public Constante(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {       
        return visitor.visitConstante(this);
    }

}
