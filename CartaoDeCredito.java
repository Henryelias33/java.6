public class CartaoDeCredito extends Pagamento {
    // Atributo específico da classe CartaoDeCredito
    private String numeroDoCartao;

    // Construtor sem parâmetros
    public CartaoDeCredito() {
        super();
    }

    // Construtor com parâmetros para todos os atributos
    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago); // Chama o construtor da superclasse (Pagamento)
        this.numeroDoCartao = numeroDoCartao;
    }

    // Getter para numeroDoCartao
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    // Setter para numeroDoCartao
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}
