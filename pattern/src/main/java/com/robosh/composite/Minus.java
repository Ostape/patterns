package com.robosh.composite;

public class Minus extends Expression {

    public Minus(MathOperation leftExpression, MathOperation rightExpression) {
        super(leftExpression, rightExpression);
    }

    public int executeOperation() {
        return leftExpression.executeOperation() - rightExpression.executeOperation();
    }
}
