package ioc.byconstructor;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 14:19
 */
public class Power {

    public Power() {
        System.out.println("洪荒之力！");
    }

    void injection(){
        System.out.println("体内已经注入了洪荒之力！");
    }
}
