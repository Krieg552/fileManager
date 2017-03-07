package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner newScanner= new Scanner(System.in);
        fileManager newFileManager=new fileManager();

        System.out.print("Create File, please Enter filepath : ");
        String filePath = newScanner.next();
        System.out.print("Enter fileName to create: ");
        String fileName = newScanner.next();
        newFileManager.createNewFile(filePath, fileName);

        System.out.print("Delete file, please enter filepath: ");
        String rmFilePath = newScanner.next();
        System.out.print("Enter fileName to delete: ");
        String rmFileName = newScanner.next();
        newFileManager.deleteSomeFile(rmFilePath, rmFileName);

        System.out.print("Enter new folder Path to create: ");
        String folderPath = newScanner.next();
        System.out.print("Enter new folder Name to create: ");
        String folderName = newScanner.next();
        newFileManager.createDirectory(folderPath, folderName);

    }
}
