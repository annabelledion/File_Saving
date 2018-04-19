import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Contact implements Serializable{

    private String prenom;
    private String nom;
    private Adresse adresse;
    private Occupation occupation;
    private List<Telephone> listeNumTel = new ArrayList<>();
    private int nbrTel = -1;
    private int nbrContact;

    public List<Telephone> getListeNumTel() {
        return listeNumTel;
    }

    public void setListeNumTel(List<Telephone> listeNumTel) {
        this.listeNumTel = listeNumTel;
    }

    public int getNbrContact() {
        return nbrContact;
    }

    public void setNbrContact(int nbrContact) {
        this.nbrContact = nbrContact;
    }

    public int getNbrTel() {
        return nbrTel;
    }

    public void setNbrTel(int nbrTel) {
        this.nbrTel = nbrTel;
    }



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public static Contact addContact(){

        Scanner sc = new Scanner(System.in);
        int positionContact = 0;

        Contact contact = new Contact();
        contact.setNbrContact(contact.getNbrContact() + 1);
        positionContact++;
        System.out.println("Ce contact sera entré à la position #" + positionContact + ".");
        System.out.println("Veuillez entrer les informations suivantes :");
        System.out.println("Prénom : ");
        contact.prenom = Main.caractere().toLowerCase();
        System.out.println("Nom :");
        contact.nom = Main.caractere();
            Adresse adresse  = Adresse.addAdresse();
            contact.setAdresse(adresse);
        Occupation occupation = Occupation.addOccupation();
        contact.setOccupation(occupation);
        boolean ajoutTel = true;
        while (ajoutTel == true) {

            int choixTel = 0;
            System.out.println("Entrer un numéro de téléphone ? 1- Oui 2- Non ");
            choixTel = sc.nextInt();

            if (choixTel == 1) {
                contact.getListeNumTel().add(Telephone.addTelephone());

            } else if (choixTel == 2) {
                ajoutTel = false;
            } else if (choixTel >= 3){
                System.out.println("Entrez un nombre entre 1 et 2");
                ajoutTel = true;
            }
        }
        return contact;
    }

    public void modifContact() {

        Scanner sc = new Scanner(System.in);

        String modif;

        System.out.println("Veuillez entrer les informations suivantes (***Entrez un espace*** si correct) :");
        System.out.println("Prénom (" + getPrenom() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setPrenom(modif);}
        System.out.println("Nom (" + getNom() + ") : ");
        modif = Main.caractere().trim();
        if (modif.equals("")) {
        } else {setNom(modif);}
        getAdresse().modifAdresse();
        getOccupation().modifOccupation();

        System.out.println("Téléphones : ");
        for ( Telephone telephone : listeNumTel)
        {
            telephone.modifTelephone();
        }
    }

    public void afficherContact(){

        Scanner sc = new Scanner(System.in);
        int positionContact = 1;

        System.out.println();
        System.out.println("Contact #" + positionContact + " :");
        System.out.println("------------");
        System.out.println("Prénom : " + getPrenom());
        System.out.println("Nom : " + getNom());
        getAdresse().afficherAdresse();
        getOccupation().afficherOccupation();
        System.out.println();

        System.out.println("Téléphones : ");
        for ( Telephone telephone : listeNumTel)
        {
           telephone.afficherTelephone();
        }
    }


}
