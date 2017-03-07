package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String param;
        Integer flag = 1;
        Scanner newScanner = new Scanner(System.in);
        fileManager newFileManager = new fileManager();

            System.out.print("please choose action, or press 0 to exit:");
            param = newScanner.next();

        while (flag > 0) {
            if (param.equals("1")) {
                System.out.print("Create File, please Enter filepath : ");
                String filePath = newScanner.next();
                System.out.print("Enter fileName to create: ");
                String fileName = newScanner.next();
                newFileManager.createNewFile(filePath, fileName);
                //flag = 1;
            }
            else if(param.equals("2")) {
                System.out.print("Delete file, please enter filepath: ");
                String rmFilePath = newScanner.next();
                System.out.print("Enter fileName to delete: ");
                String rmFileName = newScanner.next();
                newFileManager.deleteSomeFile(rmFilePath, rmFileName);
                //flag = 0;
                }
            else if (param.equals("3"))  {
                System.out.print("Enter new folder Path to create: ");
                String folderPath = newScanner.next();
                System.out.print("Enter new folder Name to create: ");
                String folderName = newScanner.next();
                newFileManager.createDirectory(folderPath, folderName);
                //flag = 0;
                }
            else
                flag = 0;
                System.out.print("wrong aciton");
        }
    }
}
