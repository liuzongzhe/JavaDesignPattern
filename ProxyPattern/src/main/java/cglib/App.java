package cglib;

/**
 * 测试类
 * @author lzz
 * @date 2018/6/4
 */
public class App {
    public static void main(String[] args) {
        ItemDaoImpl target = new ItemDaoImpl();

        ItemDaoImpl proxy = (ItemDaoImpl) new CglibProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
