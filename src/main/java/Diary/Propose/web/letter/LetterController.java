package Diary.Propose.web.letter;

import Diary.Propose.domain.letter.Letter;
import Diary.Propose.domain.letter.LetterRepository;
import Diary.Propose.domain.letter.LetterType;
import Diary.Propose.web.letter.form.LetterSaveForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/letters")
@RequiredArgsConstructor
public class LetterController {

    private final LetterRepository letterRepository;

    @ModelAttribute("letterType")
    public LetterType[] letterTypes() {return LetterType.values();}

    @GetMapping
    public String letters(Model model){
        List<Letter> letters = letterRepository.findAll();
        model.addAttribute("letters", letters);
        return "letters/letters";
    }

    @GetMapping("/{letterId}")
    public String letter(@PathVariable long letterId, Model model){
        Letter letter = letterRepository.findById(letterId);
        model.addAttribute("letter", letter);
        return "letters/letter";
    }

    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("letter" , new Letter());
        return "letters/addForm";
    }

    @PostMapping("/add")
    public String addLetter(@Validated @ModelAttribute ("letter")LetterSaveForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if(bindingResult.hasErrors()){
            log.info("errors{}=", bindingResult);
            return "letters/addForm";
        }

        //성공 로직
        Letter letter = new Letter();
        letter.setTitle(form.getTitle());
        letter.setDate(form.getDate());
        letter.setDay(form.getDay());
        letter.setContents(form.getContents());

        letter.setLetterType(form.getLetterType());


        Letter savedLetter = letterRepository.save(letter);

        redirectAttributes.addAttribute("letterId", savedLetter.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/letters/{letterId}";
    }
}
