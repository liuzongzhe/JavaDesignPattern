/**
 * 产品类：发动机以及型号
 * @author lzz
 * @date 2018/6/3
 */
public interface Engine {

}

class EngineA implements Engine {
    public EngineA() {
        System.out.println("制造...EngineA");
    }
}

class EngineB implements Engine {
    public EngineB() {
        System.out.println("制造...EngineB");
    }
}
