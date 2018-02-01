import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean life = true;
        Contact listeContact[] = new Contact[20];
        boolean ajoutTel = true;
        int positionTel = 1;
        int nbrContact = 0;
        int nbrTelephone = 0;
        String modif;
        int reponse = 0;
        int positionContact = 0;

        while (life == true) {

            System.out.println("Bienvenue!");
            System.out.println();
            int choix = 0;

            System.out.println("1. Ajouter un contact");
            System.out.println("2. Modifier un contact");
            System.out.println("3. Afficher les contacts");
            System.out.println("4. Quitter");
            System.out.println("Que voulez-vous faire?");
            System.out.println();
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    nbrTelephone = 0;
                    ajoutTel = true;
                    positionContact++;
                    nbrContact++;
                    listeContact[positionContact] = new Contact();
                    listeContact[positionContact].setAdresse(new Adresse());
                    listeContact[positionContact].setOccupation(new Occupation());
                    listeContact[positionContact].getOccupation().setEntreprise(new Entreprise());
                    listeContact[positionContact].getOccupation().getEntreprise().setAdresseEn(new Adresse());

                            System.out.println("Ce contact sera entré à la position #" + positionContact + ".");
                            System.out.println("Veuillez entrer les informations suivantes :");
                            System.out.println("Prénom : ");
                            listeContact[positionContact].setPrenom(sc.next());
                            System.out.println("Nom :");
                            listeContact[positionContact].setNom(sc.next());
                            System.out.println("Adresse :");
                            System.out.println("    Numéro de porte : ");
                            listeContact[positionContact].getAdresse().setNumPorte(sc.nextInt());
                            System.out.println("    Rue : ");
                            listeContact[positionContact].getAdresse().setRue(sc.next());
                            System.out.println("    Appartement (falcultatif) :");
                            sc.nextLine();
                            modif = sc.nextLine().trim();
                            if (modif.equals("")){}
                            else {listeContact[positionContact].getAdresse().setNumAppart(Integer.parseInt(modif));}
                            System.out.println("    Ville :");
                            listeContact[positionContact].getAdresse().setVille(sc.next());
                            System.out.println("    Province :");
                            listeContact[positionContact].getAdresse().setProvince(sc.next());
                            System.out.println("    Pays :");
                            listeContact[positionContact].getAdresse().setPays(sc.next());
                            System.out.println("Occupation :");
                            System.out.println("    Poste :");
                            listeContact[positionContact].getOccupation().setPoste(sc.next());
                            System.out.println("Entreprise :");
                            System.out.println("    Nom :");
                            listeContact[positionContact].getOccupation().getEntreprise().setNom(sc.next());
                            System.out.println("Adresse : ");
                            System.out.println("    Numéro de porte :");
                            listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setNumPorte(sc.nextInt());
                            System.out.println("    Rue :");
                            listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setRue(sc.next());
                            System.out.println("    Appartement (facultatif) :");
                            sc.nextLine();
                            modif = sc.nextLine().trim();
                            if (modif.equals("")){}
                            else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setNumAppart(Integer.parseInt(modif));}
                            System.out.println("    Ville :");
                            listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setVille(sc.next());
                            System.out.println("    Province :");
                            listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setProvince(sc.next());
                            System.out.println("    Pays :");
                            listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setPays(sc.next());

                            while (ajoutTel == true) {

                                int choixTel = 0;
                                System.out.println("Entrer un numéro de téléphone ? 1- Oui 2- Non ");
                                choixTel = sc.nextInt();

                                if (choixTel == 1) {
                                    nbrTelephone++;
                                    positionTel++;
                                    listeContact[positionContact].setNbrTel(listeContact[positionContact].getNbrTel() + 1);
                                    listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()] = new Telephone();
                                    System.out.println("À quoi correspond ce numéro (cellulaire, maison, travail, …) ?");
                                    listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()].setInformation(sc.next());
                                    System.out.println("Quel est le numéro ?");
                                    listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()].setNumTel(sc.next());

                                } else if (choixTel == 2) {
                                    ajoutTel = false;
                                }
                            }
                    System.out.println("Votre contact a été entré avec succès !");
                            System.out.println();
                    break;

                case 2:

                    System.out.println("Quel est le numéro du contact ? ");
                    positionContact = sc.nextInt();

                    if (positionContact <= nbrContact) {
                        System.out.println("Veuillez entrer les informations suivantes (laisser vide si correct) :");
                        sc.nextLine();
                        System.out.println("Prénom (" + listeContact[positionContact].getPrenom() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].setPrenom(modif);}
                        System.out.println("Nom (" + listeContact[positionContact].getNom() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].setNom(modif);}
                        System.out.println("Adresse :");
                        System.out.println("    Numéro de porte (" + listeContact[positionContact].getAdresse().getNumPorte() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setNumPorte(Integer.parseInt(modif));}
                        System.out.println("    Rue : (" + listeContact[positionContact].getAdresse().getRue() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setRue(modif);}
                        System.out.println("    Appartement (" + listeContact[positionContact].getAdresse().getNumAppart() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setNumAppart(Integer.parseInt(modif));}
                        System.out.println("    Ville (" + listeContact[positionContact].getAdresse().getVille() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setVille(modif);}
                        System.out.println("    Province (" + listeContact[positionContact].getAdresse().getProvince() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setProvince(modif);}
                        System.out.println("    Pays (" + listeContact[positionContact].getAdresse().getPays() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getAdresse().setPays(modif);}
                        System.out.println("Occupation :");
                        System.out.println("    Poste (" + listeContact[positionContact].getOccupation().getPoste() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().setPoste(modif);}
                        System.out.println("Entreprise :");
                        System.out.println("    Nom (" + listeContact[positionContact].getOccupation().getEntreprise().getNom() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().setNom(modif);}
                        System.out.println("Adresse : ");
                        System.out.println("    Numéro de porte (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getNumPorte() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setNumPorte(Integer.parseInt(modif));}
                        System.out.println("    Rue (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getRue() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setRue(modif);}
                        System.out.println("    Appartement (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getNumAppart() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setNumAppart(Integer.parseInt(modif));}
                        System.out.println("    Ville (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getVille() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setVille(modif);}
                        System.out.println("    Province (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getProvince() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setProvince(modif);}
                        System.out.println("    Pays (" + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getPays() + ") : ");
                        modif = sc.nextLine().trim();
                        if (modif.equals("")){}
                        else {listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().setPays(modif);}

                        ajoutTel = true;

                        while (ajoutTel == true) {

                            int choixTel = 0;
                            System.out.println("Entrer un numéro de téléphone ? 1- Oui 2- Non ");
                            choixTel = sc.nextInt();

                            if (choixTel == 1) {
                                nbrTelephone++;
                                positionTel++;
                                listeContact[positionContact].setNbrTel(listeContact[positionContact].getNbrTel() + 1);
                                listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()] = new Telephone();
                                System.out.println("À quoi correspond ce numéro (cellulaire, maison, travail, …) ?");
                                listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()].setInformation(sc.next());
                                System.out.println("Quel est le numéro ?");
                                listeContact[positionContact].getListeNumTel()[listeContact[positionContact].getNbrTel()].setNumTel(sc.next());

                            } else if (choixTel == 2) {
                                ajoutTel = false;
                            }
                        }
                        System.out.println("Votre contact a été modifié avec succès !");
                        System.out.println();
                        break;
                    }
                    else
                        System.out.println("Ce contact n'existe pas");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Vous avez " + nbrContact + " contact(s)");
                    positionContact = 0;
                    for (int i = 0; i < nbrContact; i++)
                    {
                        positionContact++;
                        System.out.println();
                        System.out.println("Contact #" + positionContact + " :");
                        System.out.println("------------");
                        System.out.println("Prénom : " + listeContact[positionContact].getPrenom());
                        System.out.println("Nom : " + listeContact[positionContact].getNom());
                        System.out.println("Adresse :");
                        System.out.println("    Numéro de porte : " + listeContact[positionContact].getAdresse().getNumPorte());
                        System.out.println("    Rue : " + listeContact[positionContact].getAdresse().getRue());
                        System.out.println("    Appartement : " + listeContact[positionContact].getAdresse().getNumAppart());
                        System.out.println("    Ville : " + listeContact[positionContact].getAdresse().getVille());
                        System.out.println("    Province : " + listeContact[positionContact].getAdresse().getProvince());
                        System.out.println("    Pays : " + listeContact[positionContact].getAdresse().getPays());
                        System.out.println("Occupation : ");
                        System.out.println("    Poste : " + listeContact[positionContact].getOccupation().getPoste());
                        System.out.println("Entreprise : ");
                        System.out.println("    Nom : " + listeContact[positionContact].getOccupation().getEntreprise().getNom());
                        System.out.println("Adresse : ");
                        System.out.println("    Numéro de porte : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getNumPorte());
                        System.out.println("    Rue : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getRue());
                        System.out.println("    Appartement : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getNumAppart());
                        System.out.println("    Ville : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getVille());
                        System.out.println("    Province : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getProvince());
                        System.out.println("    Pays : " + listeContact[positionContact].getOccupation().getEntreprise().getAdresseEn().getPays());
                        System.out.println();

                        System.out.println("Téléphones : ");
                        for (int j = 0; j < listeContact[positionContact].getNbrTel() + 1; j++)
                        {
                           System.out.println("    " + listeContact[positionContact].getListeNumTel()[j].getInformation() + " : "
                                   + listeContact[positionContact].getListeNumTel()[j].getNumTel());
                        }
                    }
                    System.out.println();
                    break;

                case 4 : System.out.println("Au revoir !");
                life = false;
                    break;

            }

        }
    }
}
