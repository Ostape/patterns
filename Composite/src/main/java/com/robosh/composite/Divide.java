package com.robosh.composite;

public class Divide extends Expression {

    public Divide(MathOperation leftExpression, MathOperation rightExpression) {
        super(leftExpression, rightExpression);
    }

    public int executeOperation() {
        return leftExpression.executeOperation() / rightExpression.executeOperation();
    }
}

