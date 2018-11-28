/**
 * Created by OooOoOn on 18/07/2017.
 */

import java.io.*;
import java.io.FileReader;

public class BuffertReader {

    BufferedReader br = null;
    StringBuilder s = new StringBuilder();
    FileUpdater u = new FileUpdater();
    String[] arrayOfFileData;
    int i = 0;

    public void BuffertReaderFile() {

        try {
            File folder = new File("C:\\Users\\OooOoOn\\Desktop\\temp\\");
            arrayOfFileData = new String[folder.listFiles().length];
            for (File f : folder.listFiles()) {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "Cp1252"));
                //br = new BufferedReader(new FileReader(f));
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
            u.openFile(arrayOfFileData); //send all files to FileUpdater.

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        }
    }


