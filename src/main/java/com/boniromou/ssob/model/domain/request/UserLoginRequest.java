package com.boniromou.ssob.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3488822252923138374L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
