import basic.MessageService;
import basic.Teacher;
import org.junit.Test;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 10:55
 */
public class TestCase extends BaseTest{

    @Test
    //测试scope=singleton和lazy-init=true延时加载，设置为lazy的bean将不会在ApplicationContext启动时提前被实例化，而是第一次向容器通过getBean索取bean时实例化
    public void test1(){
        //测试scope是singleton
        Teacher teacher1 = abstractApplicationContext.getBean("t1", Teacher.class);
        Teacher teacher2 = abstractApplicationContext.getBean("t1",Teacher.class);
        //查看teacher1和teacher2是否为同一个对象
        System.out.println(teacher1 == teacher2);//true
        //关闭容器
        abstractApplicationContext.close();
    }

    @Test
    //测试scope=prototype和lazy-init=false立即加载，表示在spring启动时，立刻进行实例化
    public void  test2(){

        Teacher teacher1 = abstractApplicationContext.getBean("t2",Teacher.class);
        Teacher teacher2 = abstractApplicationContext.getBean("t2",Teacher.class);

        System.out.println(teacher1==teacher2);//false表示创建了两个对象
        //关闭容器
        abstractApplicationContext.close();
    }

    @Test
    //测试init-method和destroy-method
    public void test3(){
        MessageService messageService = abstractApplicationContext.getBean("ms1",MessageService.class);
        System.out.println(messageService);
        //关闭容器
        abstractApplicationContext.close();
    }
}
