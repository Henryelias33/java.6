public class pagamento {
    private double valor;
    
    
    //construtor
    public pagamento(double valor) {
     this.valor = valor;
    
    }
    
    public double getValor() {
      return valor;
    }
    public void setVlor(double valor) {
      this.valor = valor;
    }
 }
    
    //clasee cheque (estensão da classe pagamento)
public class cheque extends pagamento {
    private String numeroDoCheque;
    
    //construtor com numero do cheque
    public cheque(double valor, String numeroDoCheque) {
       super(valor);
       this.numeroDoCheque = numeroDoCheque;
    }
    
    //para o numeroDoCheque
    public String getNumeroDoCheque() {
      return numeroDoCheque;
   }
   
   //levantador para o numeroDoCheque
   public void setNumeroDoCheque(String numeroDoCheque) {
      this.numeroDoCheque = numeroDoCheque;
   }
}

