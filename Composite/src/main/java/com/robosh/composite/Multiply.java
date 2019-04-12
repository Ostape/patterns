package com.robosh.composite;

public class Multiply extends Expression {

    public Multiply(MathOperation leftExpression, MathOperation rightExpression) {
        super(leftExpression, rightExpression);
    }

    public int executeOperation() {

        return leftExpression.executeOperation() * rightExpression.executeOperation();
    }
}
