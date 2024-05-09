package arquiteturas.orientacaoObjeto.membrosClasse;

/**
 * Exemplo de membros de classe em Java. Os membros de classe incluem campos
 * (variáveis) e métodos de uma classe. Os campos podem ser estáticos (pertencem
 * à classe) ou de instância (pertencem a cada objeto). Métodos estáticos podem
 * ser chamados sem criar uma instância da classe.
 */

public class MembrosClasseExemplo {
	// Membro de classe: campo estático
	static int contadorEstatico;

	// Membro de classe: campo de instância
	int contadorInstancia;

	// Membro de classe: método estático
	static void metodoEstatico() {
		System.out.println("Método estático sendo chamado...");
	}

	// Membro de classe: método de instância
	void metodoInstancia() {
		System.out.println("Método de instância sendo chamado...");
	}

	public static void main(String[] args) {
		// Chamando membros de classe sem criar instâncias da classe
		MembrosClasseExemplo.metodoEstatico();
		MembrosClasseExemplo.contadorEstatico = 10;

		// Criando instância da classe
		MembrosClasseExemplo objeto = new MembrosClasseExemplo();
		objeto.metodoInstancia();
		objeto.contadorInstancia = 5;
	}
}
