


/**
 * Class Singleton permet d'avoir une seule instance
 *  ctrl + alt + l : organise l'indentation de votre code
 *  static variable de classe vs this variable d'instance
 *  MaClasse.varStatic : unique pour toutes les instances
 *  vs MaClasse.varNonStatic : differente pour chaque instance
 * @author rbaba
 *
 */
public class Singleton {
    /**
     * instance statique du Singleton
     */
    private static Singleton instance = null;

    /**
     * Constructeur par defaut
     */
    private Singleton() {
        System.out.println("Appel au Constructor du Singleton");
        System.out.println("Faire qqchose");
    }

    /**
     * Constructeur avec parametres
     * @param str chaine de caractere qui recupere le nom de l'instance
     * @param i entier qui ....
     */

    private Singleton(String str, int i) {
        System.out.println("Appel au Constructor du Singleton");
        System.out.println("Faire qqchose");
    }

    /**
     * Recupère une instance unique du Singleton
     * @return instance de type Singleton
     */

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}


