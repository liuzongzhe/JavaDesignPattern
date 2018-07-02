package composite;

/**
 * 具体享元角色类
 * 如果一个享元对象有外蕴状态的话，所有的外部状态都必须存储在客户端，
 * 在使用享元对象时，再由客户端传入享元对象。
 * 这里只有一个外蕴状态，operation()方法的参数extrinsicState就是由外部传入的外蕴状态。
 * @author lzz
 * @date 2018/6/5
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 表示内蕴状态
     * 当在享元对象被创建时赋予
     */
    private Character intrinsicState;

    /**
     * 构造函数，内蕴状态作为参数传入
     * @param intrinsicState
     */
    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + extrinsicState);
    }
}
