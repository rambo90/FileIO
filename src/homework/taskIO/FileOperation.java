package homework.taskIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    public static void copyFile(File in, File out) throws IOException {

        try (FileInputStream fis = new FileInputStream(in);
             FileOutputStream fos = new FileOutputStream(out)) {
            byte[] bufferArray = new byte[1024 * 1024 * 10];
            int n = 0;
            for (; (n = fis.read(bufferArray)) > 0; ) {
                fos.write(bufferArray, 0, n);
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
