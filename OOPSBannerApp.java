/**
 * OOPSBannerApp UC3 - OOPS Banner using String.join()
 *
 * This program prints OOPS banner using String.join()
 * for better memory efficiency and cleaner code.
 *
 * @author Bhuvan
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        
        String[] lines = {
            String.join(" ", " ***** ", " ***** ", " ******", " ******"),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "****** ", " *****"),
            String.join(" ", "*     *", "*     *", "*      ", "     *"),
            String.join(" ", "*     *", "*     *", "*      ", "*    *"),
            String.join(" ", " ***** ", " ***** ", "*      ", " ****")
        };

        for (String line : lines) {
            System.out.println(line);
        }

    }
}