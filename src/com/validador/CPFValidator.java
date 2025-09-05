package com.validador;

public class CPFValidator {

    private static final int TAMANHO_CPF = 11;

    public static boolean isValid(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if(cpf.length() != TAMANHO_CPF || cpf.chars().distinct().count() == 1) return false;

        int[] digits = new int[TAMANHO_CPF];
        for(int i=0; i<TAMANHO_CPF; i++) digits[i] = Character.getNumericValue(cpf.charAt(i));


        int sum = 0;
        for(int i=0; i<9; i++) sum += digits[i]*(10-i);
        int check1 = (sum*10) % 11;
        check1 = (check1==10)?0:check1;
        if(check1 != digits[9]) return false;


        sum = 0;
        for(int i=0; i<10; i++) sum += digits[i]*(11-i);
        int check2 = (sum*10) % 11;
        check2 = (check2==10)?0:check2;
        return check2 == digits[10];
    }

    public static String format(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9);
    }
}
