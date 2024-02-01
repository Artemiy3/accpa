package org.stella.typecheck.exception;

public class IllegalExpressionException extends TypeCheckException {
    protected IllegalExpressionException(String message) {
        super(message);
    }

    public static IllegalExpressionException nonZeroInteger(String functionName) {
        return new IllegalExpressionException("Non-zero integer is found in function \"" + functionName + "\"");
    }

    public static IllegalExpressionException paramsToNonFunction(String functionName, String identifier) {
        return new IllegalExpressionException("Passing params to a variable \"" + identifier + "\", which is not a function. Location: function \"" + functionName + "\"");
    }

    public static IllegalExpressionException pairOutOfBounds(String functionName, int number) {
        return new IllegalExpressionException("Calling a pair member with a number out of bounds. Pairs only support indexes from 1 to 2, but got a call with number " + number + ". Location: function \"" + functionName + "\"");
    }

    public static IllegalExpressionException nonTupleDotCall(String functionName) {
        return new IllegalExpressionException("Calling a tuple dot for a non-tuple value. Location: function \"" + functionName + "\"");
    }

    public static IllegalExpressionException illegalTupleParamsCount(String functionName, int paramsCount) {
        return new IllegalExpressionException("Found a tuple with " + paramsCount + " params, but only pairs with 2 params are allowed. Location: function \"" + functionName + "\"");
    }
}
