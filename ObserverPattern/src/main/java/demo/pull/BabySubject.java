package demo.pull;

/**
 * 拉模型
 * 案例：妈妈爸爸照看婴儿
 *
 * 抽象主题类（被观察者：婴儿）
 * 观察者1（妈妈）
 * 观察者2（爸爸）
 *
 * @author lzz
 * @date 2018/6/7
 */
public class BabySubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    /**
     * 跟推模型相比，有一点变化，
     * 就是调用通知观察者的方法的时候，不需要传入参数了。
     */
    @Override
    public void change(String newState) {
        state = newState;
        System.out.println("婴儿状态：" + state);
        //状态发生改变，通知各个观察者
        //这里模拟妈妈爸爸时时刻刻照看婴儿
        this.nodifyObservers();
    }
}
