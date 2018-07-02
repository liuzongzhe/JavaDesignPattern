package dongtai;

import jingtai.UserDao;
import jingtai.UserDaoImpl;

/**
 * 测试类
 * @author lzz
 * @date 2018/6/4
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDaoImpl();
        //class jingtai.UserDaoImpl 原始的类型
        System.out.println(target.getClass());
        target.save();

        //给目标对象，创建代理对象
        ProxyFactory factory = new ProxyFactory(target);
        UserDao proxy = (UserDao) factory.getProxyInstance();
        //class com.sun.proxy.$Proxy0 内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        proxy.save();

    }
}
