package Nivel_1;

import java.util.Scanner;

public class Ejercicio_5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite el primer número:");
        Integer num1 = scanner.nextInt();
        System.out.println("Digite el segundo número:");
        Integer num2 = scanner.nextInt();

        Integer res = 0;

        for(int i = 0; i < num1; i++){
            res += num2;
        }
        System.out.println(num1 + " x " + num2 + " = " + res);
    }

}
