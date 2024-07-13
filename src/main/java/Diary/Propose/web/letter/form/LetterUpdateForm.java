package Diary.Propose.web.letter.form;

import Diary.Propose.domain.letter.LetterType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LetterUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String title;

    @NotNull
    private Integer day;

    @NotBlank
    private String date;

    @NotBlank
    private String contents;

    private LetterType letterType;

    private String score;
}
