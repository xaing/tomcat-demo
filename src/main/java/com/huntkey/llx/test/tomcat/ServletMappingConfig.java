package com.huntkey.llx.test.tomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulx on 2019/2/20 0020 上午 11:22
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();


    static {
        servletMappingList.add(new ServletMapping("findGirl",
                "/girl",
                FindGirlServlet.class.getName()));
        servletMappingList.add(new ServletMapping("helloWorld",
                "/world",
                HelloWorldServlet.class.getName()));
    }
}
