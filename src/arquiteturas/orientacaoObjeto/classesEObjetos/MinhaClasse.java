package arquiteturas.orientacaoObjeto.classesEObjetos;

/**
 * Classe que representa um exemplo simples de uma classe em Java.
 * Uma classe é uma estrutura que define o comportamento e o estado de um objeto.
 */
public class MinhaClasse {
    // Campos (variáveis de instância)
    private int numero;
    private String texto;

    // Construtor padrão
    public MinhaClasse() {
        // Inicializa os campos com valores padrão
        this.numero = 0;
        this.texto = "Exemplo";
    }

    // Construtor personalizado
    public MinhaClasse(int numero, String texto) {
        // Inicializa os campos com os valores fornecidos
        this.numero = numero;
        this.texto = texto;
    }

    // Métodos (comportamentos)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Método para exibir informações da classe
    public void exibirInformacoes() {
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
    }

    // Método principal (método de entrada da aplicação)
    public static void main(String[] args) {
        // Criando uma instância da classe MinhaClasse
        MinhaClasse objeto = new MinhaClasse(42, "Hello, World!");

        // Exibindo informações do objeto
        objeto.exibirInformacoes();
    }
}

