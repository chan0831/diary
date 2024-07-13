package Diary.Propose.web.perfume;

import Diary.Propose.domain.letter.Score;
import Diary.Propose.domain.perfume.PerfumeRepository;
import Diary.Propose.domain.perfume.Rating;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//향수 메인 -> /perfumes
//향수 목록 -> /perfumes/perfumes
//향수 상세 -> /perfumes/perfumes/perfume
//향수 수정 -> /perfumes/update
//향수 등록 -> /perfumes/add
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/perfumes")
public class PerfumeController {

    private final PerfumeRepository perfumeRepository;

    @ModelAttribute("rating")
    public List<Rating> rating(){
        List<Rating> rating = new ArrayList<>();

        rating.add(new Rating("5.0", "5.0"));
        rating.add(new Rating("4.5", "4.5"));
        rating.add(new Rating("4.0", "4.0"));
        rating.add(new Rating("3.5", "3.5"));
        rating.add(new Rating("3.0", "3.0"));
        rating.add(new Rating("2.5", "2.5"));
        rating.add(new Rating("2.0", "2.0"));
        rating.add(new Rating("1.5", "1.5"));
        rating.add(new Rating("1.0", "1.0"));
        rating.add(new Rating("0.5", "0.5"));
        rating.add(new Rating("0.0", "0.0"));

        return rating;
    }


}
