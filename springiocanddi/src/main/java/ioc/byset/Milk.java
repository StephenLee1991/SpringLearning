package ioc.byset;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 13:55
 */
public class Milk implements Liquid {

    public Milk() {
        System.out.println("牛奶！");
    }

    public void flow() {
        System.out.println("调用牛奶的流动方法！");
    }
}
