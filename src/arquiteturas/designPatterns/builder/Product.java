package arquiteturas.designPatterns.builder;

/*
O padrão Builder é usado para construir objetos complexos passo a passo. 
Ele permite que você crie diferentes tipos e representações de um objeto 
usando o mesmo código de construção. Isso é útil quando um objeto possui 
muitos atributos opcionais ou quando a criação direta de um objeto requer 
muitos parâmetros. O padrão Builder separa a construção de um objeto de 
sua representação, permitindo que o mesmo processo de construção crie diferentes 
representações do objeto.
*/

//Classe do produto que será construído
class Product {
private String part1;
private String part2;
private String part3;

// Métodos para definir partes do produto
public void setPart1(String part1) {
    this.part1 = part1;
}

public void setPart2(String part2) {
    this.part2 = part2;
}

public void setPart3(String part3) {
    this.part3 = part3;
}

// Método para exibir o produto
public void showProduct() {
    System.out.println("Parte 1: " + part1);
    System.out.println("Parte 2: " + part2);
    System.out.println("Parte 3: " + part3);
}
}
