package arquiteturas.designPatterns.command;

//Exemplo de uso
public class CommandPatternExample {
	public static void main(String[] args) {
		// Criando o Receiver
		Receiver receiver = new Receiver();

		// Criando o Concrete Command e associando o Receiver a ele
		Command command = new ConcreteCommand(receiver);

		// Criando o Invoker e definindo o comando a ser executado
		Invoker invoker = new Invoker();
		invoker.setCommand(command);

		// Executando o comando
		invoker.executeCommand();
	}
}
