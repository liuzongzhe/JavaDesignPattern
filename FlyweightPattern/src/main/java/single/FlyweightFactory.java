package single;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类
 *
 * 客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象，利用一个getFlyWeight()方法得到享元对象。
 * 一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式。
 *
 * 当客户端需要单纯享元对象的时候，需要调用享元工厂的getFlyWeight()方法，
 * 并传入所需的单纯享元对象的内蕴状态，由工厂方法产生所需要的享元对象。
 * @author lzz
 * @date 2018/6/5
 */
public class FlyweightFactory {

    private Map<Character, Flyweight> map = new HashMap<Character, Flyweight>();

    public Flyweight getFlyWeight(Character key) {
        //先从缓存中查找对象
        Flyweight value = map.get(key);
        if (value == null) {
            //如果对象不存在则创建一个新的Flyweight对象
            value = new ConcreteFlyweight(key);
            //把这个新的Flyweight对象添加到缓存中
            map.put(key, value);
        }
        return value;
    }
}
