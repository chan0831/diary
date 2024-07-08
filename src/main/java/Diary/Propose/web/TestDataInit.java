package Diary.Propose.web;

import Diary.Propose.domain.letter.Letter;
import Diary.Propose.domain.letter.LetterRepository;
import Diary.Propose.domain.member.Member;
import Diary.Propose.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;
    private final LetterRepository letterRepository;

    @PostConstruct
    public void init(){

        Member member = new Member();
        member.setLoginId("hongik");
        member.setPassword("617!");
        member.setName1("문서정");
        member.setName2("이찬우");

        Letter letter = new Letter();
        letter.setTitle("testDiary");
        letter.setDate("24.06.17");
        letter.setDay(408);
        letter.setContents("생일");
        memberRepository.save(member);
        letterRepository.save(letter);
    }
}
