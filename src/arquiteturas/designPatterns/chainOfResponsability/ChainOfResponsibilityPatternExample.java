package arquiteturas.designPatterns.chainOfResponsability;

/*
O padrão Chain of Responsibility é usado para passar uma solicitação 
ao longo de uma cadeia de manipuladores. Cada manipulador decide se 
processa a solicitação ou a passa para o próximo manipulador na cadeia. 
Isso permite que vários objetos tenham a oportunidade de processar a 
solicitação sem o cliente saber qual objeto realmente a processou. 
O padrão Chain of Responsibility promove o desacoplamento do remetente 
de uma solicitação de seu receptor, permitindo que vários objetos 
recebam a solicitação e possam lidar com ela de maneira independente.
*/


//Exemplo de uso
public class ChainOfResponsibilityPatternExample {
	public static void main(String[] args) {
		// Criando os manipuladores
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		Handler handler3 = new ConcreteHandler();

		// Configurando a cadeia de responsabilidade
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);

		// Criando uma solicitação
		Request request = new Request();

		// Enviando a solicitação para o primeiro manipulador na cadeia
		handler1.handleRequest(request);
	}
}
