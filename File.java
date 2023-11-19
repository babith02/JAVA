import java.io.*;

class File {
    public static void main(String args[]) {
        try {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("------FILE WRITE------");
            System.out.println("Enter Text:");
            String text = inp.readLine();

            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write(text);
            writer.close();
            System.out.println("Content Written Successfully");

            System.out.println("------FILE READ-------");
            BufferedReader reader = new BufferedReader(new FileReader("out.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("Content Read Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}