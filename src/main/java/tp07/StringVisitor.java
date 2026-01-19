package tp07;

public class StringVisitor implements ExpressionVisitor<String> {
    
    @Override
    public String visitConstante(Constante constante) {
        return String.valueOf(constante.getValeur());
    }
    
    @Override
    public String visitVariable(ExpressionVariable variable) {
        return variable.getNomVariable();
    }
    
    @Override
    public String visitSomme(Somme somme) {
        String gauche = somme.getGauche().accept(this);
        String droite = somme.getDroite().accept(this);
        return "(" + gauche + " + " + droite + ")";
    }
    
    @Override
    public String visitDifference(Difference difference) {
        String gauche = difference.getGauche().accept(this);
        String droite = difference.getDroite().accept(this);
        return "(" + gauche + " - " + droite + ")";
    }
    
    @Override
    public String visitProduit(Produit produit) {
        String gauche = produit.getGauche().accept(this);
        String droite = produit.getDroite().accept(this);
        return "(" + gauche + " * " + droite + ")";
    }
    
    @Override
    public String visitQuotient(Quotient quotient) {
        String gauche = quotient.getGauche().accept(this);
        String droite = quotient.getDroite().accept(this);
        return "(" + gauche + " / " + droite + ")";
    }
    
    @Override
    public String visitFonction(FonctionExpression fe) {
        String argument = fe.getArgument().accept(this);
        return fe.getFonction().getNom() + "(" + argument + ")";
    }
}