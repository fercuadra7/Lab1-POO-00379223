import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
       //definicion de variables
        int opcion;
        float num1, num2;
        Scanner sc = new Scanner(System.in);
     //bucle do while para crear menu
        do {
            System.out.println("------Calculadora------");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir ");
            opcion = sc.nextInt();
            //switch con distintos casos de la calculadora
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el primer numero que quiere sumar: ");
                    num1 = sc.nextFloat();

                    System.out.print("Ingrese el segundo numero que quiere sumar: ");
                    num2 = sc.nextFloat();

                    float suma = suma(num1, num2);

                    System.out.println("La suma de los dos numeros es: "+ suma);

                    break;
                case 2:
                    System.out.print("Ingrese el primer numero que quiere restar: ");
                    num1 = sc.nextFloat();

                    System.out.print("Ingrese el segundo numero que quiere restar: ");
                    num2 = sc.nextFloat();

                    float resta =resta(num1, num2);

                    System.out.println("La resta de los dos numeros es: " + resta);

                    break;
                case 3:
                    System.out.print("Ingrese el primer numero que quiere multiplicar: ");
                    num1 = sc.nextFloat();

                    System.out.print("Ingrese el segundo numero que quiere multiplicar: ");
                    num2 = sc.nextFloat();

                    float multiplicacion = multiplicacion(num1, num2);

                    System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion);

                    break;
                case 4:
                    System.out.print("Ingrese el primer numero que quiere dividir(numerador): ");
                    num1 = sc.nextFloat();

                    System.out.print("Ingrese el segundo numero que quiere dividir(denominador): ");
                    num2 = sc.nextFloat();

                    float divison = division(num1, num2);

                    System.out.println("La division de los dos numeros es: " + divison);

                    break;
                case 5:
                    System.out.println("Saliendo del ṕrograma...");
                    break;
            }
        }while (opcion!= 5);
    }
//funciones 
    public static float suma(float num1, float num2){
      return num1+num2;
    }

    public static float resta(float num1, float num2){
        return num1-num2;
    }

    public static float multiplicacion(float num1, float num2){
        return num1*num2;
    }
    public static float division(float num1, float num2){
        return num1/num2;
    }
}
