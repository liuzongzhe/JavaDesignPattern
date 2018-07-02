package example1;

/**
 * (策略实现类)妙计二：求吴国太开绿灯放行
 * @author lzz
 * @date 2018/6/6
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
