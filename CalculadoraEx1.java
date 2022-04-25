package Tarefas;

import java.util.Scanner;

public class CalculadoraEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        double num1 = scan.nextDouble();
        System.out.println("Segundo valor: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite + para somar, - para subtrair, * para multiplicar, " +
                "/ para dividir e % para resto");
        System.out.println("Escolha: ");
        String resposta = scan.next();
        double resultado = 0;

        switch (resposta) {
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
            break;

            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
            break;

            case "/":
                resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            break;

            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
            break;

            case "%":
                resultado = num1 % num2;
                System.out.println("Resultado do resto: " + resultado);
            break;

            default:
                System.out.println("Digite uma operação valida.");
        }
    }
}
