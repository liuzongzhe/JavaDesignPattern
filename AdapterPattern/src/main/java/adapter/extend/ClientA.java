package adapter.extend;

/**
 * 方式一：类的适配器模式（采用继承实现）
 * @author lzz
 * @date 2018/6/4
 */
public class ClientA {
    public static void main(String[] args) {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adatper();
        adapter.request();
    }
}

//已存在的、具有特殊功能、但不符合我们既有的标准接口的类
class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类具有 特殊功能...");
    }
}

//目标接口，或称为标准接口
interface Target {
    void request();
}

//具体目标类，只提供普通功能
class ConcreteTarget implements Target {
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}

/**
 * 适配器类，继承了被适配类，同时实现标准接口
 */
class Adatper extends Adaptee implements Target {
    //实现接口方法
    public void request() {
        //调用被适配类的方法
        super.specificRequest();
    }
}