import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Occupation {

    private String poste;
    private Entreprise entreprise;

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public static Occupation addOccupation(){

        Scanner sc = new Scanner(System.in);

        Occupation occupation = new Occupation();

        System.out.println("Occupation :");
        System.out.println("    Poste :");
        occupation.poste = sc.next();
        Entreprise entreprise = Entreprise.addEntreprise();
        occupation.setEntreprise(entreprise);

        return occupation;
    }

    public void afficherOccupation(){
        System.out.println("Occupation : ");
        System.out.println("    Poste : " + getPoste());
        getEntreprise().afficherEntreprise();
    }

    public void modifOccupation(){

        Scanner sc = new Scanner(System.in);
        String modif;

        System.out.println("Occupation :");
        System.out.println("    Poste (" + getPoste() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setPoste(modif);}
        getEntreprise().modifEntreprise();
    }


}
