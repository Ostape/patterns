package com.robosh.composite;

public class Plus extends Expression {

    public Plus(MathOperation leftExpression, MathOperation rightExpression) {
        super(leftExpression, rightExpression);
    }

    public int executeOperation() {
        return leftExpression.executeOperation() + rightExpression.executeOperation();
    }
}
