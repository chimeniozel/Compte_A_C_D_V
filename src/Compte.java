public class Compte {
    private int numero;
    private static int bb = 0;
    private String nom;
    private float solde;
    private double decouvertmax;
    private double debitmax;

    public Compte(String nom, float solde, double debitmax, double decouvertmax) {
        bb++;
        this.numero = bb;
        this.nom = nom;
        this.solde = solde;
        this.debitmax = debitmax;
        this.decouvertmax = decouvertmax;

    }

    public Compte(String nom, float solde) {
        bb++;
        this.numero = bb;
        this.nom = nom;
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public double getDebitmax() {
        return debitmax;
    }

    public void setDebitmax(double debitmax) {
        this.debitmax = debitmax;
    }

    public double getDecouvertmax() {
        return decouvertmax;
    }

    public void setDecouvertmax(double decouvertmax) {
        this.decouvertmax = decouvertmax;
    }

    public void affiche() {
        System.out.println("numero  du compte est : " + numero);
        System.out.println("nom est  : " + nom);
        System.out.println("solde est : " + solde);
        System.out.println("decouvertmax est  : " + decouvertmax);
        System.out.println("debitmax est  : " + debitmax);
        System.out.println("    ");
    }

    // deposer
    public void creditercompte(float montant) {
        if (solde + montant > this.debitmax) {
            System.out.println("vous ne pouvez pas faire ce versement parseque  vous allez depasser votre debitmax");
        } else {
            this.solde = solde + montant;
            System.out.println("le solde du compte " + nom + " est crediter par montant egale " + montant + " votre solde MRU est " + solde);
        }

    }

    // retirer
    public void debitercompte(float montant) {

        if (solde - montant > this.decouvertmax) {
            System.out
                    .println("vous ne pouvez pas faire cette retrait car vous allez depasser votre decouvert maximale");
        } else {
            this.solde = solde - montant;
            System.out.println("votre solde apres retir est " + solde);
        }

    }

    public void virerSolde(Compte c, float Montant) {

        if (this.solde - Montant > this.decouvertmax) {
            System.out.println("vous ne pouvez pas faire cette retrait car vous allez depasser decouvert maximale ");
        } else {
            this.solde = this.solde - Montant;
            c.solde = c.solde + Montant;
        }
    }

}
