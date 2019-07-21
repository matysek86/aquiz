package pl.sda.java.aquiz.aquizapp.config;

public enum Roles {

    ADMIN("ADMIN", "ADMIN_ROLE"),
    USER("USER", "USER_ROLE");

    private String roleName;
    private String autrityName;

    Roles(String roleName, String autrityName) {
        this.roleName = roleName;
        this.autrityName = autrityName;

    }

    public String getRoleName() {
        return roleName;
    }

    public String getAutrityName() {
        return autrityName;
    }
}
