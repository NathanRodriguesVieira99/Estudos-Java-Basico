public class imprimir_variaveis {
    public static void main(String[] args) {

        String nome; // declarando a variavel
        nome = "Son Goku"; // usando a variavel
        System.out.println(nome); // imprimindo a variavel

        // Ou

        String nome2 = "Uchiha Madara"; // declarando e usansdo a variavel
        System.out.println(nome2); // imprimindo a variavel

        System.out.println

        ("==========================================");

        String filme = "vingadores"; // %s
        int anoLancamento = 2015; // %d
        int duracao = 240; // %d
        double nota = 8.5; // %f
        boolean foiSucesso = true; // %b

        System.out.println("O filme " + filme + " lancou em " + anoLancamento + "\nTem uma duracao de " + duracao
                + " minutos \n" + "Com a nota media de " + nota + "\nSendo um sucesso " + foiSucesso);
    }
}
