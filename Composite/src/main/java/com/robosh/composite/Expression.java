package com.robosh.composite;

public abstract class Expression implements MathOperation {
    protected MathOperation leftExpression;
    protected MathOperation rightExpression;

    public Expression(MathOperation leftExpression, MathOperation rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public MathOperation getLeftExpression() {
        return leftExpression;
    }

    public MathOperation getRightExpression() {
        return rightExpression;
    }
}
