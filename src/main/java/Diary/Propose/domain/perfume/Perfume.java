package Diary.Propose.domain.perfume;

import lombok.Data;

@Data
public class Perfume {

    private Long id;
    private String perfumeName; //텍스트박스
    private String brand; //텍스트박스
    private String topNote; //텍스트박스
    private String middleNote; //텍스트박스
    private String baseNote; //텍스트박스
    private String rating; //셀렉트 박스
    private String review; //텍스트박스
    private String season; //멀티 체크박스
    private String date; //텍스트박스
    private String accords; //멀티 체크박스
}
