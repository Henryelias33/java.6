public class Desempregado extends PessoaFisica {
    // Atributo específico da classe Desempregado
    private double seguroDesemprego;

    // Construtor sem parâmetros, define seguroDesemprego como 0.0
    public Desempregado() {
    
    // Chama o construtor sem parâmetros da superclasse
        super();
        this.seguroDesemprego = 0.0;
    }

    // Construtor com parâmetros para inicializar atributos herdados e o próprio
    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego) {
        super(nome, sobrenome, cpf); // Chama o construtor com parâmetros da superclasse
        this.seguroDesemprego = seguroDesemprego;
    }

        // Método de acesso (getter) para o seguroDesemprego
            public double getSeguroDesemprego() {
              return seguroDesemprego;
    }

                // Método modificador (setter) para o seguroDesemprego
                   public void setSeguroDesemprego(double seguroDesemprego) {
                     this.seguroDesemprego = seguroDesemprego;
    }

                      // Sobrescrita do método dados para incluir o seguroDesemprego
    
                         public String dados() {
                           return super.dados() + ", Seguro-Desemprego: R$ " + seguroDesemprego;
    }

                             public static void main(String[] args) {
                              // Testando o construtor sem parâmetros
                                  Desempregado desempregado1 = new Desempregado();
                                    System.out.println(desempregado1.dados());
 
                                        // Testando o construtor com parâmetros
                                           Desempregado desempregado2 = new Desempregado("Carlos", "Santos", "987.654.321-00", 1200.0);
                                             System.out.println(desempregado2.dados());
    }
}
