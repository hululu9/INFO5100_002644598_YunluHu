import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Password：Start with a letter; the length is between 6 and 18; only contain letters, numbers and underscores");
        String regex1 = "^[a-zA-Z]\\w{5,17}$";
        String s1 = "Happy_233";
        String s2 = "_fal";
        System.out.println(s1 + " " + s1.matches(regex1));
        System.out.println(s2 + " " + s2.matches(regex1));

        System.out.println("2. Phone number in US format");
        String regex2 = "^\\(?[2-9][0-9]{2}\\)?[-]?[0-9]{3}[-]?[0-9]{4}$";
        String s3 = "(781)-456-7890";
        String s4 = "12-345-6789";
        System.out.println(s3 + " " + s3.matches(regex2));
        System.out.println(s4 + " " + s4.matches(regex2));

        System.out.println("3. Email address");
        String regex3 = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-z]{2,5})$";
        String s5 = "abc-def@gmail.com";
        String s6 = "a123123ost.com";
        System.out.println(s5 + " " + s5.matches(regex3));
        System.out.println(s6 + " " + s6.matches(regex3));

        System.out.println("4. Zip Code in China");
        String regex4 = "^[1-9]\\d{5}$";
        String s7 = "433199";
        String s8 = "02453";
        System.out.println(s7 + " " + s7.matches(regex4));
        System.out.println(s8 + " " + s8.matches(regex4));

        System.out.println("5. Positive integer or decimal");
        String regex5 = "^[1-9]+(\\.\\d*)?$|[0]";
        String s9 = "0";
        String s10 = "1.5";
        String s11 = "a";
        System.out.println(s9 + " " + s9.matches(regex5));
        System.out.println(s10 + " " + s10.matches(regex5));
        System.out.println(s11 + " " + s11.matches(regex5));








    }
}