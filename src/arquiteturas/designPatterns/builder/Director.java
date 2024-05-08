package arquiteturas.designPatterns.builder;

//Diretor para supervisionar o processo de construção
class Director {
 private Builder builder;

 public Director(Builder builder) {
     this.builder = builder;
 }

 // Método para construir um produto usando o Builder fornecido
 public void construct() {
     builder.buildPart1();
     builder.buildPart2();
     builder.buildPart3();
 }
}
