package org.stella.typecheck.exception;

import org.syntax.stella.Absyn.Type;

public class TypeMismatchException extends TypeCheckException {
    protected TypeMismatchException(String message) {
        super(message);
    }

    public static TypeMismatchException wrongType(String functionName, Type expected, Type actual) {
        return new TypeMismatchException("Type mismatch in function \"" + functionName + "\": expected: " + expected.getClass().getSimpleName() + ", got: " + actual.getClass().getSimpleName());
    }

    public static TypeMismatchException unexpectedAbstraction(String functionName, Type expected) {
        return new TypeMismatchException("Type mismatch in function \"" + functionName + "\": expected: " + expected.getClass().getSimpleName() + ", got: anonymous function");
    }

    public static TypeMismatchException invalidArgumentType(String parentFunctionName, String calledFunctionName, Type expected, Type actual) {
        return new TypeMismatchException("Type mismatch in function \"" + parentFunctionName + "\": calling function \"" + calledFunctionName + "\" with argument of type " + actual.getClass().getSimpleName() + ", but \"" + calledFunctionName + "\" accepts type " + expected.getClass().getSimpleName());
    }
}
