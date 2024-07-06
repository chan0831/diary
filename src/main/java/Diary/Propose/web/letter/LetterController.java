package Diary.Propose.web.letter;

import Diary.Propose.domain.letter.Letter;
import Diary.Propose.domain.letter.LetterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/letters")
@RequiredArgsConstructor
public class LetterController {

    private final LetterRepository letterRepository;

    @GetMapping
    public String letters(Model model){
        List<Letter> letters = letterRepository.findAll();
        model.addAttribute("letters", letters);
        return "letters/letters";
    }
}
