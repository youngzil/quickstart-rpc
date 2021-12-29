Thread [main] (Suspended (breakpoint at line 64 in NettyClient))	
	owns: "192.168.2.100:20880" (id=54)	
	owns: RegistryDirectory<T>  (id=55)	
	owns: ReferenceBean<T>  (id=56)	
	owns: ConcurrentHashMap<K,V>  (id=57)	
	NettyClient.doOpen() line: 64	
	NettyClient(AbstractClient).<init>(URL, ChannelHandler) line: 80	
	NettyClient.<init>(URL, ChannelHandler) line: 59	
	NettyTransporter.connect(URL, ChannelHandler) line: 35	
	Transporter$Adaptive.connect(URL, ChannelHandler) line: not available	
	Transporters.connect(URL, ChannelHandler...) line: 75	
	HeaderExchanger.connect(URL, ExchangeHandler) line: 38	
	Exchangers.connect(URL, ExchangeHandler) line: 109	
	DubboProtocol.initClient(URL) line: 405	
	DubboProtocol.getSharedClient(URL) line: 373	
	DubboProtocol.getClients(URL) line: 350	
	DubboProtocol.refer(Class<T>, URL) line: 332	
	ProtocolFilterWrapper.refer(Class<T>, URL) line: 100	
	ProtocolListenerWrapper.refer(Class<T>, URL) line: 65	
	QosProtocolWrapper.refer(Class<T>, URL) line: 65	
	Protocol$Adaptive.refer(Class, URL) line: not available	
	RegistryDirectory<T>.toInvokers(List<URL>) line: 385	
	RegistryDirectory<T>.refreshInvoker(List<URL>) line: 251	
	RegistryDirectory<T>.notify(List<URL>) line: 221	
	ZookeeperRegistry(AbstractRegistry).notify(URL, NotifyListener, List<URL>) line: 407	
	ZookeeperRegistry(FailbackRegistry).doNotify(URL, NotifyListener, List<URL>) line: 273	
	ZookeeperRegistry(FailbackRegistry).notify(URL, NotifyListener, List<URL>) line: 259	
	ZookeeperRegistry.doSubscribe(URL, NotifyListener) line: 182	
	ZookeeperRegistry(FailbackRegistry).subscribe(URL, NotifyListener) line: 189	
	RegistryDirectory<T>.subscribe(URL) line: 159	
	RegistryProtocol.doRefer(Cluster, Registry, Class<T>, URL) line: 302	
	RegistryProtocol.refer(Class<T>, URL) line: 283	
	ProtocolFilterWrapper.refer(Class<T>, URL) line: 98	
	ProtocolListenerWrapper.refer(Class<T>, URL) line: 63	
	QosProtocolWrapper.refer(Class<T>, URL) line: 63	
	Protocol$Adaptive.refer(Class, URL) line: not available	
	ReferenceBean<T>(ReferenceConfig<T>).createProxy(Map<String,String>) line: 394	
	ReferenceBean<T>(ReferenceConfig<T>).init() line: 333	
	ReferenceBean<T>(ReferenceConfig<T>).get() line: 163	
	ReferenceBean<T>.getObject() line: 65	
	DefaultListableBeanFactory(FactoryBeanRegistrySupport).doGetObjectFromFactoryBean(FactoryBean<?>, String) line: 168	
	DefaultListableBeanFactory(FactoryBeanRegistrySupport).getObjectFromFactoryBean(FactoryBean<?>, String, boolean) line: 103	
	DefaultListableBeanFactory(AbstractBeanFactory).getObjectForBeanInstance(Object, String, String, RootBeanDefinition) line: 1634	
	DefaultListableBeanFactory(AbstractBeanFactory).doGetBean(String, Class<T>, Object[], boolean) line: 254	
	DefaultListableBeanFactory(AbstractBeanFactory).getBean(String, Class<T>, Object...) line: 220	
	DefaultListableBeanFactory.resolveNamedBean(Class<T>, Object...) line: 1018	
	DefaultListableBeanFactory.getBean(Class<T>, Object...) line: 345	
	DefaultListableBeanFactory.getBean(Class<T>) line: 340	
	ClassPathXmlApplicationContext(AbstractApplicationContext).getBean(Class<T>) line: 1090	
	Consumer.main(String[]) line: 26	
