package facade2.subsystem;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class ModuleF {
    /**
     * 提供给子系统外部使用的方法
     */
    public void f1() {
        System.out.println("ModuleF提供给子系统外部使用的方法");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void f2() {}
    private void f3() {}
}
