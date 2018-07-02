package adapter.combine;

/**
 * 方式二：对象适配器（采用对象组合方式实现）
 * @author lzz
 * @date 2018/6/4
 */
public class ClientB {
    public static void main(String[] args) {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adatper(new Adaptee());
        adapter.request();
    }
}

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 */
class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类具有 特殊功能...");
    }
}

/**
 * 目标接口，或称为标准接口
 */
interface Target {
    void request();
}

/**
 * 具体目标类，只提供普通功能
 */
class ConcreteTarget implements Target {
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}

/**
 * 适配器类，直接实现标准接口，组合关联被适配类
 */
class Adatper implements Target {

    private Adaptee adaptee;

    public Adatper(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    //实现接口方法
    public void request() {
        //调用被适配类的方法
        this.adaptee.specificRequest();
    }
}