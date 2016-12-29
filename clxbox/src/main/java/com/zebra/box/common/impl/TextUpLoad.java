package com.zebra.box.common.impl;

import java.io.InputStream;

import com.zebra.box.common.UpLoad;
import com.zebra.box.common.fileoutput.FileOutput;

/**
 * 文本文件上传
 * 
 * @author 毛巳煜
 */
public class TextUpLoad implements UpLoad {

    public void upLoad() {

        System.out.println("文本文件上传");
    }

    public void upLoad(String fileName, InputStream input) {

        FileOutput.getFileOutput(fileName, input);
    }

}
