package online.xiaohei.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 控制器注解
 * 目标是在控制器类上使用Controller注解，
 * 控制器类的方法上用Action注解，
 * 服务类上使用Service注解，
 * 控制器类中用Inject注解把服务类依赖注入进来
 * Ques:why @interface?? why not interface?
 * Ans:参考资料https://www.cnblogs.com/gmq-sh/p/4798194.html
 * 概念1：元注解，用于负责注解其他注解，
 * 有4个 @Target @Retention @Documented @Inherited
 *
 * @Target 说明了Annotationo所修饰的对象范围，被描述注解可以用在什么地方
 * Annotation可被用于
 * packages，
 * types（类 接口 枚举 Annotation类型），
 * 类型成员（方法，构造方法，成员变量，枚举值），
 * 方法参数和本地变量（如循环变量， catch参数）
 * @Retention 定义了该注解被保留的时间长短，限制注解的声明周期
 * 有一些注解仅仅出现在源码中，会被编译器丢弃
 * 有一些注解会被编译到class文件中
 * 编译到class文件中的注解可能被JVM忽略
 * 还有一些在class被装载时被读取
 * 取值有 SOURCE 源文件中有效
 * CLASS class文件中有效
 * RUNTIME 运行时有效，这样注解处理器可以通过反射，获取到该注解的属性值，从而去做一些运行时的逻辑处理
 * @Documented 标记注解，没有成员，表示其他类型的注解应该作为被标注的程序成员的公共API，从而可以被例如javadoc文档化
 * @Inherited 标记注解，父类有这个注解，子类也会用这个注解
 * @Inteface 自定义注解, 不能继承其他的注解或者接口，其中的每一个方法实际上是声明了一个配置参数
 * 方法名就是参数名，返回值类型就是参数类型（只能是基本类型、Class、String、enum、Annotation、这些的数组）
 * 可以通过default来设置参数的默认值
 * 非基本类型的注解元素的值不能是null·
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
}
