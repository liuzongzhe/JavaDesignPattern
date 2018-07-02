package example2;

/**
 * @author lzz
 * @date 2018/6/5
 */
public abstract class Shape {

    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 画形状(并填充颜色)
     */
    public abstract void drawShape(Color color);
}
