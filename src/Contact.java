/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Contact {

    private String prenom;
    private String nom;
    private Adresse adresse;
    private Occupation occupation;
    private Telephone listeNumTel[] = new Telephone[10];
    private int nbrTel = -1;

    public int getNbrTel() {
        return nbrTel;
    }

    public void setNbrTel(int nbrTel) {
        this.nbrTel = nbrTel;
    }



    public Telephone[] getListeNumTel() {
        return listeNumTel;
    }

    public void setListeNumTel(Telephone[] listeNumTel) {
        this.listeNumTel = listeNumTel;
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


}
