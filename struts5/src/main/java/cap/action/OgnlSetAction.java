package cap.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
public class OgnlSetAction extends ActionSupport {
    private String[] fruits;
    private List<String> flowers=new ArrayList<>();
    private Map<Integer,String>provincesMap=new HashMap<>();

    public String ognl(){
        fruits=new String[]{"苹果","梨子","葡萄"};
        flowers.add("太阳花");
        flowers.add("风信子");
        flowers.add("菊花");
        provincesMap.put(1,"北京");
        provincesMap.put(2,"上海");
        provincesMap.put(3,"成都");
        provincesMap.put(4,"重庆");
        return  SUCCESS;
    }

    public String[] getFruits() {
        return fruits;
    }

    public void setFruits(String[] fruits) {
        this.fruits = fruits;
    }

    public List<String> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<String> flowers) {
        this.flowers = flowers;
    }

    public Map<Integer, String> getProvincesMap() {
        return provincesMap;
    }

    public void setProvincesMap(Map<Integer, String> provincesMap) {
        this.provincesMap = provincesMap;
    }
}
