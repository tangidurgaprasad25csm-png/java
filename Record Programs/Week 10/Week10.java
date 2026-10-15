import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Week10 {
    public static void main(String[] args) {
        String text = "Peter Piper picked a peck of pickled peppers\n" +
                      "A peck of pickled peppers Peter Piper picked\n" +
                      "If Peter Piper picked a peck of pickled peppers\n" +
                      "Where's the peck of pickled peppers Peter Piper picked?";

        int peCount = 0, piCount = 0;

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(text);
            fw.close();

            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length() - 1; i++) {
                    String pattern = line.substring(i, i + 2);

                    if (pattern.equalsIgnoreCase("pe"))
                        peCount++;

                    if (pattern.equalsIgnoreCase("pi"))
                        piCount++;
                }
            }

            br.close();

            System.out.println("'pe' - no of occurrences - " + peCount);
            System.out.println("'pi' - no of occurrences - " + piCount);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
