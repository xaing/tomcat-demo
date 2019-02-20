package com.huntkey.llx.test.tomcat;

/**
 * Created by lulx on 2019/2/20 0020 下午 14:23
 */
public abstract class MyServlet {

    public abstract void deGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void dePost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST")) {
            dePost(myRequest, myResponse);
        } else if (myRequest.getMethod().equalsIgnoreCase("GET")) {
            deGet(myRequest, myResponse);
        }
    }
}
