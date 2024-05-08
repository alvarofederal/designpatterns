package arquiteturas.designPatterns.mediator;

//Vamos criar uma interface para representar o Mediator.
interface Mediator {
	void sendMessage(String message, Colleague colleague);
}
