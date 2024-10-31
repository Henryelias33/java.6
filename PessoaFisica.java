public class PessoaFisica {
    // Atributos
    private String nome;
    private String sobrenome;
    private String cpf;

    // Construtor sem parâmetros, define valores padrão
    public PessoaFisica() {
        this.nome = "NomePadrão";
        this.sobrenome = "SobrenomePadrão";
        this.cpf = "000.000.000-00";
    }

    // Construtor com parâmetros
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método dados que retorna uma String com os valores dos atributos
    public String dados() {
        return "Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf;
    }

    // Método main para teste da classe
    public static void main(String[] args) {
        // Testando o construtor sem parâmetros
        PessoaFisica pessoa1 = new PessoaFisica();
        System.out.println(pessoa1.dados());

        // Testando o construtor com parâmetros
        PessoaFisica pessoa2 = new PessoaFisica("João", "Silva", "123.456.789-10");
        System.out.println(pessoa2.dados());
    }
}
