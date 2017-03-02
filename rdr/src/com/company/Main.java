package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner newScanner= new Scanner(System.in);

        System.out.print("Enter folder Path: ");
        String folderPath = newScanner.next();

        System.out.print("Enter folder Name: ");
        String folderName = newScanner.next();

        fileManager newFileManager=new fileManager();

        newFileManager.createDirectory(folderPath, folderName);

        System.out.print("Enter filepath: ");
        String filePath = newScanner.next();

        System.out.print("Enter fileName: ");
        String fileName = newScanner.next();
//test
        newFileManager.createNewFile(filePath, fileName);
    }
}
