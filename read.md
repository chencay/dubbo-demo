### 项目文件结构
##### 1. client  
API模块，包含对外透出的API  
>UserService是rmi协议直联的dubbo实践  
>GoodService是采用广播注册中心multicast的dubbo实践    
##### 2. core  
核心模块，包含了API的实现，作为服务提供方
##### 3. remote  
远程调用模块，作为服务消费方