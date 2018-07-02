package simple;

/**
 * 产品类
 * @author lzz
 * @date 2018/6/3
 */
public abstract class Car {
    public Car() {}
}

class Car320 extends Car {
    public Car320() {
        System.out.println("制造...Car320");
    }
}

class Car523 extends Car {
    public Car523() {
        System.out.println("制造...Car523");
    }
}
