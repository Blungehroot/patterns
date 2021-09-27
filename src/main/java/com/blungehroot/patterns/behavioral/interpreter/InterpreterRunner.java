package com.blungehroot.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJs = getJsDeveloperExpr();
        Expression isNode = getJsNodeDeveloperExpr();

        System.out.println("Does is dev knows Js react: " + isJs.interpret("js react"));
        System.out.println("Does is dev knows Js node: " + isNode.interpret("js node"));
    }

    public static Expression getJsDeveloperExpr() {
        Expression js = new TerminalExpression("js");
        Expression reactJs = new TerminalExpression("react");

        return new OrExpression(js, reactJs);
    }

    public static Expression getJsNodeDeveloperExpr() {
        Expression js = new TerminalExpression("js");
        Expression nodeJs = new TerminalExpression("node");

        return new AndExpression(js, nodeJs);
    }
}
