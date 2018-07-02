package example;

/**
 * 频道切换命令ConcreteCommand
 * @author lzz
 * @date 2018/6/18
 */
public class CommandChange implements Command {

    private TVReceiver tvReceiver;
    private int channel;

    public CommandChange(TVReceiver tvReceiver, int channel) {
        this.tvReceiver = tvReceiver;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tvReceiver.changeChannel(channel);
    }
}
