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

    public int multiplicar(int a, int b) {
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
