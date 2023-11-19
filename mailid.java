import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class mailid {
    public static void main(String[] args) {
	System.out.println("Enter your mail id: ");
        Scanner S = new Scanner(System.in);
	String email = S.nextLine();

        if (mailfun(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

    public static boolean mailfun(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)+[A-Za-z]$";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(email);

        return mat.matches();
    }
}
