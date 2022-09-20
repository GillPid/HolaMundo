import javax.management.loading.MLet;
import javax.management.loading.MLetContent;
import java.util.Scanner;

public class Main {
    private final static double MUL = 2.5;
    private static int numero1;

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("ahora obturaremos los demas datos");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un solo numero");
        numero1 = input.nextInt();
        System.out.println("Resultado: " + (numero1 * MUL));
    }
}