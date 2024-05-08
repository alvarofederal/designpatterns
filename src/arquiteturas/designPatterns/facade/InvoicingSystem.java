package arquiteturas.designPatterns.facade;

//Subsistema de classes para geração de faturas.
class InvoicingSystem {
	public void generateInvoice(String order, double amount) {
		System.out.println("Generating invoice for order: " + order + ", amount: " + amount);
	}
}
