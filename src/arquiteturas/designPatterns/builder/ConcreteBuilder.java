package arquiteturas.designPatterns.builder;

//Builder concreto para construir um produto específico
class ConcreteBuilder implements Builder {
 private Product product;

 public ConcreteBuilder() {
     this.product = new Product();
 }

 @Override
 public void buildPart1() {
     product.setPart1("Parte 1 construída");
 }

 @Override
 public void buildPart2() {
     product.setPart2("Parte 2 construída");
 }

 @Override
 public void buildPart3() {
     product.setPart3("Parte 3 construída");
 }

 @Override
 public Product getResult() {
     return product;
 }
}
