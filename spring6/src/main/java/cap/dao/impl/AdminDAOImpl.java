package cap.dao.impl;

import cap.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO {


    @Override
    public String SayHello() {
        return "欢迎学习spring技术";
    }
}
