package factory;

/**
 * 工厂类
 * @author lzz
 * @date 2018/6/3
 */
public interface CarFactory {
    Car createCar();
}

class Car320Factory implements CarFactory {
    public Car createCar() {
        return new Car320();
    }
}

class Car523Factory implements CarFactory {
    public Car createCar() {
        return new Car523();
    }
}
