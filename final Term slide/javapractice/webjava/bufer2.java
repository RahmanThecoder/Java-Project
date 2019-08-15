import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class ReadFileExample_jdk7 {

 private static final String FILENAME = "C:\\Users\\Asus\\Desktop\\password.txt";

 public static void main(String[] args) {

  try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

   String strCurrentLine;

   while ((strCurrentLine = br.readLine()) != null) {
    System.out.println(strCurrentLine);
   }

  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}