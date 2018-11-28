import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.Formatter;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by OooOoOn on 17/07/2017.
 */
public class FileUpdater {

    private Formatter x;
    private int i = 0;
    private BufferedWriter writer;

    public void openFile(String[] arrayOfFileData){

        try {
            File folder = new File("C:\\Users\\OooOoOn\\Desktop\\temp\\");
            for (File f : Objects.requireNonNull(folder.listFiles())) {
                writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "Cp1252"));
                writer.write(arrayOfFileData[i].toString());
                writer.flush();
                writer.close();
                //x = new Formatter(f);
                //x.format(arrayOfFileData[i]);
                //x.flush();
                //x.close();
                i++;
                System.out.println("File " + i + " has been updated.");

            }
        }
        catch (Exception e){
            System.out.println("could not find file" + i);
        }



    }

    public void formatFile(String returnedValue) {
            x.format(returnedValue);
    }

    public void closeFile(){
        x.close();
    }

}
