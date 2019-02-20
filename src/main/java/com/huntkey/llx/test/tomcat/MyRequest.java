package com.huntkey.llx.test.tomcat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lulx on 2019/2/20 0020 上午 11:44
 */
@Getter
@Setter
@ToString
public class MyRequest {

    private String url;

    private String method;

    /**
     * 通过输入流，对Http协议进行解析，拿到HTTP请求头的方法以及url
     *
     * @param inputStream
     * @throws IOException
     */
    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }

        String httpHead = httpRequest.split("\n")[0];
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);
    }
}
