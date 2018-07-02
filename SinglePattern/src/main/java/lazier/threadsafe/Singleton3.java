package lazier.threadsafe;

/**
 * 静态内部类
 * 这种比1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
 * 类的加载时机：
 * 类的初始化是初始化static修饰的Field和static代码块，而不包括static修饰的类和方法
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton3 {
    private Singleton3() {}
    /**
     * 静态内部类
     */
    private static class Lazier {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
    /**
     * 静态工厂方法
     * 需要得到实例时调用该方法，然后加载内部类
     */
    public static final Singleton3 getInstance() {
        return Lazier.INSTANCE;
    }
}
