package arquiteturas.orientacaoObjeto.abstracao;

//Implementação concreta de um mamífero: Cachorro
class Cachorro extends Mamifero {
	// Implementação do método emitirSom para um cachorro
	@Override
	public void emitirSom() {
		System.out.println("Au au!");
	}
}