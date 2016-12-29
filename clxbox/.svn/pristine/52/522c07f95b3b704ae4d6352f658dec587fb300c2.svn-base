package com.zebra.box.common.fileoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件上传 写到磁盘
 * 
 * @author 毛巳煜
 */
public class FileOutput {

    public static void getFileOutput(String fileName, InputStream input) {

        String path = "F:/upload/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        try (OutputStream output = new FileOutputStream(path + fileName)) {
            byte[] buffer = new byte[1024];
            while (true) {
                int byteRead = input.read(buffer);
                if (byteRead == -1)
                    break;
                output.write(buffer, 0, byteRead);
            }
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
