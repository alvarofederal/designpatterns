package arquiteturas.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

//Classe Observável
class Observable {
	private List<Observer> observers = new ArrayList<>();

	// Método para adicionar Observadores
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// Método para remover Observadores
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	// Método para notificar Observadores
	public void notifyObservers(String message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	// Método que representa uma mudança de estado e notifica Observadores
	public void stateChanged() {
		// Simulação de mudança de estado
		String message = "O estado do objeto mudou.";

		// Notificar Observadores
		notifyObservers(message);
	}
}
