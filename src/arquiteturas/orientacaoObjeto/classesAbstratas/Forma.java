package arquiteturas.orientacaoObjeto.classesAbstratas;

//Classe abstrata representando uma forma geométrica
abstract class Forma {
	// Método abstrato para calcular a área da forma
	public abstract double calcularArea();

	// Método concreto para exibir informações da forma
	public void exibirInformacoes() {
		System.out.println("Esta é uma forma geométrica.");
	}
}
