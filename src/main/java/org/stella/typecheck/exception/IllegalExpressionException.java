package org.stella.typecheck.exception;

public class IllegalExpressionException extends TypeCheckException {
    protected IllegalExpressionException(String message) {
        super(message);
    }

    public static IllegalExpressionException nonZeroInteger(String functionName) {
        return new IllegalExpressionException("Non-zero integer is found in function \"" + functionName + "\"");
    }
}
