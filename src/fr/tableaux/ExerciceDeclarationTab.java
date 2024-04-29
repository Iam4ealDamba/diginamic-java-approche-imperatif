package src.fr.tableaux;

public class ExerciceDeclarationTab {
  public static void main(String[] args) {
    int[] tableau = { 8, -7, 12, 1, -2, 14, 17, 9 };
    System.out.println(tableau[0]);
    System.out.println(tableau.length);
    System.out.println(tableau[tableau.length - 1]);

    try {
      // Cette ligne ne marchera pas, car le tableau ne contient pas d'index 10
      System.out.println(tableau[10]);

    } catch (Exception e) {
      System.out.println("Exception : Cette ligne ne marchera pas, car le tableau ne contient pas d'index 10");
    }
  }
}
