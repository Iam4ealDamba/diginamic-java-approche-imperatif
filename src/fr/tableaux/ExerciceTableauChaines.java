package src.fr.tableaux;

public class ExerciceTableauChaines {
  public static void main(String[] args) {
    String[] villes = { "Paris", "Lyon", "Marseille", "Strasbourg", "Rennes" };

    for (final String ville : villes) {
      System.out.println(ville);
    }
    System.out.println(villes.length);
    
    villes[3] = "Reims";

    for (final String ville : villes) {
      System.out.println(ville);
    }
  }
}
