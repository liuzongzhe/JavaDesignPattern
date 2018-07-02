package hungrier;

/**
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，
 * 以后不再改变，所以天生是线程安全的。
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton {
    private Singleton() {}
    /**
     * 类初始化时，就初始化一个实例
     */
    private static final Singleton single = new Singleton();
    /**
     * 静态工厂方法
     */
    public static Singleton getInstance() {
        return single;
    }
}
