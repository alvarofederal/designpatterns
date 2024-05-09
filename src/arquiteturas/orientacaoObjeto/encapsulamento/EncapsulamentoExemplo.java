package arquiteturas.orientacaoObjeto.encapsulamento;

/**
 * Exemplo de encapsulamento em Java.
 * O encapsulamento é o princípio de ocultar os detalhes internos de uma classe e expor apenas as interfaces relevantes para o mundo externo.
 * É implementado através do uso de modificadores de acesso (public, private, protected) e métodos de acesso (getters e setters).
 */
public class EncapsulamentoExemplo {
    // Campos privados (encapsulados)
    private int numero;
    private String texto;

    // Método construtor
    public EncapsulamentoExemplo(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    // Métodos de acesso (getters e setters) para os campos privados
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

    // Método principal para demonstrar o encapsulamento
    public static void main(String[] args) {
        // Criando uma instância da classe EncapsulamentoExemplo
        EncapsulamentoExemplo exemplo = new EncapsulamentoExemplo(42, "Hello, World!");

        // Acessando os campos privados através dos métodos de acesso
        System.out.println("Número: " + exemplo.getNumero());
        System.out.println("Texto: " + exemplo.getTexto());

        // Modificando os campos privados através dos métodos de acesso
        exemplo.setNumero(99);
        exemplo.setTexto("Goodbye, World!");

        // Exibindo os campos modificados
        System.out.println("Novo Número: " + exemplo.getNumero());
        System.out.println("Novo Texto: " + exemplo.getTexto());
    }
}

