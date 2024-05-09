package arquiteturas.orientacaoObjeto.classesAbstratas;

/**
 * Exemplo de classes abstratas em Java. Uma classe abstrata é uma classe que
 * não pode ser instanciada e é usada apenas como modelo para outras classes.
 * Pode conter métodos abstratos (sem implementação) e métodos concretos (com
 * implementação).
 */

//Classe principal para demonstrar o uso de classes abstratas
public class ClassesAbstratasExemplo {
	public static void main(String[] args) {
		// Criando instâncias das subclasses
		Forma circulo = new Circulo(5);
		Forma retangulo = new Retangulo(4, 6);

		// Chamando métodos das subclasses
		circulo.exibirInformacoes();
		System.out.println("Área do círculo: " + circulo.calcularArea());

		retangulo.exibirInformacoes();
		System.out.println("Área do retângulo: " + retangulo.calcularArea());
	}
}
