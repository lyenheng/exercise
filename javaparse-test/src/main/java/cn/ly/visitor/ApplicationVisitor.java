package cn.ly.visitor;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ApplicationVisitor extends VoidVisitorAdapter {
    @Override
    public void visit(MethodDeclaration n, Object arg) {

        super.visit(n, arg);
    }
}
