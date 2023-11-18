package org.stella.typecheck.exception;

public class FunctionDeclarationException extends TypeCheckException {

    protected FunctionDeclarationException(String message) {
        super(message);
    }

    public static FunctionDeclarationException noMainMethod() {
        return new FunctionDeclarationException("No main method");
    }

    public static FunctionDeclarationException functionNameDuplicate(String functionName) {
        return new FunctionDeclarationException("Duplicate function name: " + functionName);
    }
}
