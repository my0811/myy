package com.zebra.box.db.service;

import org.springframework.web.multipart.MultipartFile;

public interface Help {

    public String insertHelp(MultipartFile[] fileName);
}
