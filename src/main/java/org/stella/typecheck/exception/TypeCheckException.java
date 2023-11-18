package org.stella.typecheck.exception;

public abstract class TypeCheckException extends Exception {
    protected TypeCheckException(String message) {
        super(message);
    }
}
