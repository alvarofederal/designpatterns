package arquiteturas.designPatterns.serviceLocator;

import java.util.HashMap;
import java.util.Map;

//Vamos criar um Service Locator que fornece acesso aos serviços.
class ServiceLocator {
	// Mapa que associa nomes de serviços às instâncias dos serviços.
	private static Map<String, Service> services = new HashMap<>();

	// Método para registrar um serviço no Service Locator.
	public static void registerService(String serviceName, Service service) {
		services.put(serviceName, service);
	}

	// Método para obter um serviço com base no nome.
	public static Service getService(String serviceName) {
		return services.get(serviceName);
	}
}
