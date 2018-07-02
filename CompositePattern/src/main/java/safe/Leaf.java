package safe;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Leaf implements Component {
    @Override
    public void doSomething() {
        System.out.println("Leaf doSomething");
    }
}
