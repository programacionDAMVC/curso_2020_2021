package teoria.ficherosJSON;

import java.util.Arrays;

public class User {
    /*{"name": "John Doe",
            "email": "john.doe@example.com",
            "roles": [
    "Member",
            "Admin"
  ],
    "admin": true
}*/
    private String name;
    private String email;
    private String[] roles;
    private boolean admin;

    public User() {    }

    public User(String name, String email, String[] roles, boolean admin) {
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%B", name, email, Arrays.toString(roles), admin);
    }
}
