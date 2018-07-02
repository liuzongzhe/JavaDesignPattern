package open;

/**
 * 透明组合模式
 * 组合模式的关键是定义了一个抽象构件类，它既可以代表叶子，又可以代表容器，
 * 而客户端针对该抽象构件类进行编程，无须知道它 * 到底表示的是叶子还是容器，
 * 可以对其进行统一处理。
 * @author lzz
 * @date 2018/6/5
 */
public abstract class Component {
    /**
     * 一般将抽象构件类设计为接口或抽象类，将所有子类共有方法的声明
     * 和实现放在抽象构件类中。对于客户端而言，将针对抽象构件编程，
     * 而无须关心其具体子类是容器构件还是叶子构件。
     */
    public abstract void add(Component c); //增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation(); //业务方法
}
