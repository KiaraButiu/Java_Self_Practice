package replit.StringMethods;

public class InitialsChuckNoris {
    public static void main(String[] args) {
        String name = "chuck noris";

        name = name.toUpperCase().trim();
        System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".");


//        String firstInitial = name.substring(0,1).toUpperCase();
//
//        int space = name.indexOf(" ");
//        String lastInitial = name.substring(space + 1,space +2).toUpperCase();
//
//        System.out.println(firstInitial + "." + lastInitial + ".");

    }
}
