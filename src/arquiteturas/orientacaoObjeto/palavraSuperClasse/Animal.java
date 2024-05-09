package arquiteturas.orientacaoObjeto.palavraSuperClasse;

//Classe base ou superclasse
class Animal {
 String tipo;

 // Construtor da classe Animal
 public Animal(String tipo) {
     this.tipo = tipo;
 }

 // Método da classe Animal
 public void emitirSom() {
     System.out.println("Som genérico de animal");
 }
}
