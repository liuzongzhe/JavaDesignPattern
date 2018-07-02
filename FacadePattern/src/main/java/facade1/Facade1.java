package facade1;

import facade1.subsystem.ModuleA;
import facade1.subsystem.ModuleB;
import facade1.subsystem.ModuleC;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Facade1 {
    //示意方法，满足客户端需要的功能
    public void test() {
        ModuleA a = new ModuleA();
        ModuleB b = new ModuleB();
        ModuleC c = new ModuleC();

        a.testA();
        b.testB();
        c.testC();
    }
}
