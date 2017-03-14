package com.sda.WydawanieReszty;

public class Main {

    public static void main(String[] args) {

        int n [] = {200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int rest = 148;   // podaj reszte do wydania


        while (rest > 0) {
            if (rest >= n[i]) {
                int l = rest / n[i];
                rest = rest - (n[i] * l);
                System.out.print(n[i] + "*" + l + " || ");
            }
            i++;
        }
    }
}
