package demo.pull;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class DadObserver implements Observer {

    @Override
    public void update(Subject subject) {
        String state = ((BabySubject) subject).getState();
        System.out.println("爸爸发现：" + state);
    }
}
