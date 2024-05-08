package arquiteturas.designPatterns.mediator;

/**
 * Exemplo de implementação do padrão Mediator.
 * O padrão Mediator é usado para centralizar a comunicação entre objetos de um sistema,
 * promovendo o baixo acoplamento e facilitando a manutenção e extensibilidade do sistema.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Mediator.
public class MediatorPatternExample {
	public static void main(String[] args) {
		// Criando um mediador
		Mediator mediator = new ConcreteMediator();

		// Criando colegas e registrando-os no mediador
		Colleague colleagueA = new ConcreteColleagueA(mediator);
		Colleague colleagueB = new ConcreteColleagueB(mediator);
		((ConcreteMediator) mediator).register(colleagueA);
		((ConcreteMediator) mediator).register(colleagueB);

		// Enviando mensagens entre colegas através do mediador
		colleagueA.sendMessage("Hello from colleague A!");
		colleagueB.sendMessage("Hi from colleague B!");
	}
}
