package demo.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 推模型
 * 案例：学生考试；
 *
 * 抽象主题类（被观察者：考生）
 * 观察者1（老师监考）
 * 观察者2（摄像头监视）
 *
 * @author lzz
 * @date 2018/6/7
 */
public abstract class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer    观察者对象
     */
    public void add(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 删除观察者对象
     * @param observer    观察者对象
     */
    public void remove(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }

    /**
     * 具体主题对象来实现
     * @param state
     */
    public abstract void change(String state);

}
