package tp07;

import tp07.fonction.Cos;

public class Main {
    public static void main(String[] args) {
        Expression expr1 = new Somme(new Constante(2), new ExpressionVariable("x"));
        System.out.println("expr1 (2 + x) créée ✓");
        
        Expression expr2 = new Produit(
            new Somme(new Constante(2), new ExpressionVariable("x")),
            new Constante(5)
        );
        System.out.println("expr2 ((2 + x) * 5) créée ✓");
        
        Expression expr3 = new FonctionExpression(
            new Cos(),
            new Produit(
                new Somme(new Constante(2), new ExpressionVariable("x")),
                new Constante(5)
            )
        );
        System.out.println("expr3 (cos((2 + x) * 5)) créée ✓");
    }
}