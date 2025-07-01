package com.filehandler;

public class MainClass {
    public static void main(String[] args) {
        FileHandlingMethods fileHandlingMethods = new FileHandlingMethods();

        ZipConversion zipConversion = new ZipConversion();

        String folderPath = "fileDemo";
        String filePath = "test.txt";

        System.out.println("...Creating file...");
        boolean created = fileHandlingMethods.createFile(filePath);
        System.out.println("File created: " + created);

        System.out.println("...Writing to file...");
        fileHandlingMethods.writeFile(filePath, "Hello, this is a test. Welcome to file handling!");

        System.out.println("...Reading file (char by char)...");
        fileHandlingMethods.readFile(filePath);

        System.out.println("...Reading file (BufferedReader)...");
        fileHandlingMethods.bufferReader(filePath);

        System.out.println("Setting and checking permissions:");
        boolean permissionsSet = fileHandlingMethods.checkFullPermissions(filePath);
        System.out.println("Permissions set? " + permissionsSet);

        System.out.println("...Getting file name...");
        System.out.println("File name: " + fileHandlingMethods.getFileName(filePath));

        System.out.println("...File details...");
        fileHandlingMethods.commonMethods(filePath);

        System.out.println("...Creating directory and file...");
        boolean dirCreated = fileHandlingMethods.folderWithFiles(folderPath, filePath);
        System.out.println("Directory + file created: " + dirCreated);

        System.out.println("...Writing to file using OutputStream...");
        fileHandlingMethods.outputStreamExample(filePath);

        System.out.println("...Reading file using InputStream...");
        fileHandlingMethods.inputStreamExample(filePath);

        System.out.println("...Zip converting...");
        zipConversion.zipFile(folderPath, filePath);

    }
}
