package tp07;

import java.util.Map;

public class CalculVisitor implements ExpressionVisitor<Double> {
    
    private Map<String, Double> variables;
    
    public CalculVisitor(Map<String, Double> variables) {
        this.variables = variables;
    }
    
    @Override
    public Double visitConstante(Constante constante) {
        return constante.getValeur();
    }
    
    @Override
    public Double visitVariable(ExpressionVariable var) {
        Double val = variables.get(var.getNomVariable());
        if (val == null) {
            throw new IllegalArgumentException("Variable non définie");
        }
        return val;
    }
    
    @Override
    public Double visitSomme(Somme somme) {
        return somme.getGauche().accept(this) + somme.getDroite().accept(this);
    }
    
    @Override
    public Double visitDifference(Difference difference) {
        return difference.getGauche().accept(this) - difference.getDroite().accept(this);
    }
    
    @Override
    public Double visitProduit(Produit produit) {
        return produit.getGauche().accept(this) * produit.getDroite().accept(this);
    }
    
    @Override
    public Double visitQuotient(Quotient quotient) {
        double droite = quotient.getDroite().accept(this);
        if (droite == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return quotient.getGauche().accept(this) / droite;
    }
    
    @Override
    public Double visitFonction(FonctionExpression fe) {
        double arg = fe.getArgument().accept(this);
        return fe.getFonction().evaluer(arg);
    }
}