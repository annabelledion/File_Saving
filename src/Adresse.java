
import java.io.Serializable;
import java.util.Scanner;
/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Adresse implements Serializable {

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
            adresse.numPorte =  demanderNombre();
            System.out.println("    Rue : ");
            adresse.rue = Main.caractere();
            System.out.println("    Appartement (facultatif) :");
            modif = sc.nextLine().trim();
            if (modif.equals("")) {
            } else {
                adresse.numAppart = modif;
            }
            System.out.println("    Ville :");
            adresse.ville = Main.caractere();
            System.out.println("    Pays :");
            adresse.pays = pays();
            System.out.println("    Province :");
        if (adresse.pays.equals("canada")) {
            adresse.province = provinces();
        } else
            adresse.province = Main.caractere();

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
        int modif2 = 0;

        System.out.println("Adresse :");
        System.out.println("    Numéro de porte (" + getNumPorte() + ") : ");
        System.out.println();
        modif2 = demanderNombre();
        if (modif2 < 0) {
        } else {
            setNumPorte(modif2);}
        System.out.println("    Rue : (" + getRue() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setRue(modif);}
        System.out.println("    Appartement (" + getNumAppart() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setNumAppart(modif);}
        System.out.println("    Ville (" + getVille() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setVille(modif);}
        System.out.println("    Province (" + getProvince() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setProvince(modif);}
        System.out.println("    Pays (" + getPays() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setPays(modif);}
    }

    public static int demanderNombre() {

        Scanner sc = new Scanner(System.in);
        int nombre = 0;
        while (true) {
            String rep2 = sc.nextLine();
            try {
                nombre = Integer.parseInt(rep2);
                return nombre;
            }catch (NumberFormatException e){
                System.out.println("Mauvais format! Entrez un chiffre ou un nombre");
                System.out.println();
            }

        }
    }

    public static String pays() {
        Scanner sc = new Scanner(System.in);
        String tabPays[] = {"canada", "étas-unis", "chili", "mexique", "france", "espagne", "portugal", "italie", "australie", "maroc"};

        while (true) {
            String repPays = Main.caractere().toLowerCase();

            for (int i = 0; i < tabPays.length; i++) {

                if (tabPays[i].equals(repPays)) {
                    return repPays;
                } else if (i >= 9){
                    System.out.println("Le pays n'existe pas. Réessayez");
                }
            }
        }

    }

    public static String provinces(){
        Scanner sc = new Scanner(System.in);
        String tabProvinces[] = {"québec", "ontario", "colombie-britanique", "alberta", "manitoba", "nouvelle-écosse", "nouveau-brunswick",
        "saskatchewan", "terre-neuve-et-labrador", "ile-du-prince-edouard"};

        while (true) {
            String repProvinces = Main.caractere().toLowerCase();
            for (int i = 0; i < tabProvinces.length; i++) {
                if (tabProvinces[i].equals(repProvinces)) {
                    return repProvinces;
                } else if (i >= 9){
                    System.out.println("La Province n'existe pas. Réessayez");
                    System.out.println();
                }
            }
        }
    }
}

