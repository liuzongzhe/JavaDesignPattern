package safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Composite implements Component {

    private List<Component> childs = new ArrayList<Component>();

    public void add(Component child) {
        this.childs.add(child);
    }

    public void remove(Component child) {
        this.childs.remove(child);
    }

    public Component getChild(int i) {
        return this.childs.get(i);
    }

    @Override
    public void doSomething() {
        for (Component child : childs) {
            child.doSomething();
        }
    }
}
