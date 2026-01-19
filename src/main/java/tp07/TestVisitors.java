package tp07;

import java.util.HashMap;
import java.util.Map;
import tp07.fonction.Cos;

public class TestVisitors {
    public static void main(String[] args) {
        Expression expr1 = new Somme(new Constante(2), new ExpressionVariable("x"));
        Expression expr2 = new Produit(
            new Somme(new Constante(2), new ExpressionVariable("x")),
            new Constante(5)
        );
        Expression expr3 = new FonctionExpression(
            new Cos(),
            new Produit(
                new Somme(new Constante(2), new ExpressionVariable("x")),
                new Constante(5)
            )
        );
        
        StringVisitor stringVisitor = new StringVisitor();
        System.out.println("Affichage expr1: " + expr1.accept(stringVisitor));
        System.out.println("Affichage expr2: " + expr2.accept(stringVisitor));
        System.out.println("Affichage expr3: " + expr3.accept(stringVisitor));
        
        Map<String, Double> variables = new HashMap<>();
        variables.put("x", 1.0);
        CalculVisitor calculVisitor = new CalculVisitor(variables);
        
        System.out.println("\nCalcul expr1 (x=1.0): " + expr1.accept(calculVisitor));
        System.out.println("Calcul expr2 (x=1.0): " + expr2.accept(calculVisitor));
        System.out.println("Calcul expr3 (x=1.0): " + expr3.accept(calculVisitor));
    }
}