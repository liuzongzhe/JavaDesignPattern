package example;

/**
 * 开机命令ConcreteCommand
 * @author lzz
 * @date 2018/6/18
 */
public class CommandOn implements Command {

    private TVReceiver tvReceiver;

    public CommandOn(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.turnOn();
    }
}
