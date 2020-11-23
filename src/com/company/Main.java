package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Velikost pole: ");
        String velikostPole = sc.nextLine();

        System.out.println("Čísla v poli: ");
        String stringInput = sc.nextLine();

        String[] stringArray = stringInput.split(" ");

        int[] pole = new int[Integer.parseInt(velikostPole)];

        for(int i = 0; i < stringArray.length; i++){
            pole[i] = Integer.parseInt(stringArray[i]);
        }

        int soucet = 0;

        for (int j : pole) {
            soucet = soucet + j;
        }

        int prumer = soucet / pole.length;

        int zacatek = pole[0];

        for (int i : pole) {
            if (zacatek < i) {
                zacatek = i;
            }
        }
        int nejvetsi = zacatek;

        for (int i : pole) {
            if (zacatek > i) {
                zacatek = i;
            }
        }
        int nejmensi = zacatek;

        System.out.println("Největší: " + nejvetsi);
        System.out.println("Nejmenší: " + nejmensi);
        System.out.println("Průměr: " + prumer);

    }
}
