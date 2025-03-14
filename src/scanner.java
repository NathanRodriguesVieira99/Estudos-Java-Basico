import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um texto: ");

        String texto;
        texto = scanner.nextLine();

        System.out.println("Texto é: " + texto);
    }
}
