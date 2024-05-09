package arquiteturas.orientacaoObjeto.interfaces;

//Implementação concreta de um cachorro que implementa duas interfaces
class Cachorro implements Animal, Locomovivel {
	// Implementação do método da interface Animal
	@Override
	public void emitirSom() {
		System.out.println("Cachorro está latindo...");
	}

	// Implementação do método da interface Locomovivel
	@Override
	public void locomover() {
		System.out.println("Cachorro está correndo...");
	}
}
