package online.xiaohei.framework.helper;

/**
 * 由于我们在(chap3)smart.properties配置文件中指定了smart.framework.app.base_package,
 * 它是整个应用的基础包名，通过ClassUtil加载的类都需要基于该基础包名
 * ClassHelper助手类用于分别获取应用包名下的所有类 应用包名下的所有Service类 应用包名下的所有Controller类
 * 此外我们可以把所有带有Controller注解和Service注解的类所产生的对象，理解为
 * 由Smart框架所管理的Bean，所有有必要在ClassHelper类中增加一个获取应用包名下所有Bean类的方法
 */
public final class ClassHelper {

}
