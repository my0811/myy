package com.zebra.box.controller.demo;

import org.junit.Test;

import com.zebra.framework.test.SpringMVCJunit4Test;

import contants.TestContant;

public class ControllerDemoest extends SpringMVCJunit4Test {

    @Test
    public void findUsersTest() throws Exception {

        // HashMap<String, String> map = new HashMap<String, String>();
        // map.put("userName", "鏉ㄤ腑濂�");
        // map.put("password", "123456");
        // map.put("acccount", "yangyang");
        // map.put("mobile", "15504265889");
        // super.rqTest("/user/findUsers", map);
    }

    @Override
    public String getLogLocation() {

        return TestContant.log4jPath;

    }
}
