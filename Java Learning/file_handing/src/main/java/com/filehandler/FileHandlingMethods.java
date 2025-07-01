package com.filehandler;

import java.io.*;

public class FileHandlingMethods {

    public boolean folderWithFiles(String folderPath, String fileName) {
        try {
            File createDirectory = new File(folderPath);
            if (createDirectory.mkdir()) {
                File responseFile = new File(createDirectory, fileName);
                System.out.println("Directory created name is : " + createDirectory.getName());
                return responseFile.createNewFile();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Directory not created");
        return false;
    }

    public boolean createFile(String filePath) {
        File fileCreate = new File(filePath);
        try {
            return fileCreate.createNewFile();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean deleteFile(String filePath){
        File fileDelete = new File(filePath);
        return fileDelete.delete();
    }

    public void readFile(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
            fileReader.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void bufferReader(String filePath){
        try{
            BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath));
            String line;
            System.out.println("Using BufferedReader : ---->");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFile(String filePath, String content){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            System.out.println("File written to " + filePath);
            fileWriter.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean checkFullPermissions(String filePath){
        File file = new File(filePath);
        if (file.exists()) {
            return file.setWritable(true, true) &&
                    file.setReadable(true, true) &&
                    file.setExecutable(true, true);
        }
        return false;
    }

    public void exceptionMethods() {
        File file = new File("MyDirectory/sample.txt");
        boolean result = file.setReadable(false);
        System.out.println("Read permission removed? " + result);
        System.out.println("Can read? " + file.canRead());
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("IOException occurred while reading file: " + e.getMessage());
        }
    }

    public String getFileName(String filePath){
        File file = new File(filePath);
        if(file.exists()){
            return file.getName();
        }
        return "Empty File";
    }

    public void commonMethods(String filePath) {

        File file = new File(filePath);

        System.out.println("Check Readable access: " + file.canRead());
        System.out.println("Check write access: " + file.canWrite());
        System.out.println("Check existence: " + file.exists());
        System.out.println("Length of that file: " + file.length());

        String[] listFiles = file.list();
        System.out.println("List of files: " + listFiles);


        File createDirectory = new File("MyDirectory");
        if(createDirectory.mkdir()) {
            File responseFile = new File(createDirectory,"sample.text");

            System.out.println("Directory created name is : " + createDirectory.getName());
        }
        else {
            System.out.println("Directory not created: " + createDirectory.getName());
        }
        System.out.println("Absolute path is : " + file.getAbsolutePath());
        System.out.println("Delete directory: " + createDirectory.delete());

    }

    public void outputStreamExample(String filePath) {
        try {
            OutputStream outputStream = new FileOutputStream(filePath);

            outputStream.write(65);

            String writeName = "I am kamalesh";
            outputStream.write(writeName.getBytes());

            String writeContent = "I am software engineer";
            outputStream.write(writeContent.getBytes(), 4, 9);

            outputStream.flush();

            outputStream.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputStreamExample(String filePath){
        try {
            InputStream fileInputStream = new FileInputStream(filePath);


            System.out.println("Available Method : " + fileInputStream.available());

            int readData;
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println("Read a raw Data : " + readData);
                System.out.println("Change to Type casting it : " + (char) readData);
            }


            byte[] readByteData = new byte[5];
            int readBytes;
            while ((readBytes = fileInputStream.read(readByteData)) != -1) {
                System.out.println("Read a raw Data : " + readBytes + " Bytes printing : "
                        + new String(readByteData, 0, readBytes));
            }


            long skipBytesData;
            while(fileInputStream.available() > 0){
                System.out.println("Available Method : " + fileInputStream.available());
                skipBytesData = fileInputStream.skip(2);
                System.out.println("Skip bytes : " + skipBytesData);
            }

            fileInputStream.close();


            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

            if(bufferedInputStream.markSupported()) {
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());

                bufferedInputStream.mark(2);

                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());

                bufferedInputStream.reset();

                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
                System.out.print((char) bufferedInputStream.read());
            }

            bufferedInputStream.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
