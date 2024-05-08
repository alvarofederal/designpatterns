package arquiteturas.designPatterns.interpreter;

/**
 * Exemplo de implementação do padrão Interpreter.
 * O padrão Interpreter é usado para interpretar uma expressão em uma linguagem específica.
 * Ele fornece uma maneira de avaliar sentenças em uma linguagem definida.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Interpreter.
public class InterpreterPatternExample {
	public static void main(String[] args) {
		// Criando um contexto e definindo variáveis
		Context context = new Context();
		context.setVariable("x", 5);
		context.setVariable("y", 10);

		// Criando expressões
		Expression expression = new AddExpression(new VariableExpression("x"), new VariableExpression("y"));

		// Interpretando a expressão com base no contexto
		int result = expression.interpret(context.variables);
		System.out.println("Result: " + result);
	}
}
