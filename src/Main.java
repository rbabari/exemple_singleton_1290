//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Class main qui appel un singleton
 * @author Raouf B
 * @see <a href="www.yahoo.com">yahoo</a>
 */
public class Main {
    /**
     * <p>
     *     methode principale pour entrer à un programme
     *     <a href="www.google.com">test de google ... </a>
     * </p>
     *
     * @param args liste de chaine de caractere lors de l'appel
     */
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        }
}