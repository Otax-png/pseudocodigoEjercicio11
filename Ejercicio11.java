import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadoresImpares = 0;
        int contadorPares = 0;
        int sumaPares = 0;
        int contador2Docena = 0;
        int valorMayor = 0;
        int numero;

        for (int i = 1; i < 10 ; i++) {

            numero = ((int)Math.floor(Math.random()*36 - 0 +1));
            System.out.println(numero);

            if (numero%2 != 0){
                contadoresImpares++;
            } else if(numero%2 == 0){
                contadorPares++;
                sumaPares = sumaPares + numero;
            }

            if (numero >= 13 && numero <= 24){
                contador2Docena++;
            }

            if (numero >= valorMayor){
                valorMayor = numero;
            }
        }
    }
}