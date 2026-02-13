package lld.splitwise;

public class User {
    private final String username;
    private final String userId;

    User(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof User)) { return false; }
        User other = (User) o;
        return this.getUsername().equals(other.getUsername());
    }
}
