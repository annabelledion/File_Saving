import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Telephone {

    private String information;
    private String numTel;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public static Telephone addTelephone(){

        Scanner sc = new Scanner(System.in);

        Telephone telephone = new Telephone();

        System.out.println("À quoi correspond ce numéro (cellulaire, maison, travail, …) ?");
        telephone.information = sc.next();
        System.out.println("Quel est le numéro ?");
        telephone.numTel = sc.next();
        return telephone;
    }

    public void afficherTelephone(){

        System.out.println("    " + getInformation() + " : " + getNumTel());
    }

    public void modifTelephone(){
        Scanner sc = new Scanner(System.in);
        String modif;
        System.out.println("    " + getInformation() + " : " + getNumTel());
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {setNumTel(modif);}

    }
}
