package arquiteturas.orientacaoObjeto.colecoes;

import java.util.*;

/**
 * Exemplo de uso de coleções em Java.
 * As coleções em Java são estruturas de dados que representam grupos de objetos.
 * Exemplos incluem List, Set, Map, Queue.
 * A API de Coleções em Java fornece uma variedade de classes e interfaces para trabalhar com coleções.
 */

public class ColecoesExemplo {
    public static void main(String[] args) {
        // Exemplo de uso de List
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        System.out.println("Lista: " + lista);

        // Exemplo de uso de Set
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(20); // Elemento duplicado (não adicionado)
        System.out.println("Conjunto: " + conjunto);

        // Exemplo de uso de Map
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);
        System.out.println("Mapa: " + mapa);

        // Exemplo de uso de Queue (Fila)
        Queue<String> fila = new LinkedList<>();
        fila.add("A");
        fila.add("B");
        fila.add("C");
        System.out.println("Fila: " + fila);
    }
}

