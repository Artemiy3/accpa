package org.stella.typecheck.exception;

import org.syntax.stella.Absyn.Type;

public class ReturnTypeMismatchException extends TypeMismatchException {
    protected ReturnTypeMismatchException(String message) {
        super(message);
    }

    public static ReturnTypeMismatchException returnTypeMismatch(Type declared, Type actual, String functionName) {
        return new ReturnTypeMismatchException("Return type mismatch in function \"" + functionName +
                "\", expected type: " + declared.getClass().getTypeName() +
                ", actual type: " + actual.getClass().getTypeName());
    }
}
