package arquiteturas.designPatterns.facade;

//Vamos começar com uma série de classes que compõem o subsistema complexo.

//Subsistema de classes para processamento de pedidos.
class OrderProcessingSystem {
	public void processOrder(String order) {
		System.out.println("Processing order: " + order);
	}
}
