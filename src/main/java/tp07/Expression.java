package tp07;

public abstract class Expression {
    public abstract <T> T accept(ExpressionVisitor<T> visitor);
}