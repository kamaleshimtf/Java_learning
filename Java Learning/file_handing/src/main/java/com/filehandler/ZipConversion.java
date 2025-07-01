package com.filehandler;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipConversion {

    public void zipFile(String zipPath, String filePath){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zipPath);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            FileInputStream file = new FileInputStream(filePath);

            ZipEntry zipEntity = new ZipEntry(filePath);
            zipOutputStream.putNextEntry(zipEntity);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = file.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            fileOutputStream.close();
            System.out.println("ZIP file created successfully!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

