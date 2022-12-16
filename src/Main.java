import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String op;

    Scanner sc = new Scanner(System.in);
    System.out.println("creez vous un compte \n");

    System.out.println("entrez votre nom : ");
    String nom = sc.nextLine();

    System.out.println("entrez le solde du votre compte : ");
    float solde = sc.nextFloat();
    sc.nextLine();

    Compte c1 = new Compte(nom, solde, 6000, 5000);
    do {
      System.out
          .println("choisir A pour affiche ou C pour  creditercompte ou  D pour debitercompte ou V pur virerSolde");
      op = sc.nextLine();
      switch (op) {
        case "A":
          c1.affiche();
          break;
        case "C":
          System.out.println("entrez un montant : ");
          float montantCr = sc.nextFloat();
          sc.nextLine();
          c1.creditercompte(montantCr);
          break;
        case "D":
          System.out.println("entrez un montant : ");
          float montantDe = sc.nextFloat();
          sc.nextLine();
          c1.debitercompte(montantDe);
          break;
        case "V":
          System.out.println("entrez le nom du client : ");
          String nomC2 = sc.nextLine();

          System.out.println("entrez votre le montant : ");
          float montant = sc.nextFloat();
          sc.nextLine();
          Compte c2 = new Compte(nomC2, 0, 6000, 5000);
          c1.virerSolde(c2, montant);
          System.out.println("le virememt est termine avec succes !");
          c1.affiche();
          c2.affiche();
          break;
        default:
          System.out
              .println("choisir A pour affiche ou C pour  creditercompte ou  D pour debitercompte ou V pur virerSolde");
      }

    } while (c1.getNom() != "");
    sc.close();
  }
}