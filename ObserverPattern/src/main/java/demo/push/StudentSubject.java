package demo.push;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class StudentSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    @Override
    public void change(String newState) {
        state = newState;
        System.out.println("考生状态：" + state);
        //状态发生改变，通知各个观察者
        //这里模拟被监考老师和摄像头捕获到考生状态
        this.nodifyObservers(state);
    }
}
