package com.orgofarmsgroup.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
    @Pattern(regexp = "[A-Za-z ]{1,50}", message = "invalid characters in name")
    private String name;

    @Email(message = "invalid email")
    private String email;
}
