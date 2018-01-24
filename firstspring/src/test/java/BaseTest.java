import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 11:13
 */
class BaseTest {

    /**
     * 用来启动容器
     */
    private String configPath = "basic.xml";
    AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(configPath);

}
