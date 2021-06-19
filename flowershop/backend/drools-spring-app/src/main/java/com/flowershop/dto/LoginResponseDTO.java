package com.flowershop.dto;

public class LoginResponseDTO {
    
    private String accessToken;
    private Long expiresIn;


    public LoginResponseDTO() {
    }

    public LoginResponseDTO(String accessToken, Long expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public LoginResponseDTO accessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    public LoginResponseDTO expiresIn(Long expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }


}
