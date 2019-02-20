package com.huntkey.llx.test.tomcat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lulx on 2019/2/20 0020 上午 11:24
 */
@Setter
@Getter
@ToString
public class ServletMapping {

    private String servletName;

    private String url;

    private String clazz;

    public ServletMapping(String servletName, String url, String clazz) {
        this.servletName = servletName;
        this.url = url;
        this.clazz = clazz;
    }
}
