package arquiteturas.designPatterns.serviceLocator;

/**
 * Exemplo de implementação do padrão Service Locator.
 * O padrão Service Locator é usado para encapsular a localização, instância e fornecimento de serviços em um sistema.
 * Isso permite que os clientes localizem e usem serviços sem precisar conhecer a implementação específica de cada serviço.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Service Locator.
public class ServiceLocatorPatternExample {
	public static void main(String[] args) {
		// Registrando serviços no Service Locator
		ServiceLocator.registerService("ServiceA", new ServiceA());
		ServiceLocator.registerService("ServiceB", new ServiceB());

		// Obtendo e executando serviços do Service Locator
		Service serviceA = ServiceLocator.getService("ServiceA");
		serviceA.execute();

		Service serviceB = ServiceLocator.getService("ServiceB");
		serviceB.execute();
	}
}
