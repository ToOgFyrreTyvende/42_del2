import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale currentLocale = new Locale("da", "DK");
        ResourceBundle messages = ResourceBundle.getBundle("Translation", currentLocale);

        String msg1 = messages.getString("greetings");
        System.out.println(msg1);
        System.out.println("mems");
    }
}
