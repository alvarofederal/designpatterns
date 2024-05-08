package arquiteturas.designPatterns.state;

/**
 * Exemplo de implementação do padrão State.
 * O padrão State é usado para permitir que um objeto altere seu comportamento quando o seu estado interno muda.
 * Isso é feito através da definição de classes que representam os diferentes estados e permitindo que o objeto
 * troque de estado dinamicamente.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão State.
public class StatePatternExample {
	public static void main(String[] args) {
		// Criando um contexto
		Context context = new Context();

		// Definindo o estado inicial
		context.setState(new ConcreteStateA());

		// Executando uma operação com base no estado atual
		context.request();

		// Mudando dinamicamente o estado
		context.setState(new ConcreteStateB());

		// Executando a mesma operação com base no novo estado
		context.request();
	}
}
