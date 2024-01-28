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
}
