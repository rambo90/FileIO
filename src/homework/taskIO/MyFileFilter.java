package homework.taskIO;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    private boolean check(String ext) {
        if (this.ext.equals(ext)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}
