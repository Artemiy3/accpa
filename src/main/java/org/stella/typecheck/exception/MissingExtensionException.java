package org.stella.typecheck.exception;

import org.syntax.stella.Absyn.Type;

public class MissingExtensionException extends TypeCheckException {

    protected MissingExtensionException(String message) {
        super(message);
    }

    public static MissingExtensionException noExtensionForType(String functionName, String requiredExtension, Type type) {
        return new MissingExtensionException("Extension is missing in function \""
                + functionName + "\". For using type "
                + type.getClass().getSimpleName() + " extension \""
                + requiredExtension + "\" is required.");
    }
}
