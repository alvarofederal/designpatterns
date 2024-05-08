package arquiteturas.designPatterns.adapter;

//Exemplo de uso
public class AdapterPatternExample {
	public static void main(String[] args) {
		// Criando um objeto alvo
		Target target = new Target();

		// Criando um adaptador e passando o objeto alvo a ser adaptado
		Adapter adapter = new AdapterImpl(target);

		// Chamando o método específico do adaptador
		adapter.specificRequest();
	}
	// Aqui dentro da classe de exemplo está a explicação do padrão Adapter.
	/*
	 * O padrão Adapter é útil quando temos uma classe (alvo) com uma interface que
	 * precisamos usar, mas a interface dessa classe não é compatível com a
	 * interface que precisamos seguir. O adaptador atua como uma ponte entre o
	 * cliente e a classe alvo, convertendo a interface do adaptador em uma
	 * interface que o cliente espera. Neste exemplo, a classe Target representa a
	 * classe com a interface que não podemos alterar, e o AdapterImpl é o adaptador
	 * que implementa a interface que precisamos usar e delega as chamadas para a
	 * classe alvo. Dessa forma, o cliente pode interagir com o adaptador usando sua
	 * interface, e o adaptador faz a tradução necessária para a classe alvo.
	 */
}
