package com.example.boardv1.user;

import lombok.Data;

public class UserRequest {

    // 회원가입할 때 필요한 정보 3가지 JoinDTO
    @Data
    public static class JoinDTO {
        private String username;
        private String password;
        private String email;
    }

}
