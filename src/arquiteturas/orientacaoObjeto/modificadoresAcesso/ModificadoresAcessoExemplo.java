package arquiteturas.orientacaoObjeto.modificadoresAcesso;

/**
 * Exemplo de modificadores de acesso em Java. Java fornece modificadores de
 * acesso (public, private, protected, default) para controlar a visibilidade de
 * classes, campos e métodos.
 */

// Classe com diferentes modificadores de acesso
public class ModificadoresAcessoExemplo {
	// Campo com modificador de acesso "public"
	public int publico = 10;

	// Campo com modificador de acesso "private"
	private int privado = 20;

	// Campo com modificador de acesso "protected"
	protected int protegido = 30;

	// Campo sem modificador de acesso (modificador "default")
	int padrao = 40;

	// Método com modificador de acesso "public"
	public void metodoPublico() {
		System.out.println("Método público chamado");
	}

	// Método com modificador de acesso "private"
	private void metodoPrivado() {
		System.out.println("Método privado chamado");
	}

	// Método com modificador de acesso "protected"
	protected void metodoProtegido() {
		System.out.println("Método protegido chamado");
	}

	// Método sem modificador de acesso (modificador "default")
	void metodoPadrao() {
		System.out.println("Método padrão chamado");
	}

	// Método main para execução da classe
	public static void main(String[] args) {
		ModificadoresAcessoExemplo exemplo = new ModificadoresAcessoExemplo();

		// Acessando os membros da classe
		System.out.println("Campo público: " + exemplo.publico);
		 System.out.println("Campo privado: " + exemplo.privado); // Erro: privado é
		// inacessível
		System.out.println("Campo protegido: " + exemplo.protegido);
		System.out.println("Campo padrão: " + exemplo.padrao);

		exemplo.metodoPublico();
		exemplo.metodoPrivado(); // Erro: método privado é inacessível
		exemplo.metodoProtegido();
		exemplo.metodoPadrao();
	}
}
