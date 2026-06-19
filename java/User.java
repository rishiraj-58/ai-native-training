public class User {
    private Long id;
    private String username;
    private Boolean active=true; 

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Boolean isActive() {
        return active;
    }
}