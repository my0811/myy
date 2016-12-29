package com.zebra.box.fw.utils;

import javax.servlet.http.HttpSession;

import com.zebra.box.constans.SessionKey;

/**
 * @PackageName: com.zebra.box.fw.utils
 * @FileName: WebUtils.java
 * @ClassName: WebUtils
 * @QualifiedName:com.zebra.box.fw.utils.WebUtils
 * @Description: severlet api 封装 工具类
 * @Author YangZhongKui yangzhongkui@diyfactory.com.cn
 * @Date 2015年12月16日 上午10:57:12
 * @Version V1.0
 */
public class WebUtils {

    private WebUtils() {

    }

    @SuppressWarnings("unchecked")
    public static <T> T getSessionVal(HttpSession session, SessionKey key, Class<T> classz) {

        return (T) (session == null ? null : session.getAttribute(key.toString()));
    }

    public static void setSessionVal(HttpSession session, SessionKey key, Object obj) {

        session.setAttribute(key.toString(), obj);
    }

    public static void removeSessionByKey(HttpSession session, SessionKey key) {

        session.removeAttribute(key.toString());
    }
}
