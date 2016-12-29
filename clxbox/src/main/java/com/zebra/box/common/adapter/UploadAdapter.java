package com.zebra.box.common.adapter;

import java.util.HashMap;
import java.util.Map;

import com.zebra.box.common.UpLoad;
import com.zebra.box.common.impl.ImageUpLoad;
import com.zebra.box.common.impl.TextUpLoad;
import com.zebra.box.common.impl.VideoUpLoad;

/**
 * 文件上传适配器
 * 
 * @author 毛巳煜
 */
public final class UploadAdapter {

    private final static UploadAdapter uploadAdapter = new UploadAdapter();

    private Map<String, UpLoad> adapter = new HashMap<String, UpLoad>();

    private UploadAdapter() {

        // 为容器装配可使用类型
        adapter.put("image/jpeg", new ImageUpLoad());
        adapter.put("text/plain", new TextUpLoad());
        adapter.put("video/mp4", new VideoUpLoad());
    }

    public final static UploadAdapter getInstance() {

        return uploadAdapter;
    }

    /**
     * @param key
     * @return
     * @throws Exception
     */
    public final UpLoad adapter(String key) throws Exception {

        new UploadAdapter();
        if (null != adapter.get(key)) {
            return adapter.get(key);
        } else {
            throw new Exception("容器中无这个 " + key + " 匹配类型！");
        }
    }
}
