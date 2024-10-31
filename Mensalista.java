public class Mensalista extends Empregado {
    private double salarioMensal;

    // Construtor sem parâmetros
    public Mensalista() {
        super();
        this.salarioMensal = 0.0;
    }

    // Construtor com parâmetros
    public Mensalista(String nome, String sobrenome, String cpf, double salarioMensal) {
        super(nome, sobrenome, cpf, salarioMensal);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String dados() {
        return super.dados() + ", Salário Mensal: R$ " + salarioMensal;
    }
}
