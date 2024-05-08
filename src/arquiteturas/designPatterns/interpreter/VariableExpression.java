package arquiteturas.designPatterns.interpreter;

import java.util.Map;

//Vamos criar algumas classes concretas que implementam a interface Expression para representar diferentes tipos de expressões.

//Expressão terminal que representa uma variável.
class VariableExpression implements Expression {
	private String name;

	public VariableExpression(String name) {
		this.name = name;
	}

	@Override
	public int interpret(Map<String, Integer> context) {
		if (context.containsKey(name)) {
			return context.get(name);
		}
		return 0; // Valor padrão se a variável não estiver definida
	}
}
