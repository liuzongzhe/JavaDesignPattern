package facade2.subsystem;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class ModuleD {
    /**
     * 提供给子系统外部使用的方法
     */
    public void d1() {
        System.out.println("ModuleD提供给子系统外部使用的方法");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void d2() {}
    private void d3() {}

}
