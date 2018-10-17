package cap.bean;

public class Admin {
    private int id;
    private String usernmae;
    private String password;

    public Admin() {
    }

    public Admin(int id, String usernmae, String password) {
        this.id = id;
        this.usernmae = usernmae;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
