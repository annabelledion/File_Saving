
import java.util.Scanner;
/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Adresse {

    private int numPorte;
    private String rue;
    private String numAppart;
    private String ville;
    private String province;
    private String pays;

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getNumAppart() {
        return numAppart;
    }

    public void setNumAppart(String numAppart) {
        this.numAppart = numAppart;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public static Adresse addAdresse() {

        Scanner sc = new Scanner(System.in);

        Adresse adresse = new Adresse();

        String modif;

        System.out.println("Adresse :");
        System.out.println("    Numéro de porte : ");
        adresse.numPorte = sc.nextInt();
        System.out.println("    Rue : ");
        adresse.rue = sc.next();
        System.out.println("    Appartement (falcultatif) :");
        sc.nextLine();
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {adresse.numAppart = modif;}
            System.out.println("    Ville :");
            adresse.ville = sc.next();
            System.out.println("    Province :");
            adresse.province = sc.next();
            System.out.println("    Pays :");
            adresse.pays = sc.next();

            return adresse;
    }

    public void afficherAdresse(){

        System.out.println("Adresse :");
        System.out.println("    Numéro de porte : " + getNumPorte());
        System.out.println("    Rue : " + getRue());
        System.out.println("    Appartement : " + getNumAppart());
        System.out.println("    Ville : " + getVille());
        System.out.println("    Province : " + getProvince());
        System.out.println("    Pays : " + getPays());
    }

    public void modifAdresse(){

        Scanner sc = new Scanner(System.in);
        String modif;

        System.out.println("Adresse :");
        System.out.println("    Numéro de porte (" + getNumPorte() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setNumPorte(Integer.parseInt(modif));}
        System.out.println("    Rue : (" + getRue() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setRue(modif);}
        System.out.println("    Appartement (" + getNumAppart() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setNumAppart(modif);}
        System.out.println("    Ville (" + getVille() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setVille(modif);}
        System.out.println("    Province (" + getProvince() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setProvince(modif);}
        System.out.println("    Pays (" + getPays() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setPays(modif);}
    }
}

