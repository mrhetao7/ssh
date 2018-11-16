package cap.util;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

public class DBCon {
    private static DriverManagerDataSource dataSource;

    public static  DriverManagerDataSource getDataSource(){
        dataSource=new DriverManagerDataSource();   //必须要初始化
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/java");
        dataSource.setUsername("root");
        dataSource.setPassword("173170");
        return  dataSource;
    }
}
