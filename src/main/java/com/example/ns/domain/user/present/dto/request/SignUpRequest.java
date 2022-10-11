package com.example.ns.domain.user.present.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "email은 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    @Size(min = 8, max = 50, message = "email은 8자 이상, 50자 이하여야 합니다.")
    private String email;

    @NotBlank(message = "password는 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    @Size(min = 8)
    private String password;

    @NotBlank(message = "username은 Null, 공백, 띄어쓰기를 허용하지 않습니다.")
    private String username;
}