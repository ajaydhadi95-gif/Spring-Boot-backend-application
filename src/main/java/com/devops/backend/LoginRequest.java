package com.devops.backend;

public class LoginRequest {
    private String email;
    private String password;
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

package com.devops.backend;

public class LoginResponse {
    private String message;
    private boolean success;
    public LoginResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
    public String getMessage() { return message; }
    public boolean isSuccess() { return success; }
}