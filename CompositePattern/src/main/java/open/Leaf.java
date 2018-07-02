package open;

/**
 * 继承抽象构件的是叶子构件，则其典型代码如下
 *
 * 作为抽象构件类的子类，在叶子构件中需要实现在抽象构件类中
 * 声明的所有方法，包括业务方法以及管理和访问子构件的方法，
 * 但是叶子构件不能再包含子构件，因此在叶子构件中实现子构件
 * 管理和访问方法时需要提供异常处理或错误提示。
 * @author lzz
 * @date 2018/6/5
 */
public class Leaf extends Component {

    @Override
    public void add(Component c) {
        //异常处理或错误提示
    }

    @Override
    public void remove(Component c) {
        //异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        //异常处理或错误提示
        return null;
    }

    @Override
    public void operation() {
        //叶子构件具体业务方法的实现
    }
}
