package example;

/**
 * @author lzz
 * @date 2018/6/18
 */
public class Client {
    public static void main(String[] args) {
        // 命令接收者
        TVReceiver tvReceiver = new TVReceiver();

        // 开机命令
        Command commandOn = new CommandOn(tvReceiver);
        // 关机命令
        Command commandOff = new CommandOff(tvReceiver);
        // 切换频道命令
        Command commandChange = new CommandChange(tvReceiver, 2);

        // 命令控制对象遥控器Invoker
        Invoker invoker = new Invoker(commandOn, commandOff, commandChange);

        // 执行命令
        invoker.turnOn();
        invoker.changeChannel();
        invoker.turnOff();
    }
}
