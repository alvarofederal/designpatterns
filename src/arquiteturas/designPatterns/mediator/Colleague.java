package arquiteturas.designPatterns.mediator;

//Vamos criar uma interface para representar os colegas que interagem entre si.
interface Colleague {
	void sendMessage(String message);

	void receiveMessage(String message);
}
