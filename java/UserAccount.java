public class UserAccount {
    private String username;
    private String email;
    private int loginCount;

    public UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public voidrecordLogin() {
        loginCount++;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}