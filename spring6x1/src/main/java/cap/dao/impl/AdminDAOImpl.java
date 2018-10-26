package cap.dao.impl;

import cap.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public String SayHi() {
        return "欢饮您：学习spring技术";
    }
}
