package example;

/**
 * 遥控器Invoker
 * @author lzz
 * @date 2018/6/18
 */
public class Invoker {

    private Command commandOn, commandOff, commandChannel;

    public Invoker(Command commandOn, Command commandOff, Command commandChannel) {
        this.commandOn = commandOn;
        this.commandOff = commandOff;
        this.commandChannel = commandChannel;
    }

    public void turnOn() {
        commandOn.execute();
    }

    public void turnOff() {
        commandOff.execute();
    }

    public void changeChannel() {
        commandChannel.execute();
    }


}
