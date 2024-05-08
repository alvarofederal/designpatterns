package arquiteturas.designPatterns.observer;

/**
 * Exemplo de implementação do padrão Observer. O padrão Observer é usado para
 * definir uma dependência um-para-muitos entre objetos, de modo que quando um
 * objeto muda de estado, todos os seus dependentes são notificados e
 * atualizados automaticamente.
 */

//Exemplo de uso
public class ObserverPatternExample {
	public static void main(String[] args) {
		// Criando um objeto observável
		Observable observable = new Observable();

		// Criando Observadores
		Observer observer1 = new ConcreteObserver("Observer 1");
		Observer observer2 = new ConcreteObserver("Observer 2");

		// Registrando Observadores
		observable.addObserver(observer1);
		observable.addObserver(observer2);

		// Simulando mudança de estado
		observable.stateChanged();

		// Removendo um Observador
		observable.removeObserver(observer1);

		// Simulando outra mudança de estado
		observable.stateChanged();
	}
}

//Neste exemplo, temos a classe Observable, que representa o objeto observável, 
//e a interface Observer, que define o método update para que os observadores sejam notificados. 
//A classe ConcreteObserver implementa a interface Observer e define o comportamento específico para lidar com as notificações.

//Por fim, na classe ObserverPatternExample, é criado um exemplo de uso onde um objeto observável é criado, 
//observadores são registrados, ocorrem mudanças de estado e observadores são notificados.