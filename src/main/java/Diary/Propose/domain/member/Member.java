package Diary.Propose.domain.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Member {

    private Long id;

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String name1;

    @NotEmpty
    private String name2;

    @NotEmpty
    private String password;
}
