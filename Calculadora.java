import java.util.Random;

/**
 * Esta clase ...
 *
 * @Autor: Javier Raposo Huelva
 * @Version: 2025:02
 */
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar() {
        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        return a * b;
    }

    public int dividir(int a, int b) {
        if(a == 0 || b == 0){
            System.out.println("No se dividir por 0");
        } else{
            return a / b;
        }
    }
}
