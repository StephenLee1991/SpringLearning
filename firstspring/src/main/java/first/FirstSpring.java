package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 10:19
 */
public class FirstSpring {
    public static void main(String[] args) {
        //配置文件路径
        String config = "applicationContext.xml";
        /*
         ApplicatonContext是接口ClassPathApplicationContext是一个实现类，
         将配置文件路径传到实现类中，该类依照路径查找Spring配置文件并启动容器。
        */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //通过Student类的构造器创建了Student对象
        Student student = applicationContext.getBean("stu1",Student.class);
        System.out.println(student);
        //通过Data类的构造器创建了Data对象
        Date date = applicationContext.getBean("date1",Date.class);
        System.out.println(date);
        //通过Calander的静态方法创建对象
        Calendar calendar = applicationContext.getBean("cal1",Calendar.class);
        System.out.println(calendar);
        //通过实例工厂方法创建对象
        Date date1 = applicationContext.getBean("time1",Date.class);
        System.out.println(date1);
    }
}
