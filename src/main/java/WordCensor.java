import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inString = sc.nextLine();

        String outString = inString.replace("dang", "***").replace("nuts","***").replace("oops","***").replace("yikes","***");
        System.out.println("Censored: " + outString);

        // sample output
        // oh gosh dangit, yikesy yowza, whoops! awh nuts!
        // Censored: oh gosh ***it, ***y yowza, wh***! awh ***!
    }
}
