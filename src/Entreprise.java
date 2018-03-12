import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Entreprise {

    private String nom;
    private Adresse adresseEn;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresseEn() {
        return adresseEn;
    }

    public void setAdresseEn(Adresse adresseEn) {
        this.adresseEn = adresseEn;
    }

    public static Entreprise addEntreprise(){

        Scanner sc = new Scanner(System.in);

        Entreprise entreprise = new Entreprise();

        System.out.println("Entreprise :");
        System.out.println("    Nom :");
        entreprise.nom = sc.next();
        Adresse adresse  = Adresse.addAdresse();
        entreprise.setAdresseEn(adresse);

        return entreprise;
    }
    public  void afficherEntreprise(){
        System.out.println("Entreprise : ");
        System.out.println("    Nom : " + getNom());
        getAdresseEn().afficherAdresse();
    }
    public void modifEntreprise(){
        Scanner sc = new Scanner(System.in);
        String modif;

        System.out.println("Entreprise :");
        System.out.println("    Nom (" + getNom() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setNom(modif);}
        getAdresseEn().modifAdresse();
    }


}
