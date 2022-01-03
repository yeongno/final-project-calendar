package com.larry.fc.finalproject.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class User {

    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private LocalDateTime createdAt;

    public User(String name, String email, String password, LocalDate birthday, LocalDateTime createdAt) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.createdAt = createdAt;
    }
}
