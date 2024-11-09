package dev.liococn.tasklistmanager.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Username should not be empty")
    @NotBlank(message = "Username should not be blank")
    private String username;

    @Email(message="Email is not formatted")
    @NotEmpty(message = "Email should not be empty")
    @NotBlank(message = "Email should not be blank")
    private String email;

    @NotEmpty
    @NotBlank
    @Size(min = 6, message = "Please, provide a password 6 characters long minimum")
    private String password;
}
