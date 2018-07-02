/**
 * 工厂类
 * @author lzz
 * @date 2018/6/3
 */
public interface AbstractFactory {
    /**
     * 制造发动机
     */
    Engine createEngine();
}

/**
 * 宝马320系列生产发动机配件
 */
class Car320Factory implements AbstractFactory {
    public Engine createEngine() {
        return new EngineA();
    }
}

/**
 * 宝马523系列生产发动机配件
 */
class Car523Factory implements AbstractFactory {
    public Engine createEngine() {
        return new EngineB();
    }
}
