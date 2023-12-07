package com.management.bookmyshow.dtos;

import com.management.bookmyshow.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

@Data
@AllArgsConstructor
public class GetUserResponse {

    private Long id;
    private String name;
    private String email;

    public static GetUserResponse fromUser(User user){
        return new GetUserResponse(user.getId(), user.getName(), user.getEmail());
    }
}
