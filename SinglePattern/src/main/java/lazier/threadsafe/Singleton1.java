package lazier.threadsafe;

/**
 * 在getInstance方法上加同步
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton1 {
    private Singleton1() {}
    private static Singleton1 single = null;
    /**
     * 同步静态工厂方法
     */
    public static synchronized Singleton1 getInstance() {
        if (single == null) {
            single = new Singleton1();
        }
        return single;
    }
}
