package arquiteturas.designPatterns.interpreter;

import java.util.Map;

//Expressão não terminal que representa uma adição de duas expressões.
class AddExpression implements Expression {
	private Expression left;
	private Expression right;

	public AddExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Map<String, Integer> context) {
		return left.interpret(context) + right.interpret(context);
	}
}
