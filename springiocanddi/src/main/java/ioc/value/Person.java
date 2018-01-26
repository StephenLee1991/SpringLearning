package ioc.value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 15:14
 */
public abstract class Person {
    String name;
    Integer age;
    List<String> interest;
    Set<String> friends;
    Map<String,Double> score;
    Properties db;
}
