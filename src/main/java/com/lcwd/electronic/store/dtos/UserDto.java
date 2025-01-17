package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.entities.Role;
import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {

    private String userId;

    @Size(min = 3,max = 15,message = "invalid name size")
    private String name;

    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "invalid email of user")
    @NotBlank(message = "email is required")
    private String email;

    @NotBlank(message = "password not provided")
    private String password;

    @Size(min = 4,max = 6,message = "invalid gender")
    private String gender;

    @NotBlank(message = "invalid about")
    private String about;

    @ImageNameValid
    private String imageName;

    private List<RoleDto> roles;
}
