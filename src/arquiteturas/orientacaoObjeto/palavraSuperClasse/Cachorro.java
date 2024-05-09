package arquiteturas.orientacaoObjeto.palavraSuperClasse;

//Subclasse que estende a classe Animal
class Cachorro extends Animal {
	String raca;

	// Construtor da classe Cachorro
	public Cachorro(String tipo, String raca) {
		// Chamada ao construtor da superclasse usando "super"
		super(tipo);
		this.raca = raca;
	}

	// Método da subclasse Cachorro
	public void emitirSom() {
		// Chamada ao método da superclasse usando "super"
		super.emitirSom();
		System.out.println("Au au!");
	}
}