package arquiteturas.orientacaoObjeto.heranca;

/**
 * Exemplo de herança em Java.
 * A herança é o princípio que permite que uma classe (subclasse) herde comportamentos e estados de outra classe (superclasse).
 * Em Java, a herança é implementada usando a palavra-chave extends.
 */

// Classe principal para demonstrar a herança
public class HerancaExemplo {
    public static void main(String[] args) {
        // Criando uma instância da subclasse Cachorro
        Cachorro cachorro = new Cachorro();

        // Chamando métodos da superclasse Animal
        cachorro.comer();

        // Chamando método da subclasse Cachorro
        cachorro.latir();
    }
}
