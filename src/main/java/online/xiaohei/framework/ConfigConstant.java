package online.xiaohei.framework;

/*
 * @author zy
 * @date 2018/7/1 18:47
 * @desc 常量类，用来维护配置文件中的相关配置项名称
 */

public interface ConfigConstant {
    String CONFIG_FILE = "smart.properties";

    String JDBC_DRIVER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";

    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    String APP_JSP_PATH = "smart.framework.app.jsp_path";
    String APP_ASSET_PATH = "smart.framework.app.asset_path";
}
