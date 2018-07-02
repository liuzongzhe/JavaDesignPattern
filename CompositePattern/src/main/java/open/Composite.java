package open;

import java.util.ArrayList;
import java.util.List;

/**
 * 继承抽象构件的是容器构件
 *
 * 在组合模式结构中，由于容器构件中仍然可以包含容器构件，
 * 因此在对容器构件进行处理时需要使用递归算法
 * @author lzz
 * @date 2018/6/5
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    /**
     * 容器构件具体业务方法的实现
     * 递归调用成员构件的业务方法
     */
    @Override
    public void operation() {
        for(Object obj : list) {
            ((Component)obj).operation();
        }
    }
}
