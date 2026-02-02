package com.example.boardv1.user;

import lombok.Data;

public class UserRequest {

    @Data
    public static class LoginDTO {
        private String username;
        private String password;
    }

    // 회원가입할 때 필요한 정보 3가지 JoinDTO
    @Data
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;
    }

}
