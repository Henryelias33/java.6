public class Tarefeiro extends Empregado {
    private double valorTarefa;
    private int tarefasRealizadas;

    public Tarefeiro() {
        super();
        this.valorTarefa = 0.0;
        this.tarefasRealizadas = 0;
    }

    public Tarefeiro(String nome, String sobrenome, String cpf, double valorTarefa, int tarefasRealizadas) {
        super(nome, sobrenome, cpf, valorTarefa *tarefasRealizadas);
        this.valorTarefa = valorTarefa;
        this.tarefasRealizadas =tarefasRealizadas;
    }

    public double getValorTarefa() {
        return valorTarefa;
    }

    public void setValorTarefa(double valorTarefa) {
        this.valorTarefa = valorTarefa;
    }

    public int getTarefasRealizadas() {
        return tarefasRealizadas;
    }

    public void setTarefasRealizadas(int tarefasRealizadas) {
        this.tarefasRealizadas = tarefasRealizadas;
    }

    public String dados() {
        return super.dados() + ", Valor por Tarefa: R$ " + valorTarefa + ", Tarefas Realizadas: " + tarefasRealizadas;
    }
}
