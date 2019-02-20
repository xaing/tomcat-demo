# tomcat-demo
> 简化tomcat实现，争取能再深入聊tomcat源码

1. 定义父类Servlet
   - 请求方法类型
   - 区分方法类型处理逻辑
2. 定义对输入输出流的Vo格式，即Response与Request
3. 建立url与Servlet类的对应关系
4. 处理url请求
   1. 实现对端口的监听
   2. 获取请求中的输入输出流
   3. 格式化成Response和Request
   4. 分发处理
      1. 利用url与Servlet的对应关系获取处理方法
      2. 处理方法直接处理Response和Request