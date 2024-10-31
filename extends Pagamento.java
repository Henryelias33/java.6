public class CartaoDeCredito extends Pagamento {

 //Atributo da classe CartãoDecredito
   private String numeroDoCartao;
   
     //construtor
       public CartaoDeCredito() {
        super();
  }
           //construtor todos atributos em parâmetros
             public CartaoDeCredito(string nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
               super(nomeDoPagador, cpf, ValorASerPago);
                this.numeroDoCartao = numeroDoCartao;
               
                //para o numeroDoCartao
                public String getNumeroDoCartao() {
               return numeroDoCartao;
    }
               
                          public void setNumeroDoCartao(String numeroDoCartao) { 
        this.numeroDoCartao = numeroDoCartao;
        
  }
}  