package com.company;

import java.util.*;
import java.io.*;

class Main {
    public static ArrayList<Integer> MaximalSquare(String[] strArr) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        int sizeColumnMat = strArr[0].length();
        System.out.println(sizeColumnMat);
        int toInt = 0; // cast char to int
        int index = 0;



        // Rempli la tableau de 0. Taille tableau = nombre de colonne matrice de base.
        for (int i = 0; i < sizeColumnMat; i++) {
            intArray.add(0);
        }

        for (int i = 0; i < strArr.length; i++) {
            String argument = strArr[i];
//            for (int j = 0; i < argument.length(); j++) {
//
//            }
            index = 0;
            for (char str: argument.toCharArray()) {
                // cst char to int
                try {
                    toInt = str;
                } catch (Exception e) {
                    System.out.println("probleme de cast char to int error : " + e);
                }
                // Si 1 on peut incrementer le tableau d'entier.
                if (toInt == 1) {
                    int valeurIndex = intArray.get(index); // recupere la valeur a l'index courrant
                    intArray.set(index, valeurIndex++);
                }
                index++;
            }

        }
        return intArray;
    }

    public static void main (String[] args) {
        System.out.print(MaximalSquare(args));
    }

}



