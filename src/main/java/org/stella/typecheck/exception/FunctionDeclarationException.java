package org.stella.typecheck.exception;

import java.util.Optional;

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

    public static FunctionDeclarationException paramNameDuplicate(String paramName, String functionName, boolean isAnonymous) {
        if (isAnonymous)
            return new FunctionDeclarationException("Duplicated name of parameter in anonymous function inside of function \""
                    + functionName + "\": " + paramName);
        else
            return new FunctionDeclarationException("Duplicated name of parameter in function \""
                    + functionName + "\": " + paramName);
    }

    public static FunctionDeclarationException paramNameDuplicatesFunctionName(String paramName, String functionName, boolean isAnonymous) {
        if (isAnonymous)
            return new FunctionDeclarationException("Parameter name duplicates existing function name in anonymous function inside function \""
                    + functionName + "\": " + paramName);
        else
            return new FunctionDeclarationException("Parameter name duplicates existing function name in function \""
                    + functionName + "\": " + paramName);
    }

    public static FunctionDeclarationException noReturnType(String functionName) {
        return new FunctionDeclarationException("Function declaration \"" + functionName + "\" has no return type.");
    }

    public static FunctionDeclarationException illegalParamsCount(String functionName, int paramsCount, boolean isAnonymous) {
        if (isAnonymous)
            return new FunctionDeclarationException(
                    "Illegal count of params in function \"" + functionName +
                            "\". Allowed count of params: 1, found: " + paramsCount
            );
        else
            return new FunctionDeclarationException(
                    "Illegal count of params in anonymous function inside of function \"" + functionName +
                            "\". Allowed count of params: 1, found: " + paramsCount
            );
    }
}
