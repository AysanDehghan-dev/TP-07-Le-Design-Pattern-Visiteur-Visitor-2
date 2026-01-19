package tp06;

public class ExpressionVariable extends Expression{
    private String nomVariable;


    public ExpressionVariable(String nomVariable) {
        this.nomVariable = nomVariable;
    }

    public String getNomVariable() {
        return nomVariable;
    }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitVariable(this);
    }
}
