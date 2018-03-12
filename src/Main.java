import java.awt.*;
import java.util.*;

/**
 * Created by DioAn1730700 on 2018-01-22.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean life = true;
        HashMap<String, Contact> map = new HashMap<String, Contact>();
        int reponse = 0;
        int positionContact = 0;
        String cle;
        Queue<Contact> listRappel = new LinkedList<>();

        while (life == true) {

            System.out.println("Bienvenue!");
            System.out.println();
            int choix = 0;

            System.out.println("1. Ajouter un contact");
            System.out.println("2. Modifier un contact");
            System.out.println("3. Afficher les contacts");
            System.out.println("4. Supprimer un contact");
            System.out.println("5. Ajouter un contact à la liste de rappel");
            System.out.println("6. Voir le contact prioritaire à rappeler");
            System.out.println("7. Quitter");
            System.out.println("Que voulez-vous faire?");
            System.out.println();
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    Contact contact = Contact.addContact();
                    map.put(contact.getPrenom(), contact);
                    System.out.println("Votre contact a été entré avec succès !");
                            System.out.println();
                    break;

                case 2:

                    System.out.println("Quel est le prénom du contact ? ");
                    cle = sc.next().toLowerCase();
                    if (map.containsKey(cle)) {
                        Contact contact1 = map.get(cle);
                        contact1.modifContact();
                        System.out.println("Votre contact a été modifié avec succès !");
                        System.out.println();
                    }
                    else System.out.println("Le contact n'existe pas");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Vous avez " + map.size() + " contact(s)");
                    for (Contact contact1 : map.values())
                    {
                        positionContact++;
                        contact1.afficherContact();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Quel est le prénom du contact que vous voulez supprimer ? ");
                    cle = sc.next().toLowerCase();
                    if (map.containsKey(cle)) {
                        map.remove(cle);
                        System.out.println("Votre contact a été supprimé avec succès !");
                        System.out.println();
                    }
                    else System.out.println("Le contact n'existe pas");
                    System.out.println();

                    break;

                case 5:
                    System.out.println("Quel est le prénom du contact que vous voulez rajouter à la liste de rappel ? ");
                    cle = sc.next();
                    if (map.containsKey(cle)) {
                        listRappel.add(map.get(cle));
                        System.out.println("Le contact a été rajouté à la liste de rappel !");
                        System.out.println();
                    }else System.out.println("Le contact n'existe pas");
                    System.out.println();

                    break;

                case 6:
                    if (listRappel.isEmpty()) {
                        System.out.println("La liste de rappel est vide");
                    }else System.out.println("Vous devez rappeler : " + listRappel.remove().getPrenom());

                    break;

                case 7 : System.out.println("Au revoir !");
                life = false;

                    break;

            }
    }
        }
    }
