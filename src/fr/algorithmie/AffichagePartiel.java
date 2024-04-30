package fr.algorithmie;

public class AffichagePartiel {
  public static void main(String[] args) {
    int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
    for (int num : array) {
      if (num > 3)
        System.out.println(num);
    }

    System.out.println("************ Afficher tous les nombres pairs ***********");

    for (int num : array) {
      if (num % 2 == 0)
        System.out.println(num);
    }

    System.out.println("************ Afficher tous les nombres au index pairs ***********");

    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0)
        System.out.println(array[i]);
    }

    System.out.println("************ Afficher tous les nombres impairs  ***********");

    for (int num : array) {
      if (num % 2 != 0)
        System.out.println(num);
    }
  }
}
