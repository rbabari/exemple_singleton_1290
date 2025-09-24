public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Appel au Constructor du Singleton");
        System.out.println("Faire qqchose");
    }
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}


// ctrl + alt + l : organise l'indentation de votre code
// static variable de classe vs this variable d'instance
// MaClasse.varStatic : unique pour toutes les instances
// vs MaClasse.varNonStatic : differente pour chaque instance
