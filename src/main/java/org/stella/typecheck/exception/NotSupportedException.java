package org.stella.typecheck.exception;

import org.syntax.stella.Absyn.Expr;
import org.syntax.stella.Absyn.Type;

public class NotSupportedException extends TypeCheckException {
    protected NotSupportedException(String message) {
        super(message);
    }

    public static NotSupportedException unknownExpression(Expr expr) {
        return new NotSupportedException("An expression type is not supported yet: " + expr.getClass().getSimpleName());
    }

    public static NotSupportedException unknownType(Type type) {
        return new NotSupportedException("An expression type is not supported yet: " + type.getClass().getSimpleName());
    }
}
