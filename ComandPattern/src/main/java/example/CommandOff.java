package example;

/**
 * 关机命令ConcreteCommand
 * @author lzz
 * @date 2018/6/18
 */
public class CommandOff implements Command {

    private TVReceiver tvReceiver;

    public CommandOff(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.turnOff();
    }
}
