public class java_algo {
}

// ---------FONCTION 1----------

    public static int saisirEntier() {

        int entier = 0;
        boolean encore = true;
        String valeurSaisie = "0";

        while (encore == true) {
            valeurSaisie = showInputDialog(null, "Veuillez la valeur d'un entier ", "Entier", QUESTION_MESSAGE);
            try {
                entier = new Integer(valeurSaisie);
                System.out.println("entier vaut : " + entier);
                encore = false;
            } catch (NumberFormatException nfe) {
                showMessageDialog(null, "Veuillez entrer un entier SVP ", "Erreur", ERROR_MESSAGE);
            }
        }
        return entier;
    }

// ---------FONCTION 2----------

    public static void afficherBoiteDeDialogue(String message, String titre) {
        showMessageDialog(null, message, titre, INFORMATION_MESSAGE);
    }
