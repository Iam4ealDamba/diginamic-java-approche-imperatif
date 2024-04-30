package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un nombre: ");

    int num = scanner.nextInt();
    scanner.close();

    for (int i = 0; i <= 10; i++) {
      num++;
      System.out.println(num);
    }
  }
}