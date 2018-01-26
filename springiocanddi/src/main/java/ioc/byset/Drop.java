package ioc.byset;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 13:40
 */
public class Drop implements Liquid {

    public Drop() {
        System.out.println("水滴！");
    }

    public void flow() {
        System.out.println("调用水滴的流动方法！");
    }
}
