package lazier.threadsafe;

/**
 * 双重检查锁定
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton2 {
    private Singleton2() {}
    private static Singleton2 single = null;
    /**
     * 双重检查锁定静态工厂方法
     */
    public static Singleton2 getInstance() {
        if (single == null) {
            synchronized (Singleton2.class) {
                if (single == null) {
                    single = new Singleton2();
                }
            }
        }
        return single;
    }
}
