package arquiteturas.designPatterns.memento;

//Vamos criar uma classe que representa o Memento, ou seja, o estado a ser armazenado.
class Memento {
 private String state;

 // Construtor para criar um memento com um determinado estado.
 public Memento(String state) {
     this.state = state;
 }

 // Método para obter o estado armazenado no memento.
 public String getState() {
     return state;
 }
}