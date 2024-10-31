public class TesteEmpregados {
    public static void main(String[] args) {
        // Teste da classe Empregado
        Empregado empregado1 = new Empregado("Ana", "Silva", "123.456.789-00", 3000.0);
        System.out.println("Empregado:");
        System.out.println(empregado1.dados());
        
        System.out.println("\n");

        // Teste da classe Mensalista
        Mensalista mensalista1 = new Mensalista("Carlos", "Pereira", "234.567.890-11", 3500.0);
        System.out.println("Mensalista:");
        System.out.println(mensalista1.dados());

        System.out.println("\n");

        // Teste da classe Horista
        Horista horista1 = new Horista("Bia", "Santos", "345.678.901-22", 20.0, 160);
        System.out.println("Horista:");
        System.out.println(horista1.dados());

        System.out.println("\n");

        // Teste da classe Tarefeiro
        Tarefeiro tarefeiro1 = new Tarefeiro("João", "Lima", "456.789.012-33", 50.0, 60);
        System.out.println("Tarefeiro:");
        System.out.println(tarefeiro1.dados());

        System.out.println("\n");

        // Teste da classe Vendedor
        Vendedor vendedor1 = new Vendedor("Maria", "Oliveira", "567.890.123-44", 0.10, 50000.0);
        System.out.println("Vendedor:");
        System.out.println(vendedor1.dados());
    }
}
