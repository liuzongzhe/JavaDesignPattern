package builder;

/**
 * 创建具体的建造者（ConcreteBuilder）:装机人员
 * @author lzz
 * @date 2018/6/3
 */
public class ConcreteBuilder extends Builder {

    /**
     * 创建产品实例
     */
    Computer computer = new Computer();

    @Override
    public void BuildCPU() {
        computer.add("组装CPU");
    }

    @Override
    public void BuildMainBoard() {
        computer.add("组装主板");
    }

    @Override
    public void BuildHD() {
        computer.add("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
