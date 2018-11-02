package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "adminDAO")
public class AdminDAOImpl implements AdminDAO {
    private class MyRowMapper implements RowMapper<Admin>{

        @Override
        public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
            Admin admin=new Admin();
            admin.setId(resultSet.getInt("id"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
            return admin;
        }
    }
@Resource

   /* public void setDataSource(DataSource dataSource){
        this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate((javax.sql.DataSource) dataSource);
    }
*/
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<Admin> findAdmins() {
        String sql="select * from gl ";
        return namedParameterJdbcTemplate.query(sql,new MyRowMapper());
    }

    @Override
    public Admin findById(int id) {
        String sql="select * from gl where id=:i";
        Map<String,Object> params=new HashMap<>();
        params.put("i",id);
        return namedParameterJdbcTemplate.queryForObject(sql,params,new MyRowMapper());
    }

    @Override
    public int updaAdmin(Admin admin) {
        String sql="update gl set username=:u,password=:p where id=:id";
        Map<String,Object> params=new HashMap<>();
        params.put("id",admin.getId());
        params.put("u",admin.getUsername());
        params.put("p",admin.getPassword());
        return namedParameterJdbcTemplate.update(sql,params);
    }

    @Override
    public int delAdmin(int id) {
        String sql="delete from gl where id=:id";
        Map<String,Object> params=new HashMap<>();
        params.put("id",id);
        return namedParameterJdbcTemplate.update(sql,params);
    }

    @Override
    public int addAdmin(Admin admin) {
        String sql="insert into gl(username,password) values(:username,:password)";
        SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(admin);
        //int result = 10 / 0;
        return namedParameterJdbcTemplate.update(sql,sqlParameterSource);
    }
}
