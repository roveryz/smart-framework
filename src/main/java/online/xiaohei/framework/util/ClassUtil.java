package online.xiaohei.framework.util;

/*
 * @author zy
 * @date 2018/7/1 19:25
 * @desc 类操作工具，提供与类操作相关的方法，比如获取类加载器，加载类，获取指定报包名下的所有类，等等
 * 总之是来加载基础包名下的所有类的
 * Question:为什么需要自己写这个类加载器呢？
 * Question:关于classloader我只知道bootstrap classloader，双亲委托机制之类的，所以这个classloader到底是为什么要用在框架里呢？
 * 以及经常被问到的：如果我想加载一个自己的类，绕过双亲委托，咋办。为啥要加载自己的类，怎么做。
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public final class ClassUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    /**
     * get class loader
     * 这个实现起来很简单，只需要获取当前线程中的classloader即可
     */
    public static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    /**
     * load class
     * hint : for improve class loading's performance, we can set isInitialized = false (??? what ??? why ???)
     */
    public static Class<?> loadClass(String className, boolean isInitialized) {
        Class<?> cls;
        try {
            cls = Class.forName(className, isInitialized, getClassLoader());// 用一个类名、是否已加载的布尔值、一个类加载器，获取一个类
        } catch (ClassNotFoundException e) {
            LOGGER.error("load class failure", e);
            throw new RuntimeException(e);
        }
        return cls;
    }

    /**
     * get all class of the specified package
     * 要把包名转换成文件路径，读取class文件或者jar包，获取指定的类名去加载类
     */
    public static Set<Class<?>> getClassSet(String packageName) {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        try {
            Enumeration<URL> urls = getClassLoader().getResources(packageName.replace(".", "/"));
            while(urls.hasMoreElements()){

            }
        } catch (Exception e) {
            LOGGER.error("get class set failure", e);
            throw new RuntimeException(e);
        }
        return classSet;
    }
}
