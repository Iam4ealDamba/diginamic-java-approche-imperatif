package fr.algorithmie;

public class AffichageSuite {
  public static void main(String[] args) {
    System.out.println("************ Afficher nombre de 1 à 10 inclus ***********");
    System.out.println("***********************");

    // Afficher nombre de 1 à 10 inclus
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    System.out.println("************ Afficher tous les nombres pairs de 0 à 10 inclus ***********");
    System.out.println("***********************");

    // Afficher tous les nombres pairs de 0 à 10 inclus
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }

    System.out.println("************ Afficher tous les nombres impairs de 0 à 10 inclus ***********");
    System.out.println("***********************");
    ;

    // Afficher tous les nombres impairs de 0 à 10 inclus
    for (int i = 0; i <= 10; i++) {
      if (i % 2 != 0)
        System.out.println(i);
    }

    System.out.println("************ Afficher tous les nombres de 1 à 10 inclus avec une while ***********");
    System.out.println("***********************");

    // Afficher tous les nombres de 1 à 10 inclus avec une while
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    System.out.println("************ Afficher tous les nombres pairs de 0 à 10 inclus avec une while ***********");
    System.out.println("***********************");

    // Afficher tous les nombres pairs de 0 à 10 inclus avec une while
    i = 0;
    while (i <= 10) {
      if (i % 2 == 0)
        System.out.println(i);
      i++;
    }

    System.out.println("************ Afficher tous les nombres impairs de 0 à 10 inclus avec une while ***********");
    System.out.println("***********************");
    ;

    // Afficher tous les nombres impairs de 0 à 10 inclus avec une while
    i = 0;
    while (i <= 10) {
      if (i % 2 != 0)
        System.out.println(i);
      i++;
    }
  }
}
