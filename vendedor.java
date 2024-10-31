public class Vendedor extends Empregado {
    private double comissao;
    private double totalVendas;

    public Vendedor() 
        this.comissao = 0.0;
        this.totalVendas = 0.0;
    }

    public Vendedor(String nome, String sobrenome, String cpf, double comissao, double totalVendas) {
        supe(nome, sobrenome, cpf, comissao * totalVendas);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public String dados() {
        return super.dados() + ", Comissão: " + comissao + ", Total de Vendas: R$ " + totalVendas;
    }
}
