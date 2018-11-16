package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import cap.util.DBCon;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(DBCon.getDataSource());

    public class MyRowMappe implements RowMapper<Admin>{             //类MyRowMapper 封装获得参数

        @Override
        public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
            Admin admin=new Admin();
            admin.setId(resultSet.getInt("id"));   //得到参数
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
            return admin;
        }
    }

    @Override
    public List<Admin> findAdmins() {
        String sql="select * from gl order by id";
        List<Admin> adminList=jdbcTemplate.query(sql,new MyRowMappe());
        return adminList;
    }
}
