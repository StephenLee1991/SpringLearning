package ioc.byautowire;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 14:48
 */
public class Coin implements Money {

    public Coin() {
        System.out.println("硬币！");
    }

    public void put() {
        System.out.println("放入硬币！");
    }
}
