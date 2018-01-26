import ioc.byautowire.Wallet;
import ioc.byconstructor.Body;
import ioc.byset.Cup;
import ioc.value.Lee;
import ioc.value.Niu;
import org.junit.Test;

import java.util.Properties;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 13:58
 */
public class TestCase extends BaseTest{

    @Test
    //测试set方法将水滴注入水杯
    public void test1(){
        Cup cup = abstractApplicationContext.getBean("cup", Cup.class);
        cup.execute();
    }
    @Test
    //测试set方法将牛奶注入水杯
    public void test2(){
        Cup cup = abstractApplicationContext.getBean("cup",Cup.class);
        cup.execute();
    }
    @Test
    //测试使用构造器注入
    public void test3(){
        Body body = abstractApplicationContext.getBean("body",Body.class);
        body.execute();
    }
    @Test
    //测试使用自动匹配注入
    public void test4(){
        Wallet wallet = abstractApplicationContext.getBean("wallet",Wallet.class);
        wallet.buy();
    }
    @Test
    //测试注入数据
    public void test5(){
        Lee lee = abstractApplicationContext.getBean("lee", Lee.class);
        System.out.println(lee);
    }
    @Test
    //测试 通过集合bean注入数据
    public void test6(){
        Niu niu =abstractApplicationContext.getBean("niu",Niu.class);
        System.out.println(niu);
    }

    @Test
    //测试读取properties文件内容
    public void test(){
        Properties properties = abstractApplicationContext.getBean("properties",Properties.class);
        System.out.println(properties);
    }

}
