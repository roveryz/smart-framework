package online.xiaohei.framework.helper;
/*
 * @author zy
 * @date 2018/7/1 18:46
 * @desc 用来读smart.properties文件的配置项，
 * 具体来说是借助PropsUtil工具类，定义一些静态方法，
 * 让它们分别获取smart.properties配置文件中的配置项
 * 关于为什么工具类要设计成不可实例化，有一个说法我觉得很有道理
 * 参考https://blog.csdn.net/alinshen/article/details/72716471
 * 工具类的属性和方法都是静态访问的，不希望被实例化
 * 因此不仅构造函数要设置成私有，还要抛异常防止通过反射来实例化
 * 同时还要避免被继承，因为子类实例化的话会调用父类构造函数，
 * 但父类构造函数是私有的
 * ps PropsUtil 在chap2中学习了写法
 * @since 1.0.0
 */

import online.xiaohei.framework.ConfigConstant;
import online.xiaohei.framework.util.PropsUtil;

import java.util.Properties;

public final class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * get jdbc driver
     */
    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    /**
     * get jdbc url
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    /**
     * get jdbc username
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * get jdbc password
     */
    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * get application base package
     * for what use?
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * get application's jsp path
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * get application's static resource path(js, css, img)
     */
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH, "/asset/");
    }
}
