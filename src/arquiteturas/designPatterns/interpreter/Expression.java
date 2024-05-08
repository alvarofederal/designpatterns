package arquiteturas.designPatterns.interpreter;

import java.util.Map;

//Vamos começar com a interface Expression que define o contrato para as expressões interpretadas.
interface Expression {
	int interpret(Map<String, Integer> context);
}
