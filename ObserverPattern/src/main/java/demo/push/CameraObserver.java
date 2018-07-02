package demo.push;

/**
 * 监控像头
 * @author lzz
 * @date 2018/6/7
 */
public class CameraObserver implements Observer {

    @Override
    public void update(String state) {
        System.out.println("摄像头发现：" + state);
    }
}
