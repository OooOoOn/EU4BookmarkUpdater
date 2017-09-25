import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by OooOoOn on 17/07/2017.
 */
public class FileUpdater {

    private Formatter x;
    private int i = 0;

    public void openFile(String[] arrayOfFileData){
        //System.out.println(arrayOfFileData.length);
        try {
            File folder = new File("C:\\Users\\OooOoOn\\Documents\\Paradox Interactive\\Europa Universalis IV\\mod\\historicalwars\\history\\temp\\");
            for (File f : folder.listFiles()) {
                x = new Formatter(f);
                x.format(arrayOfFileData[i]);
                x.flush();
                x.close();
                i++;
                System.out.println("File " + i);

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
