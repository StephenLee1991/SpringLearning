import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 13:57
 */
class BaseTest {
    /**
     * 配置文件路径
     */
    private String[] configPath = {
            "ioc.xml",
            "autowired.xml",
            "value.xml"
    };
    AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(configPath);
}
