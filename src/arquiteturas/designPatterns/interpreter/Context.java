package arquiteturas.designPatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

//Agora vamos criar uma classe Context que contém informações globais que serão usadas durante a interpretação.

//Classe que contém o contexto das variáveis
class Context {
	Map<String, Integer> variables = new HashMap<>();

	public void setVariable(String name, int value) {
		variables.put(name, value);
	}

	public int getVariable(String name) {
		return variables.getOrDefault(name, 0); // Valor padrão se a variável não estiver definida
	}
}
