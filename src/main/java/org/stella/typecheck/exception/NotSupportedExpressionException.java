package org.stella.typecheck.exception;

import org.syntax.stella.Absyn.Expr;

public class NotSupportedExpressionException extends TypeCheckException {
    protected NotSupportedExpressionException(String message) {
        super(message);
    }

    public static NotSupportedExpressionException unknownExpression(Expr expr) {
        return new NotSupportedExpressionException("An expression type is not supported yet: " + expr.getClass().getTypeName());
    }
}
