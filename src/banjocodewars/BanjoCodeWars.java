
package banjocodewars;

public class BanjoCodeWars {

    public static String areYouPlayingBanjo(String name) {
        char slovo = name.charAt(0);
        if ((slovo == 'r') || (slovo == 'R')) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }

    }

    public static void main(String[] args) {

        System.out.println(areYouPlayingBanjo("Rodja"));
        System.out.println(areYouPlayingBanjo("Zara"));

    }

}
