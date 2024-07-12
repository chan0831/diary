package Diary.Propose.web.letter.form;

import Diary.Propose.domain.letter.LetterType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class LetterSaveForm {

    @NotBlank
    private String title;

    @NotNull
    @Range(min = 1 , max = 36500)
    private Integer day;

    @NotBlank
    private String date;

    @NotBlank
    private String contents;

    private LetterType letterType;
}
