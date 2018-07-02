package safe;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Client {
    public static void main(String[] args)
    {
        /**
         *           composite1
         *           /      \
         *        leaf1   composite2
         *                  /   \
         *               leaf2  leaf3
         *
         */
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite2.add(leaf2);
        composite2.add(leaf3);
        composite1.add(leaf1);
        composite1.add(composite2);

        composite1.doSomething();

    }
}
