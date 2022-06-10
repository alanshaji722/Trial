import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Filewrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
          FileWriter dataWriter = new FileWriter("DATA.txt")) {
              dataWriter.write("Hai Hallo");
              dataWriter.write(" World");
          }
        } catch (IOException ex) {
            System.out.println("An error occured !");
        }
         
         
         try{
            File dataFile = new File("DATA.txt");
          try (Scanner dataRead = new Scanner(dataFile)) {
              while(dataRead.hasNextLine()){
                  System.out.println(dataRead.nextLine());
              }
          }
        }catch(FileNotFoundException ex){
            System.out.println("An error occured !");
        }

}
}
