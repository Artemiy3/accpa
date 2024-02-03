package org.stella.typecheck;

import org.stella.typecheck.exception.TypeCheckException;
import org.syntax.stella.Absyn.*;
import org.stella.typecheck.VisitTypeCheck;

import java.util.Optional;

public class TypeCheck {
    public static void typecheckProgram(Program program) throws Exception {
        VisitTypeCheck v = new VisitTypeCheck();
        Optional<TypeCheckException> result = program.accept(v.new ProgramVisitor<>(), null /* initial context information*/);

        if (result.isPresent())
            throw result.get();
    }
}
