package example1;

/**
 * @author lzz
 * @date 2018/6/5
 */
public abstract class Area {
    //引用桥接口(去哪里)
    private Bridge bridge;

    /*public Area(Bridge bridge) {
        this.bridge = bridge;
    }*/

    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }

    //来源地方法
    public abstract void fromArea();
}
