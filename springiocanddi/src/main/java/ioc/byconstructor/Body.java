package ioc.byconstructor;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 14:19
 */
public class Body {
    //将要注入的洪荒之力
    private Power power;

    public Body(){
        System.out.println("身体空虚！需要注入洪荒之力！");
    }

    public Body(Power power) {
        System.out.println("注入洪荒之力！");
        this.power = power;
    }

    public void execute(){
        System.out.println("正在注入......");
        power.injection();
    }

}
