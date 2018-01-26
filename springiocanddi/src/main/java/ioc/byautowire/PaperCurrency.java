package ioc.byautowire;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 14:47
 */
public class PaperCurrency implements Money{

    public PaperCurrency() {
        System.out.println("纸币！");
    }

    public void put() {
        System.out.println("放入纸币！");
    }
}
