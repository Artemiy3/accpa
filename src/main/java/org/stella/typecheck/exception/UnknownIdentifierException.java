package org.stella.typecheck.exception;

public class UnknownIdentifierException extends TypeCheckException {
    protected UnknownIdentifierException(String message) {
        super(message);
    }

    public static UnknownIdentifierException unknownVariable(String identifier, String functionName) {
        return new UnknownIdentifierException("Unknown variable identifier \"" + identifier + "\" in function \"" + functionName + "\".");
    }
}
