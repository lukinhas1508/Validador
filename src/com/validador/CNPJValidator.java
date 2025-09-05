package com.validador;

public class CNPJValidator {

    private static final int TAMANHO_CNPJ = 14;

    public static boolean isValid(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", "");
        if(cnpj.length() != TAMANHO_CNPJ || cnpj.chars().distinct().count() == 1) return false;

        int[] digits = new int[TAMANHO_CNPJ];
        for(int i=0; i<TAMANHO_CNPJ; i++) digits[i] = Character.getNumericValue(cnpj.charAt(i));

        int[] weights1 = {5,4,3,2,9,8,7,6,5,4,3,2};
        int sum = 0;
        for(int i=0;i<12;i++) sum += digits[i]*weights1[i];
        int check1 = sum % 11;
        check1 = (check1 < 2)?0:11-check1;
        if(check1 != digits[12]) return false;

        int[] weights2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
        sum = 0;
        for(int i=0;i<13;i++) sum += digits[i]*weights2[i];
        int check2 = sum % 11;
        check2 = (check2 < 2)?0:11-check2;
        return check2 == digits[13];
    }

    public static String format(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", "");
        return cnpj.substring(0,2) + "." + cnpj.substring(2,5) + "." + cnpj.substring(5,8) + "/" +
                cnpj.substring(8,12) + "-" + cnpj.substring(12);
    }
}
