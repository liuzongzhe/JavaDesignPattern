package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzz
 * @date 2018/6/5
 */
public class Client {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        List<Character> compositeState = new ArrayList<Character>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        Flyweight compositeFly1 = factory.getFlyWeight(compositeState);
        Flyweight compositeFly2 = factory.getFlyWeight(compositeState);
        compositeFly1.operation("Composite Call");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        Flyweight fly1 = factory.getFlyWeight(state);
        Flyweight fly2 = factory.getFlyWeight(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
