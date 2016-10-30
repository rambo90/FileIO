package homework.taskIO;

import java.io.File;
import java.io.IOException;

public class CopyPaste {
    public static void start() {
        MyFileFilter mFF = new MyFileFilter("doc");
        File folderIn = new File("F:\\Загрузки");
        File[] fileList = folderIn.listFiles(mFF);
        for (File file : fileList) {
            System.out.println(file);
            try {
                File folderOut = new File(file.getName());
                FileOperation.copyFile(file, folderOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
