import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Telephone implements Serializable {

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
        telephone.information = Main.caractere();
        System.out.println("Quel est le numéro ?");
        telephone.numTel = verifierTel();
        return telephone;
    }

    public void afficherTelephone(){

        System.out.println("    " + getInformation() + " : " + getNumTel());
    }

    public void modifTelephone(){
        Scanner sc = new Scanner(System.in);
        String modif;
        System.out.println("    " + getInformation() + " : " + getNumTel());
        modif = verifierTel().trim();
        if (modif.equals("")) {
        } else {setNumTel(modif);}

    }
    public static String verifierTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String tel = sc.nextLine();

            if (tel.length() == 12) {

                if (tel.charAt(0) >= 48 && tel.charAt(0) <= 57)
                {
                    if (tel.charAt(1) >= 48 && tel.charAt(1) <= 57)
                    {
                        if (tel.charAt(2) >= 48 && tel.charAt(2) <= 57)
                        {
                            if (tel.charAt(3) == 45 && tel.charAt(7) == 45 )
                            {
                                if (tel.charAt(4) >= 48 && tel.charAt(4) <= 57)
                                {
                                    if (tel.charAt(5) >= 48 && tel.charAt(5) <= 57)
                                    {
                                        if (tel.charAt(6) >= 48 && tel.charAt(6) <= 57)
                                        {
                                            if (tel.charAt(7) == 45 && tel.charAt(7) == 45 )
                                            {
                                                if (tel.charAt(8) >= 48 && tel.charAt(8) <= 57)
                                                {
                                                    if (tel.charAt(9) >= 48 && tel.charAt(9) <= 57)
                                                    {
                                                        if (tel.charAt(10) >= 48 && tel.charAt(10) <= 57)
                                                        {
                                                            if (tel.charAt(11) >= 48 && tel.charAt(11) <= 57)
                                                            {
                                                                return tel;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
            else if (tel.equals("")){
                return tel;
            }
            System.out.println("Veuillez entrer un numéro du format XXX-XXX-XXXX");
        }
    }


}
