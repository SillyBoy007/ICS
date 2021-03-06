# ICS项目

> 

## 模型篇



### 请求出入参

- 请求入参
  - 所有`Controller`入参,一律使用 DTO结尾进行交互
  - 所有 DTO 命名,前面采用驼峰命名,后面DTO大写
  - 所有DTO内参数,如果是一组,请用List<类型>进行接口,尽量不用分隔符隔开,然后字符串接收,
  - 所有DTO放置在子模块Model下,根据业务进行分组,例如
     - com.akucun.order.center.order.DTO
     - com.akucun.order.center.pay.DTO

- 请求出参
  - 所有`Controller`出参,一律使用Result进行包装返回
  - 所有`Controller`出参,Result泛型包装对象,一律用VO结尾进行命名
  - 所有 VO 命名,前面采用驼峰命名,后面VO大写
  - 所有VO放置在子模块Model下,根据业务进行分组,例如
     - com.akucun.order.center.order.VO
     - com.akucun.order.center.order.VO



<br/>

### 数据库交互对象

- 跟数据库打交道的对象,一律使用PO进行结尾

- 跟数据库交互的对象,全部通过逆向生成工具进行生成
- 所有PO对象,放置在子模块dao下
- 所有映射生成的xml文件,在子模块dao的resources/mapper下









## 命名篇



### 类命名

- `Controller`必须根据业务进行命名,驼峰,`Controller`结尾
- `Service`必须根据业务进行命名,驼峰,`Service`结尾
- implement必须根据业务进行命名,驼峰,业务+service+impl结尾
- 辅助类的命名,根据功能进行命名,如果是工具类,请使用final修饰,并且以utils或者util进行结尾



### 函数命名

- 函数命名使用驼峰命名
- 辅助函数,例如构建对象,请用build开头,表示只用于构建对象,并且返回
- 辅助函数,请使用 private修饰
- DAO层函数命名
  - 查询单个尽量使用queryXX或者selectXX命名
  - 查询多个尽量使用queryXXs或者selectXXs复数形式进行命名
  - 更新单个尽量使用modifyXX或者updateXX命名
  - 更新多个尽量使用modifyXXs或者updateXX复数形式进行命名
  - 插入单个尽量使用insert或者add命名
  - 插入多个尽量使用insertXXs或者addXXs命名
  - DAO所有传参如果是单个参数,请使用@param注解进行注明
  - 所有XXMapper.xml获取参数,请使用@param("XX") 命名, #{XX}获取,${XX}会有SQL注入的风险,具体细节请参考Mysql手册`跟'的区别



### 变量命名

- 使用驼峰
- 状态类的变量,请使用int类型
- boolean类型的变量,请使用has开头,请勿使用is开头,在某些序列化框架下,可能会导致反序列化失败



### 枚举/常量命名

- 枚举类型使用全大写,_进行分割
- 枚举命名请使用业务+Enum进行命名
- 接口常量命名请使用业务+Constant进行命名(尽量使用枚举来定义常量)


<br/>


## 函数参数篇



### 接口参数

- 尽量使用对象进行传递,严禁使用MAP进行传参
- 如果要进行单个参数传递,最好不要操作5个参数,参数太多,看起来太混乱



### 辅助函数参数

- 尽量使用对象进行传参,严禁使用Map进行传参
- 如果要进行单个参数传递,最好不要操作5个参数,参数太多,看起来太混乱

<br/>



## 注释篇

> 以下只作为参考



### 类注释

    /**
     * 项目名:akucun-order-center
     * 创建人: XX
     * 创建时间:2018/8/13 15:45
     * 类名:OrderController
     * 类描述: 订单控制器
     */






### 函数注释

> 函数参数,一定要加上 @param 这样,别人在调用的时候,ide会进行提示,如果涉及到枚举 加上注解 @see 可以跳转到枚举



    	/**
    	 * 创建人:XXX
    	 * 创建时间:2018-08-20 20:46:04
    	 * 描述: 购物车创建订单
    	 *  @param userId 用户ID
    	 * @param subUserId 用户ID
    	 * @param addrId 地址ID
    	 * @param cartProductIds 购物车ID集合
    	 * @param fahuoTimeLimitedMode	截单模式 0 立即截单, 1 根据活动时间截单
    	 */






### 代码注释

代码注释,进行别使用/**/的形式,注释不需要像写作文那样详细,只需要介绍是做什么的就好

    // 构建订单对象



