package arquiteturas.designPatterns.prototype;

//Vamos criar uma classe concreta que implementa a interface Prototype.
class ConcretePrototype implements Prototype {
	private String field;

	// Construtor para inicializar o protótipo.
	public ConcretePrototype(String field) {
		this.field = field;
	}

	// Método para clonar o protótipo.
	@Override
	public Prototype clone() {
		return new ConcretePrototype(this.field);
	}

	// Método para definir o campo do protótipo.
	public void setField(String field) {
		this.field = field;
	}

	// Método para obter o campo do protótipo.
	public String getField() {
		return field;
	}
}
