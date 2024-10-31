public class Empregado extends PessoaFisica {
    // Atributo específico da classe Empregado
    private double salario;

    // Construtor sem parâmetros, define o salário com o valor 0.0
    public Empregado() {
        super(); 
        this.salario = 0.0;
    }

    // Construtor com parâmetros para inicializar atributos herdados e o próprio
    public Empregado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf); 
        this.salario = salario; 
    }

    // Métodos de acesso e modificação para o atributo salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método dados que exibe as informações do empregado
    @Override
    public String dados() {
        return super.dados() + ", Salário: R$ " + salario;
    }
}
