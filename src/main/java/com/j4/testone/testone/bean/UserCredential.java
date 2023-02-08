package com.j4.testone.testone.bean;

import org.springframework.beans.factory.annotation.Value;

public class UserCredential implements CredentialAll{
    @Value("${value.user}")
    private String user;

    @Value("${value.passuser}")
    private String passuser;

    @Value("${value.random.token}")
    private long token;

    public UserCredential(){

    }

    @Override
    public String fullCreadential() {
        return "User: " + this.user + " Password: " + this.passuser + " Token: " + this.token;
    }
}
