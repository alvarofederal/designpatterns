package arquiteturas.designPatterns.singleton;

public class Singleton {
    // Instância estática privada da classe
    private static Singleton instance;

    // Construtor privado para impedir a instanciação direta da classe
    private Singleton() {
        // Construtor privado para evitar a criação de instâncias diretamente
    }

    // Método estático para obter a instância única da classe
    public static Singleton getInstance() {
        // Se a instância ainda não foi criada, cria uma nova
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Método de exemplo da instância
	public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}

