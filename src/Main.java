
import java.util.Scanner;

public class Main {
    public static void numerosNegativos() {
        // Pedir 5 números, y mostrar al final si se ha introducido alguno negativo.
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int acumuladorNegativos = 0;
        int negativo = 0;
        while (contador <= 5) {
            System.out.println("Introduce 5 numeros, numero " + contador + ": ");

            int numero = sc.nextInt();
            contador++;
            if (numero < 0) {
                negativo = numero;
                System.out.println(negativo + " Es negativo");
                acumuladorNegativos++;
            }
        }
        System.out.println("Hubo " + acumuladorNegativos + " numeros negativos");
    }

    public static void multiploDeTres() {
        //Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contadorMultiplo = 0;

        while (numero != -1) {
            System.out.println("Introduzca un numero: ");
            numero = sc.nextInt();
            if (numero % 3 == 0) {
                System.out.println(numero + " Es multiplo de 3 ");
                contadorMultiplo++;
            } else {
                System.out.println(numero + " No es multiplo de 3");
            }
        }
        System.out.println("Hubo " + contadorMultiplo + " multiplos de 3");

    }

    public static void inverso() {

        //Leer 5 números y mostrarlos en orden inverso al introducido.
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[5];

        System.out.println("Introduce 5 numeros: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("numero " + (i + 1) + " : ");
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("numero correcto: " + numero[i]);
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("numero inverso: " + numero[i]);
        }

    }

    public static void entreAmbos() {
        //Se pedirán 2 números por teclado. Se pedirá que se imprima por pantalla todos
        //aquellos números que estén entre ambos. Esto se repetirá indefinidamente
        //hasta que los 2 números sean iguales, que en ese caso el programa finalizará.
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        while (num1 != num2) {
            System.out.println("Introduzca un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduzca otro numero: ");
            num2 = sc.nextInt();
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println("Numeros entre " + num1 + " y " + num2 + " : " + i);

            }
            if (num1 == num2) {
                System.out.println(num1 + " y " + num2 + " son iguales. ");
            }
        }
    }

    public static void conImpares() {
        //Modifica el programa anterior para que solo se impriman por pantalla los
        //números impares.

        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        while (num1 != num2) {
            System.out.println("Introduzca un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduzca otro numero: ");
            num2 = sc.nextInt();
            for (int i = num1 + 1; i < num2; i++) {

                if (i % 2 != 0) {
                    System.out.println("Numeros impares entre " + num1 + " y " + num2 + " : " + i);
                }
            }
            if (num1 == num2) {
                System.out.println(num1 + " y " + num2 + " son iguales. ");
            }
        }
    }

    public static void pares() {
        //Modifica el programa anterior haciendo que al finalizar el programa imprima
        //por pantalla la cantidad de números pares que se han impreso por pantalla
        //durante el tiempo que duró el programa hasta que se han escrito 2 números
        //iguales.
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int contador = 0;
        while (num1 != num2) {
            System.out.println("Introduzca un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduzca otro numero: ");
            num2 = sc.nextInt();
            for (int i = num1 + 1; i < num2; i++) {

                if (i % 2 != 0) {
                    System.out.println("Numeros impares entre " + num1 + " y " + num2 + " : " + i);
                } else {
                    contador++;
                }
            }
            if (num1 == num2) {
                System.out.println(num1 + " y " + num2 + " son iguales. ");
            }
            System.out.println("numeros totales pares: " + contador);
        }

    }


        public static void main (String[]args){
            //  numerosNegativos();
            //     multiploDeTres();
            // inverso();
            //entreAmbos();
            // conImpares();
            //pares();


        }


    }