package arquiteturas.designPatterns.strategy;

/**
 * Exemplo de implementação do padrão Strategy. O padrão Strategy é usado para
 * definir uma família de algoritmos, encapsular cada um deles e torná-los
 * intercambiáveis. Isso permite que o algoritmo varie independentemente dos
 * clientes que o utilizam.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Strategy.
public class StrategyPatternExample {
	public static void main(String[] args) {
		// Criando um contexto
		Context context = new Context();

		// Definindo e executando a primeira estratégia
		context.setStrategy(new ConcreteStrategy1());
		context.executeStrategy();

		// Definindo e executando a segunda estratégia
		context.setStrategy(new ConcreteStrategy2());
		context.executeStrategy();
	}
}
