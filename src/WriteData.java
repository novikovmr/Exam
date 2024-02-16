

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void createFile(String[] dataArray) throws IOException {
        String filename = dataArray[0] + ".txt";
        try {
            File path = new File(filename);

            if(!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bWriter = new BufferedWriter(new FileWriter(path, true));

            String writeStr = String.join(" ", dataArray);

            bWriter.write(writeStr);
            bWriter.newLine();
            bWriter.close();
        }
        catch (IOException e){
            throw new IOException("Ошибка во время создания  / записи файла");
        }
    }
}

