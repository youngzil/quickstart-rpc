Thread [main] (Suspended (breakpoint at line 66 in NettyServer))	
	owns: ConcurrentHashMap<K,V>  (id=40)	
	owns: ServiceBean<T>  (id=41)	
	owns: Object  (id=42)	
	NettyServer.doOpen() line: 66	
	NettyServer(AbstractServer).<init>(URL, ChannelHandler) line: 63	
	NettyServer.<init>(URL, ChannelHandler) line: 61	
	NettyTransporter.bind(URL, ChannelHandler) line: 31	
	Transporter$Adaptive.bind(URL, ChannelHandler) line: not available	
	Transporters.bind(URL, ChannelHandler...) line: 56	
	HeaderExchanger.bind(URL, ExchangeHandler) line: 42	
	Exchangers.bind(URL, ExchangeHandler) line: 70	
	DubboProtocol.createServer(URL) line: 281	
	DubboProtocol.openServer(URL) line: 260	
	DubboProtocol.export(Invoker<T>) line: 247	
	ProtocolFilterWrapper.export(Invoker<T>) line: 93	
	QosProtocolWrapper.export(Invoker<T>) line: 56	
	ProtocolListenerWrapper.export(Invoker<T>) line: 56	
	Protocol$Adaptive.export(Invoker) line: not available	
	RegistryProtocol.doLocalExport(Invoker<T>) line: 166	
	RegistryProtocol.export(Invoker<T>) line: 129	
	ProtocolFilterWrapper.export(Invoker<T>) line: 91	
	QosProtocolWrapper.export(Invoker<T>) line: 54	
	ProtocolListenerWrapper.export(Invoker<T>) line: 54	
	Protocol$Adaptive.export(Invoker) line: not available	
	ServiceBean<T>(ServiceConfig<T>).doExportUrlsFor1Protocol(ProtocolConfig, List<URL>) line: 505	
	ServiceBean<T>(ServiceConfig<T>).doExportUrls() line: 357	
	ServiceBean<T>(ServiceConfig<T>).doExport() line: 316	
	ServiceBean<T>(ServiceConfig<T>).export() line: 215	
	ServiceBean<T>.onApplicationEvent(ContextRefreshedEvent) line: 121	
	ServiceBean<T>.onApplicationEvent(ApplicationEvent) line: 50	
	SimpleApplicationEventMulticaster.invokeListener(ApplicationListener, ApplicationEvent) line: 167	
	SimpleApplicationEventMulticaster.multicastEvent(ApplicationEvent, ResolvableType) line: 139	
	ClassPathXmlApplicationContext(AbstractApplicationContext).publishEvent(Object, ResolvableType) line: 393	
	ClassPathXmlApplicationContext(AbstractApplicationContext).publishEvent(ApplicationEvent) line: 347	
	ClassPathXmlApplicationContext(AbstractApplicationContext).finishRefresh() line: 883	
	ClassPathXmlApplicationContext(AbstractApplicationContext).refresh() line: 546	
	ClassPathXmlApplicationContext.<init>(String[], boolean, ApplicationContext) line: 139	
	ClassPathXmlApplicationContext.<init>(String...) line: 93	
	Provider.main(String[]) line: 22	
