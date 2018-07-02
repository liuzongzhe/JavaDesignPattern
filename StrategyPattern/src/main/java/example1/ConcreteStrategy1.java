package example1;

/**
 * (策略实现类)妙计一：初到吴国
 * @author lzz
 * @date 2018/6/6
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
