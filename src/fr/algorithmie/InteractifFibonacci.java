package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int range = 0;
    int old = 0;

    System.out.println("*********** Suite de Fibonnacci ***********");
    System.out.println("*******************************************");
    System.out.println("");
    System.out.println("Veuillez choisir un rang pour la suite: ");
    range = scanner.nextInt();

    int[] suite = new int[range];
    suite[0] = 0;
    suite[1] = 1;

    System.out.print("La suite de Fibonnaci est : [");
    System.out.print(suite[0] + ", " + suite[1]);

    for (int i = 2; i < range; i++) {
      System.out.print(", ");
      suite[i] = suite[old] + suite[old + 1];
      old++;
      System.out.print(suite[i]);
    }
    
    System.out.println("]");
  }
}
