package com.management.bookmyshow.dtos;

import com.management.bookmyshow.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    @NotNull
    private String name;
    private String email;
    private String password;

    public User toUser(){
        return new User(name, email, password);
    }
}
