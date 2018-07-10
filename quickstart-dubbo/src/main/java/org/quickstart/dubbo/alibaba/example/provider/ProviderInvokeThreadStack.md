两部分：

Daemon Thread [New I/O server worker #1-5] (Suspended (breakpoint at line 60 in AllChannelHandler))	
	AllChannelHandler.received(Channel, Object) line: 60	
	HeartbeatHandler.received(Channel, Object) line: 88	
	MultiMessageHandler.received(Channel, Object) line: 43	
	NettyServer(AbstractPeer).received(Channel, Object) line: 136	
	NettyHandler.messageReceived(ChannelHandlerContext, MessageEvent) line: 90	
	NettyHandler(SimpleChannelHandler).handleUpstream(ChannelHandlerContext, ChannelEvent) line: 100	
	DefaultChannelPipeline.sendUpstream(DefaultChannelPipeline$DefaultChannelHandlerContext, ChannelEvent) line: 564	
	DefaultChannelPipeline$DefaultChannelHandlerContext.sendUpstream(ChannelEvent) line: 783	
	Channels.fireMessageReceived(ChannelHandlerContext, Object, SocketAddress) line: 302	
	NettyCodecAdapter$InternalDecoder.messageReceived(ChannelHandlerContext, MessageEvent) line: 147	
	NettyCodecAdapter$InternalDecoder(SimpleChannelUpstreamHandler).handleUpstream(ChannelHandlerContext, ChannelEvent) line: 80	
	DefaultChannelPipeline.sendUpstream(DefaultChannelPipeline$DefaultChannelHandlerContext, ChannelEvent) line: 564	
	DefaultChannelPipeline.sendUpstream(ChannelEvent) line: 559	
	Channels.fireMessageReceived(Channel, Object, SocketAddress) line: 274	
	Channels.fireMessageReceived(Channel, Object) line: 261	
	NioWorker.read(SelectionKey) line: 349	
	NioWorker.processSelectedKeys(Set<SelectionKey>) line: 280	
	NioWorker.run() line: 200	
	ThreadRenamingRunnable.run() line: 108	
	DeadLockProofWorker$1.run() line: 44	
	ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1149	
	ThreadPoolExecutor$Worker.run() line: 624	
	Thread.run() line: 748	
	
	Daemon Thread [DubboServerHandler-192.168.2.100:20880-thread-7] (Suspended (breakpoint at line 45 in JavassistProxyFactory$1))	
	JavassistProxyFactory$1.doInvoke(T, String, Class<?>[], Object[]) line: 45	
	JavassistProxyFactory$1(AbstractProxyInvoker<T>).invoke(Invocation) line: 71	
	DelegateProviderMetaDataInvoker<T>.invoke(Invocation) line: 48	
	RegistryProtocol$InvokerDelegete<T>(InvokerWrapper<T>).invoke(Invocation) line: 52	
	ExceptionFilter.invoke(Invoker<?>, Invocation) line: 61	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	MonitorFilter.invoke(Invoker<?>, Invocation) line: 74	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	TimeoutFilter.invoke(Invoker<?>, Invocation) line: 41	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	TraceFilter.invoke(Invoker<?>, Invocation) line: 77	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	ContextFilter.invoke(Invoker<?>, Invocation) line: 71	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	GenericFilter.invoke(Invoker<?>, Invocation) line: 131	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	ClassLoaderFilter.invoke(Invoker<?>, Invocation) line: 37	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	EchoFilter.invoke(Invoker<?>, Invocation) line: 37	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	DubboProtocol$1.reply(ExchangeChannel, Object) line: 102	
	HeaderExchangeHandler.handleRequest(ExchangeChannel, Request) line: 96	
	HeaderExchangeHandler.received(Channel, Object) line: 168	
	DecodeHandler.received(Channel, Object) line: 50	
	ChannelEventRunnable.run() line: 79	
	ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1149	
	ThreadPoolExecutor$Worker.run() line: 624	
	Thread.run() line: 748	

