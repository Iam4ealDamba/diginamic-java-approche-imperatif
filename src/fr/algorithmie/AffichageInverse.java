package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
  public static void main(String[] args) {
    int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

    System.out.println("************ Afficher l'ensemble des éléments du tableau inversement ***********");

    // Afficher l’ensemble des éléments du tableau grâce à une boucle
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    System.out.println("************ Afficher l'ensemble des éléments dans l’ordre inverse du tableau  ***********");

    // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[(array.length - 1) - i]);
    }

    int[] arrayCopy = array.clone();
  }
}
