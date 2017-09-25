/**
 * Created by OooOoOn on 18/07/2017.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuffertReader {

    BufferedReader br = null;
    StringBuilder s = new StringBuilder();
    FileUpdater u = new FileUpdater();
    String[] arrayOfFileData;
    int i = 0;

    public void BuffertReaderFile() {

        try {
            File folder = new File("C:\\Users\\OooOoOn\\Documents\\Paradox Interactive\\Europa Universalis IV\\mod\\historicalwars\\history\\temp\\");
            arrayOfFileData = new String[folder.listFiles().length];
            for (File f : folder.listFiles()) {
                //System.out.println(f.getName());
                //br = new BufferedReader(new FileReader("C:\\Users\\OooOoOn\\Desktop\\dev\\EU4BookmarkUpdater\\230 - Estremadura.txt"));
                br = new BufferedReader(new FileReader(f));
                String line = br.readLine();

                while (line != null) {
                    if (line.contains("1500.3.3") || line.contains("1520.5.5")) {
                        s.append("1492.1.1 = {" + "\n");
                    } else {
                        s.append(line + " " + "\n");
                    }
                    line = br.readLine();

                }
                if(i < folder.listFiles().length) {
                    arrayOfFileData[i] = s.toString();
                    i++;
                    s = new StringBuilder();

                    br.close();

                }

            }
            //System.out.println(arrayOfFileData.length);
            //System.out.println(arrayOfFileData[0]);
            u.openFile(arrayOfFileData); //send all files to FileUpdater.

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }


