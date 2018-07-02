package simple;

/**
 * 工厂类
 * @author lzz
 * @date 2018/6/3
 */
public class Factory {
    public Car createCar(int type) {
        switch (type) {

            case 320:
                return new Car320();

            case 523:
                return new Car523();

            default:
                break;
        }
        return null;
    }
}
