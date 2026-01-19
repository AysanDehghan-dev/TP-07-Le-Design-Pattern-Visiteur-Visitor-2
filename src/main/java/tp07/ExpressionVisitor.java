package tp07;

public interface ExpressionVisitor<T> {
    T visitConstante(Constante constante);
    T visitVariable(ExpressionVariable variable);
    T visitSomme(Somme somme);
    T visitDifference(Difference difference);
    T visitProduit(Produit produit);
    T visitQuotient(Quotient quotient);
    T visitFonction(FonctionExpression fonction);
}