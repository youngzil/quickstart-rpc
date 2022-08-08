[gRPC官网](https://grpc.io/)  
[gRPC Github](https://github.com/grpc/grpc)  
[gRPC Java客户端](https://github.com/grpc/grpc-java)  

[gRPC java文档](https://grpc.io/docs/languages/java/quickstart/)  


gRPC是一个高性能、通用的开源RPC框架，其由Google主要面向移动应用开发并基于HTTP/2协议标准而设计，基于ProtoBuf(Protocol Buffers)序列化协议开发，且支持众多开发语言。gRPC提供了一种简单的方法来精确地定义服务和为iOS、Android和后台支持服务自动生成可靠性很强的客户端功能库。客户端充分利用高级流和链接功能，从而有助于节省带宽、降低的TCP链接次数、节省CPU使用、和电池寿命。

gRPC is a modern open source high performance Remote Procedure Call (RPC) framework that can run in any environment. It can efficiently connect services in and across data centers with pluggable support for load balancing, tracing, health checking and authentication. It is also applicable in last mile of distributed computing to connect devices, mobile applications and browsers to backend services.  
(gRPC 是一个现代开源的高性能远程过程调用 (RPC) 框架，可以在任何环境中运行。 它可以通过对负载平衡、跟踪、健康检查和身份验证的可插拔支持有效地连接数据中心内和跨数据中心的服务。 它也适用于分布式计算的最后一英里，将设备、移动应用程序和浏览器连接到后端服务。)





gRPC 默认使用 protocol buffers 作为接口定义语言，来描述服务接口和有效载荷消息结构。  
更多的proto3文档信息，参考https://developers.google.com/protocol-buffers/docs/proto3


[API 设计指南 ](https://cloud.google.com/apis/design)



[【RPC基础系列3】gRPC简单示例](https://juejin.cn/post/6985132929437417479)
[go-grpc-demo](https://github.com/zlingqu/go-grpc-demo)
