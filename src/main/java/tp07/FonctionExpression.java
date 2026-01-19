package tp07;

import tp07.fonction.Fonction;

public class FonctionExpression extends Expression {
    private Fonction fonction;
    private Expression argument;

    public FonctionExpression(Fonction fonction, Expression argument) {
        this.fonction = fonction;
        this.argument = argument;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public Expression getArgument() {
        return argument;
    }
    
    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitFonction(this);
    }
}
