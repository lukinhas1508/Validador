package com.validador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Validador de CPF/CNPJ ===");
        System.out.print("Digite um CPF ou CNPJ: ");
        String input = sc.nextLine();

        String numeros = input.replaceAll("\\D","");

        if(numeros.length() == 11) {
            if(CPFValidator.isValid(input)) {
                System.out.println("CPF VÁLIDO: " + CPFValidator.format(input));
            } else {
                System.out.println("CPF INVÁLIDO!");
            }
        } else if(numeros.length() == 14) {
            if(CNPJValidator.isValid(input)) {
                System.out.println("CNPJ VÁLIDO: " + CNPJValidator.format(input));
            } else {
                System.out.println("CNPJ INVÁLIDO!");
            }
        } else {
            System.out.println("Número inválido!");
        }
        sc.close();
    }
}
