package Diary.Propose.web;

import Diary.Propose.domain.member.Member;
import Diary.Propose.domain.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init(){

        Member member = new Member();
        member.setLoginId("hongik");
        member.setPassword("617!");
        member.setName1("문서정");
        member.setName2("이찬우");

        memberRepository.save(member);
    }
}