<br/>



## 其它篇

> 代码是逻辑的表现,一段代码是否是好代码,主要是要看逻辑是否清晰,因为业务代码是给人看的,并不是框架或者开源代码,写的太高大上,各种设计模式,并非好事,有过度设计的嫌疑,尽量做到面向接口编程,提高内聚,降低耦合



### 代码

- `Controller`尽量只做转发,不做具体逻辑实现,所有逻辑实现交由service进行
- service的接口函数,尽量功能单一,职责越小,越便于维护跟扩展
- 如果涉及到写等动作,请在函数上加上@transaction注解/或者自己用事务块包裹
- service如果不需要捕获异常,可以往上层抛,订单中心已经在全局做了异常处理

- 尽量做到所有的check在入参就应该进行判断
- 如果遇到需要构建对象,大量 set函数不应该放置主流程,抽离出来一个辅助函数,直接调用辅助函数即可,辅助函数注释写好,主流程调用辅助函数加上功能注释
- 代码内部尽量不使用多层for循环调用,在不注意的情况,多层for循环嵌套构建对象,很容易写出内存泄漏的代码
- 尽量不使用匿名内部类,使用lambda,因为现在jdk已经是1.8版本,支持Java8的特性
- 如果一段代码,超过两个地方调用,说明需要进行抽象,然后对抽象进行实现
- 函数跳转层级尽量不要过深,因为是业务代码,跳转太深,很容易把人绕晕了
- 如果一个函数出现特别多的if else 考虑把if else建成枚举,然后枚举内进行判断返回





### 日志

- 所有service层可以直接抛出异常,不需要捕获异常处理,已经配置好全局异常处理,只需要抛出错误信息就好
- 业务错误打印日志,尽量别打印error打印warning级别日志就好,所有抛出异常上面,尽量打印错误日志的参数
- 日志打印,尽量使用一下示例打印 
      // 正确打印
      LOGGER.info("订单ID错误,订单ID:{}",order.getId());
      // 错误打印
      LOGGER.info("订单ID错误,订单ID:"+order.getId());
- 日志是常量,所以请使用以下定义
      private static finale Logger LOGGER = LoggerFactory.get(XX.class);
- 日志引用,禁止引用具体实现,请引用 slf4j接口



### 请求路径

- 尽量使用Restful风格
- /liveId/productId URL参数,请使用 @PathVariable("liveId")String liveId 指定名称绑定
- 查询尽量使用Get请求方式,如果参数在URL传递过多,可以不使用Get请求,使用POST请求,请把参数写进请求体内
- 所有写的操作一律使用POST请求,参数放入请求体内,公共参数,以后会让客户端放入请求头内



### 幂等

- 所有的核心写接口,例如,创建订单,支付,取消订单等,一定一定要做幂等,幂等可以在所有的check后也可以在函数调用就进行判断,但是一定是在逻辑进行前
- 幂等接口,一定要跟调用方统一状态,达成共识
- 往往幂等会伴随着并发同时进行,因为网络传输,机器性能,请求处理,事务提交带有太多的不确定性,所以要加以控制,所以redis尽量只做并发控制跟短时间内的幂等,请勿太依赖redis来进行做幂等,在redis锁后,插入前请进行DB查询操作,查看是否已经写入过,如果已经写入,拒绝请求



### 锁

- 单机锁,如果没有竞争资源,不要使用锁
- 尽量使用 Lock接口作为锁,别使用Synchronize作为锁,后者作为重量级锁,太影响性能
- 对锁的使用不清楚,严禁私自使用,尽量多请教会的人,避免写出死锁或者活锁
- 分布式锁,目前只是用了redis的setnx操作作为分布式锁的实现,使用分布式锁,一定一定要设置过期时间或者在锁代码块执行完毕,手动移除锁,否则出现锁不能释放,你就悲剧了……...
- 目前setnx操作,使用的是jedis连接池来实现的,没有使用spring-data提供的redisTemplate是因为,后者的setnx操作并非一个原子操作,运气不好的情况,极有可能出现setnx操作了,setexprie失败,导致锁不过期,但是jedis使用,切勿忘记,使用完毕,归还连接,jedis是不会再你调用完毕主动归还连接的
- 所有锁,请在check完毕或者check之前进行锁定资源,请勿在最后锁定,进行无用的写
- 锁定的资源,必须是唯一的,例如,订单ID,订单编号等