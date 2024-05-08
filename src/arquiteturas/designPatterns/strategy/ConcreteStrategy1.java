package arquiteturas.designPatterns.strategy;

//Algoritmo 1
class ConcreteStrategy1 implements Strategy {
	@Override
	public void execute() {
		System.out.println("Executando a estratégia 1.");
	}
}
