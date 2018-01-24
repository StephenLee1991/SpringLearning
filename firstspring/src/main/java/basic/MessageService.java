package basic;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 10:50
 */
public class MessageService {

    public MessageService() {
        System.out.println("通过Spring创建了MessageService对象！");
    }

    //初始化方法，容器创建好bean的实例之后，会立即调用初始化方法
    public void init(){
        System.out.println("MessageService的初始化方法！");
    }
    //销毁方法，容器关闭之前会调用销毁方法
    public void destroy(){
        System.out.println("MessageService的销毁方法！");
    }
}
