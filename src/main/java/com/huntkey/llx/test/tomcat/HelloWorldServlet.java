package com.huntkey.llx.test.tomcat;

import java.io.IOException;

/**
 * Created by lulx on 2019/2/20 0020 上午 11:33
 */
public class HelloWorldServlet extends MyServlet {
    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dePost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
