package com.zebra.box.db.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zebra.box.common.adapter.UploadAdapter;
import com.zebra.box.db.service.Help;

@Service("helpImpl")
public class HelpImpl implements Help {

    public String insertHelp(MultipartFile[] files) {

        // 上传文件
        fileUpload(files);
        return "";
    }

    /**
     * 区分类型分别上传
     * 
     * @param fileContentType
     */
    private void fileUpload(MultipartFile[] files) {

        String fileContentType = "";
        try {
            for (MultipartFile file : files) {
                fileContentType = String.valueOf(file.getContentType());
                UploadAdapter.getInstance().adapter(fileContentType).upLoad(file.getOriginalFilename(), file.getInputStream());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
