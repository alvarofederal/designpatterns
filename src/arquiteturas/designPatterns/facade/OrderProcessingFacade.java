package arquiteturas.designPatterns.facade;

//Agora vamos criar a classe Facade que oferece uma interface simplificada para usar o subsistema.

class OrderProcessingFacade {
	private OrderProcessingSystem orderProcessingSystem;
	private InventorySystem inventorySystem;
	private InvoicingSystem invoicingSystem;

	public OrderProcessingFacade() {
		this.orderProcessingSystem = new OrderProcessingSystem();
		this.inventorySystem = new InventorySystem();
		this.invoicingSystem = new InvoicingSystem();
	}

	// Método de alto nível que encapsula o processo completo de pedido.
	public void placeOrder(String product, int quantity, double amount) {
		String order = product + " - " + quantity;

		// Processa o pedido
		orderProcessingSystem.processOrder(order);

		// Atualiza o inventário
		inventorySystem.updateInventory(product, quantity);

		// Gera a fatura
		invoicingSystem.generateInvoice(order, amount);
	}
}
