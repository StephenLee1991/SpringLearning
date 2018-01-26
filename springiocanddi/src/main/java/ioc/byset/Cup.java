package ioc.byset;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 13:35
 */
public class Cup {

    private Liquid drop;

    private Liquid milk;

    public Cup() {
        System.out.println("水杯！");
    }

    public void setDrop(Liquid drop) {
        System.out.println("要倒水滴！");
        this.drop = drop;
    }

    public void setMilk(Liquid milk) {
        System.out.println("牛奶要倒出来了！");
        this.milk = milk;
    }

    public void execute(){
        drop.flow();
        System.out.println("Cup里面滴了一滴水！");
        milk.flow();
        System.out.println("Cup里面倒牛奶！");
    }
}
