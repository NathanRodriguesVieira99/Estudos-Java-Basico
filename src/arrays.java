import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // array -> tipo[] nomeDaVariavel = new tipo[]{}
        String[] nomes = new String[] {
                "João", "Maria", "Pedro", "Zé"
        };
        // indices do array -> 0,1,2,3,4

        // declara array com tamanho -> tipo[] nomeDaVariavel = new tipo[quantidade]
        int[] numeros = new int[5];

        // formas de imprimir arrays
        System.out.println(Arrays.toString(numeros));

        System.out.println(numeros.length);
    }
}
