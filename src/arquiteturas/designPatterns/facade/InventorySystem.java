package arquiteturas.designPatterns.facade;

//Subsistema de classes para o gerenciamento de estoque.
class InventorySystem {
	public void updateInventory(String product, int quantity) {
		System.out.println("Updating inventory for product: " + product + ", quantity: " + quantity);
	}
}
