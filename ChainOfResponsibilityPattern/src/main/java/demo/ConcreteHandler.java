package demo;

/**
 * @author lzz
 * @date 2018/6/18
 */
public class ConcreteHandler extends Handler {

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {

        Handler succossor = getSuccessor();

        //判断是否有后继的责任对象
        if (succossor != null) {
            System.out.println(this.getClass().getName() + "放过请求");
            succossor.handleRequest();
        } else {
            System.out.println(this.getClass().getName() + "处理请求");
        }
    }
}
