package arquiteturas.designPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

//Vamos criar uma classe concreta que implementa a interface Mediator.
class ConcreteMediator implements Mediator {
	private List<Colleague> colleagues = new ArrayList<>();

	// Método para registrar um colega no mediador
	public void register(Colleague colleague) {
		colleagues.add(colleague);
	}

	// Método para enviar uma mensagem para todos os colegas, exceto o remetente
	@Override
	public void sendMessage(String message, Colleague sender) {
		for (Colleague colleague : colleagues) {
			if (colleague != sender) {
				colleague.receiveMessage(message);
			}
		}
	}
}
