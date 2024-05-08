package arquiteturas.designPatterns.builder;

//Exemplo de uso
public class BuilderPatternExample {
 public static void main(String[] args) {
     // Criando um construtor concreto
     Builder builder = new ConcreteBuilder();

     // Criando um diretor e passando o construtor
     Director director = new Director(builder);

     // Construindo o produto
     director.construct();

     // Obtendo o produto construído
     Product product = builder.getResult();

     // Exibindo o produto
     product.showProduct();
 }
}