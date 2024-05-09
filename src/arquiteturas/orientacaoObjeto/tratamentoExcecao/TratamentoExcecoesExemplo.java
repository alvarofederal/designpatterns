package arquiteturas.orientacaoObjeto.tratamentoExcecao;

/**
 * Exemplo de tratamento de exceções em Java. Java fornece um mecanismo de
 * tratamento de exceções para lidar com erros e condições excepcionais durante
 * a execução de um programa. Isso é feito usando os blocos try, catch, finally.
 */

public class TratamentoExcecoesExemplo {
	public static void main(String[] args) {
		// Exemplo de tratamento de exceção com try-catch
		try {
			int resultado = dividir(10, 0);
			System.out.println("Resultado da divisão: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão por zero: " + e.getMessage());
		} finally {
			System.out.println("Bloco finally sempre é executado, independentemente de exceções.");
		}
	}

	// Método que pode lançar uma exceção
	public static int dividir(int numerador, int denominador) {
		return numerador / denominador;
	}
}
