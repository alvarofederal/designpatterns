package arquiteturas.orientacaoObjeto.classesAbstratas;

//Subclasse concreta representando um círculo
class Circulo extends Forma {
 private double raio;

 // Construtor
 public Circulo(double raio) {
     this.raio = raio;
 }

 // Implementação do método abstrato para calcular a área do círculo
 @Override
 public double calcularArea() {
     return Math.PI * raio * raio;
 }
}
