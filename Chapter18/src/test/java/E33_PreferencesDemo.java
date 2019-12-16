import java.util.Scanner;
import java.util.prefs.Preferences;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @Author ZhangGJ
 * @Date 2019/10/03
 */
public class E33_PreferencesDemo {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(E33_PreferencesDemo.class);
        String directory = prefs.get("base directory", "Not defined");
        print("directory: " + directory);
        Scanner sc = new Scanner(System.in);
        printnb("Enter a new directory: ");
        directory = sc.nextLine();
        prefs.put("base directory", directory);
        print("\ndirectory: " + directory);
    }
}
