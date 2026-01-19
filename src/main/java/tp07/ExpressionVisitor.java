package tp06;

public interface ExpressionVisitor<T> {

    T visitConstante(Constante constante);

    T visitVariable(ExpressionVariable expressionVariable);

    T visitSomme(Somme somme);

    T visitProduit(Produit produit);

    T visitQuotient(Quotient quotient);

    T visitDifference(Difference difference);

    T visitFonction(FonctionExpression fonctionExpression);
    
}
