package arquiteturas.designPatterns.facade;

/**
 * Exemplo de implementação do padrão Facade.
 * O padrão Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema.
 * Ele define uma interface de nível mais alto que facilita o uso do subsistema, ocultando sua complexidade subjacente.
 */

//Agora vamos criar uma classe de exemplo para demonstrar como usar o padrão Facade.

public class FacadePatternExample {
 public static void main(String[] args) {
     // Criando a fachada do sistema de processamento de pedidos
     OrderProcessingFacade facade = new OrderProcessingFacade();

     // Usando a fachada para fazer um pedido
     facade.placeOrder("Product A", 10, 500.00);
 }
}
