package demo.push;

/**
 * 观察者接口
 * @author lzz
 * @date 2018/6/7
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    void update(String state);
}
