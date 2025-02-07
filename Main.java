import java.util.Scanner;

/**
 * Esta clase ...
 *
 * @Autor: Javier Raposo Huelva
 * @Version: 2025:02
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        System.out.println("Suma " + calc.sumar(a, b));
        System.out.println("Resta " + calc.restar(a, b));
        System.out.println("Multiplica " + calc.multiplicar());
        System.out.println("Divide " + calc.dividir(a, b));
    }
}