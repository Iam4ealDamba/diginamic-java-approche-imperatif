package src.fr.declaration.variable;

public class DeclarationApp {
  public static void main(String[] args) {
    byte b = 10;
    short s = -17282;
    int i = 2846325;
    long l = 10000L;
    float f = 2.5F;
    double d = 6.4D;
    char c = 'c';
    boolean bool = true;

    String randomString = "Voici le résultat d’un calcul : \n1+5=6";

    System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + bool);
    System.out.println(randomString);
  }
}
