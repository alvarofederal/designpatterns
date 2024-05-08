package arquiteturas.designPatterns.brigde;

//Exemplo de uso
public class BridgePatternExample {
	public static void main(String[] args) {
		// Criando implementações
		Implementor implementorA = new ConcreteImplementorA();
		Implementor implementorB = new ConcreteImplementorB();

		// Criando abstrações refinadas associadas às implementações
		Abstraction abstractionA = new RefinedAbstraction(implementorA);
		Abstraction abstractionB = new RefinedAbstraction(implementorB);

		// Executando operações nas abstrações
		abstractionA.operation();
		abstractionB.operation();
	}
	// Aqui dentro da classe de exemplo está a explicação do padrão Bridge.
	/*
	 * O padrão Bridge é útil quando se deseja separar uma abstração de sua
	 * implementação para que ambas possam variar independentemente. A abstração
	 * define a interface abstrata e mantém uma referência para um objeto
	 * Implementor. As implementações concretas do Implementor fornecem as
	 * funcionalidades reais. Isso permite que você tenha diferentes implementações
	 * de abstrações que podem usar diferentes implementações de Implementor. Neste
	 * exemplo, a interface Implementor define o método operationImpl(), que é
	 * implementado pelas classes ConcreteImplementorA e ConcreteImplementorB. A
	 * classe Abstraction é uma classe abstrata que mantém uma referência para um
	 * objeto Implementor e define o método operation(), que é implementado pela
	 * classe RefinedAbstraction. A classe RefinedAbstraction estende Abstraction e
	 * adiciona uma funcionalidade adicional ao método operation(). No exemplo de
	 * uso, criamos implementações concretas de Implementor (ConcreteImplementorA e
	 * ConcreteImplementorB) e as associamos a abstrações refinadas
	 * (RefinedAbstraction). Em seguida, executamos operações nas abstrações, que
	 * delegam a chamada para as implementações concretas associadas.
	 */
}