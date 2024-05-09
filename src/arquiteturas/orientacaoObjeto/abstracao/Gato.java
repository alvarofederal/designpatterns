package arquiteturas.orientacaoObjeto.abstracao;

//Implementação concreta de um mamífero: Gato
class Gato extends Mamifero {
	// Implementação do método emitirSom para um gato
	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}
}