package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
  public static void main(String[] args) {
    int random_number = (int) Math.floor(Math.random() * 100);
    int total_failed = 0;
    boolean can_exit = false;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vous devez deviner un nombre entre 0 et 100");

    while (!can_exit) {
      System.out.print("Veuillez entrer un nombre : ");
      int number = scanner.nextInt();

      if (number > random_number) {
        System.out.println("Trop grand, veuillez reessayer");
        total_failed++;
      }
      if (number < random_number) {
        System.out.println("Trop petit, veuillez reessayer");
        total_failed++;
      }
      if (number == random_number) {
        System.out.println(" Bravo, vous avez trouvé en " + total_failed + " coups.");
        can_exit = true;
      }
    }
  }
}
