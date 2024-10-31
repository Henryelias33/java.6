public class Boleto extends Pagamento {
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int anoo;
   
   //construtor com valor, numeroDoBoleto, dia, mes e ano de vencimento
   public Boleto(double valor, String numeroDoBoleto, int dia, int mes, int ano)
   
   //chama o construtor da classe pagamento
   super(valor);
   this.numeroDoBoleto = numeroDoBoleto
   this.dia = dia;
   this.mes = mes;
   this.ano = ano;
 }
 
  //para o numeroDoBoleto
  public String getNumeroDoBoleto() {  
     return numeroDoBoleto;
 }
 //levantador para numeroDoBoleto
 public void setNumeroDoBoleto(String numeroDoBoleto) {
   this.numeroDoBoleto = numeroDoBoleto;
 }
 
 //pega o dia
 public int getDia() {
    return dia;
 }
 
 //velantador do dia 
 public void setDia(int dia) {
    this.dia = dia;
 }
 
  // Getter para mes
    public int getMes() {
        return mes;
    }

    // velentador para mes
    public void setMes(int mes) {
        this.mes = mes;
    }

    // Getter para ano
    public int getAno() {
        return ano;
    }

 
 