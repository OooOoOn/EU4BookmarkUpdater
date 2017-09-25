import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

/**
 * Created by OooOoOn on 17/07/2017.
 */
public class FileReader {

    private Scanner x;
    StringBuilder s = new StringBuilder();
    StringBuilder temp = new StringBuilder();

    public void openFile(){
        try{
            x = new Scanner(new File("test.txt"));
        }
        catch (Exception e){
            System.out.println("could not find file");
        }
    }

    public void readFile() {
        while (x.hasNext()) {
            s.append(" " + x.next());
            temp.append(x.next());

            if (s.toString().equals("1500.3.3")){
                System.out.println(s);

            }
            else{
                s = new StringBuilder();
            }
        }
    }

    public String readAndReturnFile() {
            while (x.hasNext()) {

                if (x.next().toString().equals("1500.3.3")) {
                    s.append("1492.1.1");

                } else {
                    s.append(x.next() + " ");
                }


            }
            System.out.println(s);

        return (s.toString());

        }


    public void closeFile(){
        x.close();
    }

}
