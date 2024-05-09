package arquiteturas.orientacaoObjeto.polimorfismo;

//Subclasse 1
class Cachorro extends Animal {
 // Sobrescrita do método emitirSom da superclasse
 @Override
 public void emitirSom() {
     System.out.println("Au au!");
 }
}
