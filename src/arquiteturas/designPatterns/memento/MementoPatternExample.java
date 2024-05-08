package arquiteturas.designPatterns.memento;

/**
 * Exemplo de implementação do padrão Memento. O padrão Memento é usado para
 * capturar e armazenar o estado interno de um objeto sem violar o
 * encapsulamento, de modo que o objeto possa ser restaurado posteriormente para
 * esse estado.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Memento.
public class MementoPatternExample {
	public static void main(String[] args) {
		// Criando um originador
		Originator originator = new Originator();

		// Criando um cuidador
		Caretaker caretaker = new Caretaker();

		// Definindo o estado inicial do originador e mostrando-o
		originator.setState("State 1");
		originator.displayState();

		// Salvando o estado atual do originador no cuidador
		caretaker.setMemento(originator.createMemento());

		// Mudando o estado do originador e mostrando-o novamente
		originator.setState("State 2");
		originator.displayState();

		// Restaurando o estado anterior do originador a partir do cuidador e
		// mostrando-o
		originator.restoreFromMemento(caretaker.getMemento());
		originator.displayState();
	}
}
