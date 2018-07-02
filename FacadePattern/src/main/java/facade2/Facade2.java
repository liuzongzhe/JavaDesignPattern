package facade2;

import facade2.subsystem.ModuleD;
import facade2.subsystem.ModuleE;
import facade2.subsystem.ModuleF;

/**
 * 这样定义一个Facade类可以有效地屏蔽内部的细节，
 * 免得客户端去调用Module类时，发现一些不需要它
 * 知道的方法。比如d2()和d3()方法就不需要让客户
 * 端知道，否则既暴露了内部的细节，又让客户端迷
 * 惑。对客户端来说，他可能还要去思考d2()、d3()
 * 方法用来干什么呢？其实d2()和d3()方法是内部模
 * 块之间交互的，原本就不是对子系统外部的，所以
 * 干脆就不要让客户端知道。
 *
 * @author lzz
 * @date 2018/6/4
 */
public class Facade2 {

    /**
     * 下面这些是D、E、F模块对子系统外部提供的方法
     * 子系统之间的方法不能调用
     */
    public void test() {
        ModuleD d = new ModuleD();
        ModuleE e = new ModuleE();
        ModuleF f = new ModuleF();
        d.d1();
        e.e1();
        f.f1();
    }
}
