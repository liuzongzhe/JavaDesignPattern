package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义具体产品类（Product）：电脑
 * @author lzz
 * @date 2018/6/3
 */
public class Computer {
    /**
     * 电脑组件的集合
     */
    private List<String> parts = new ArrayList<String>();

    /**
     * 用于将组件组装到电脑里
     */
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (String part : parts) {
            System.out.println("组件" + part + "装好了");
        }
        System.out.println("电脑组装完成，请验收");
    }
}
