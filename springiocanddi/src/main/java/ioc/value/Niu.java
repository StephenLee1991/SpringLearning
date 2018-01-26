package ioc.value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @创建人 StephenLee
 * @创建时间 2018/1/24 17:36
 */
public class Niu extends Person {

    public Niu() {
        System.out.println("写入niu的数据！");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public List<String> getInterest(){
        return  interest;
    }
    public void setInterest(List<String> interest){
        this.interest = interest;
    }

    public Set<String> getFriends(){
        return friends;
    }
    public void setFriends(Set<String> friends){
        this.friends = friends;
    }

    public Map<String,Double> getScore(){
        return  score;
    }
    public void setScore(Map<String,Double> score){
        this.score = score;
    }

    public Properties getDb(){
        return db;
    }
    public void setDb(Properties db){
        this.db=db;
    }

    @Override
    public String toString() {
        return "Niu{" +
                "interest=" + interest +
                ", friends=" + friends +
                ", score=" + score +
                '}';
    }
}
