package cap.bean;

import javax.persistence.criteria.Order;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private Set<cap.bean.Order> orders = new HashSet<>();  //初始化

    public Set<cap.bean.Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<cap.bean.Order> orders) {
        this.orders = orders;
    }

    public Customer() {
    }

    public Customer(String name, String address, String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
