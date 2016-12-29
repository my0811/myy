package com.zebra.box.constans;

public enum SessionKey {
    // 合作申请表单验证码
    COOPAPPLY_VERIFY_CODE("cooApplyVerifyCode");

    private String key;

    SessionKey(String key) {

        this.key = key;

    }

    @Override
    public String toString() {

        return key;
    }

}
