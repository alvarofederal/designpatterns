package arquiteturas.orientacaoObjeto.classesAbstratas;

//Subclasse concreta representando um retângulo
class Retangulo extends Forma {
	private double comprimento;
	private double largura;

	// Construtor
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	// Implementação do método abstrato para calcular a área do retângulo
	@Override
	public double calcularArea() {
		return comprimento * largura;
	}
}
