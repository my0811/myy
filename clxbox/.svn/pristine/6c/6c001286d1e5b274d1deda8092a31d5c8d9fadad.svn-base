package com.zebra.box.prop.modelprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VerifyCodeProp {

    // 验证码规则
    @Value("#{verifyCodeProperties['verifyCode.source']}")
    private String source;

    // 验证码个数
    @Value("#{verifyCodeProperties['verifyCode.size']}")
    private Integer size;

    // 验证码图片高度
    @Value("#{verifyCodeProperties['verifyCode.high']}")
    private Integer high;

    // 验证码图片宽度
    @Value("#{verifyCodeProperties['verifyCode.width']}")
    private Integer width;

    public String getSource() {

        return source;
    }

    public void setSource(String source) {

        this.source = source;
    }

    public Integer getSize() {

        return size;
    }

    public void setSize(Integer size) {

        this.size = size;
    }

    public Integer getHigh() {

        return high;
    }

    public void setHigh(Integer high) {

        this.high = high;
    }

    public Integer getWidth() {

        return width;
    }

    public void setWidth(Integer width) {

        this.width = width;
    }

}
