package arquiteturas.orientacaoObjeto.polimorfismo;

//Subclasse 2
class Gato extends Animal {
	// Sobrescrita do método emitirSom da superclasse
	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}
}
