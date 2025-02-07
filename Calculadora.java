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

    public int multiplicar(int b, int a) {
        return b * a;
    }

    public int dividir(int a, int b) {
        if(a == 0 || b == 0){
            System.out.println("quillo no divide por 0");
        } else{
            return a / b;
        }
    }
}
