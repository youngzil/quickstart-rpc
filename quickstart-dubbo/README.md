Dubbo

[Dubbo官网](https://dubbo.apache.org/en-us/)  
[Dubbo Github](https://github.com/apache/dubbo)  
[Dubbo 交流聊天室Gitter](https://gitter.im/alibaba/dubbo)  

[Dubbo介绍](http://www.oschina.net/p/dubbo)  
[Dubbo学习文档](https://dubbo.gitbooks.io/dubbo-user-book/)  
[dubbo服务管理以及监控系统](https://github.com/dubboclub/dubbokeeper)  



学习网址：
http://blog.csdn.net/noaman_wgs/article/details/70214612
源码讲解：
http://blog.csdn.net/flashflight/article/details/43939275

https://blog.csdn.net/sucess_zhang/article/details/78839790
https://blog.csdn.net/frankchina/article/category/6224443



Dubbo 详细介绍
Dubbo 是阿里巴巴公司开源的一个高性能优秀的服务框架，使得应用可通过高性能的 RPC 实现服务的输出和输入功能，可以和 Spring 框架无缝集成。

主要核心部件：
Remoting: 网络通信框架，实现了 sync-over-async 和 request-response 消息机制
RPC: 一个远程过程调用的抽象，支持负载均衡、容灾和集群功能
Registry: 服务目录框架用于服务的注册和服务事件发布和订阅

Provider
暴露服务方称之为“服务提供者”

Consumer
调用远程服务方称之为“服务消费者”

Registry
服务注册与发现的中心目录服务称之为“服务注册中心”

Monitor
统计服务的调用次调和调用时间的日志服务称之为“服务监控中心”

(1) 连通性：
注册中心负责服务地址的注册与查找，相当于目录服务，服务提供者和消费者只在启动时与注册中心交互，注册中心不转发请求，压力较小
监控中心负责统计各服务调用次数，调用时间等，统计先在内存汇总后每分钟一次发送到监控中心服务器，并以报表展示
服务提供者向注册中心注册其提供的服务，并汇报调用时间到监控中心，此时间不包含网络开销
服务消费者向注册中心获取服务提供者地址列表，并根据负载算法直接调用提供者，同时汇报调用时间到监控中心，此时间包含网络开销
注册中心，服务提供者，服务消费者三者之间均为长连接，监控中心除外
注册中心通过长连接感知服务提供者的存在，服务提供者宕机，注册中心将立即推送事件通知消费者
注册中心和监控中心全部宕机，不影响已运行的提供者和消费者，消费者在本地缓存了提供者列表
注册中心和监控中心都是可选的，服务消费者可以直连服务提供者

(2) 健状性：
监控中心宕掉不影响使用，只是丢失部分采样数据
数据库宕掉后，注册中心仍能通过缓存提供服务列表查询，但不能注册新服务
注册中心对等集群，任意一台宕掉后，将自动切换到另一台
注册中心全部宕掉后，服务提供者和服务消费者仍能通过本地缓存通讯
服务提供者无状态，任意一台宕掉后，不影响使用
服务提供者全部宕掉后，服务消费者应用将无法使用，并无限次重连等待服务提供者恢复

(3) 伸缩性：
注册中心为对等集群，可动态增加机器部署实例，所有客户端将自动发现新的注册中心
服务提供者无状态，可动态增加机器部署实例，注册中心将推送新的服务提供者信息给消费者


