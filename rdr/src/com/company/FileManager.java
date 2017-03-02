package com.company;
import java.io.File;
import java.io.IOException;

public class fileManager {

    public void createDirectory(String folderPath, String folderName) {
        File dir1 = new File(folderPath + folderName);
        dir1.mkdir();
    }
    public void createNewFile(String path, String fileName) throws IOException {
        File file1 = new File(path + fileName);
        file1.createNewFile();
    }
}
