Thread [main] (Suspended (breakpoint at line 96 in NettyChannel))	
	NettyChannel.send(Object, boolean) line: 96	
	NettyClient(AbstractClient).send(Object, boolean) line: 256	
	NettyClient(AbstractPeer).send(Object) line: 52	
	HeaderExchangeChannel.request(Object, int) line: 111	
	HeaderExchangeClient.request(Object, int) line: 86	
	ReferenceCountExchangeClient.request(Object, int) line: 77	
	DubboInvoker<T>.doInvoke(Invocation) line: 95	
	DubboInvoker<T>(AbstractInvoker<T>).invoke(Invocation) line: 142	
	MonitorFilter.invoke(Invoker<?>, Invocation) line: 74	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	FutureFilter.invoke(Invoker<?>, Invocation) line: 53	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	ConsumerContextFilter.invoke(Invoker<?>, Invocation) line: 47	
	ProtocolFilterWrapper$1.invoke(Invocation) line: 68	
	ListenerInvokerWrapper<T>.invoke(Invocation) line: 73	
	RegistryDirectory$InvokerDelegate<T>(InvokerWrapper<T>).invoke(Invocation) line: 52	
	FailoverClusterInvoker<T>.doInvoke(Invocation, List<Invoker<T>>, LoadBalance) line: 77	
	FailoverClusterInvoker<T>(AbstractClusterInvoker<T>).invoke(Invocation) line: 233	
	MockClusterInvoker<T>.invoke(Invocation) line: 70	
	InvokerInvocationHandler.invoke(Object, Method, Object[]) line: 51	
	proxy0.sayHello(String) line: not available	
	Consumer.main(String[]) line: 29	
