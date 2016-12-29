package com.zebra.box.common;

import java.io.InputStream;

/**
 * 上传 抽象产品
 * 
 * @author 毛巳煜
 */
public interface UpLoad {

    /** 上传文件 */
    public void upLoad();

    /**
     * 上传文件
     * 
     * @param fileName 文件名
     * @param input 文件流
     */
    public void upLoad(String fileName, InputStream input);
}
