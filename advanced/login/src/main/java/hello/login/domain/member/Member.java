package hello.login.domain.member;

import lombok.Data;

@Data
public class Member {

    private Long id;

    private String loginId; //로그인 ID
    private String name;
    private String password;



}
