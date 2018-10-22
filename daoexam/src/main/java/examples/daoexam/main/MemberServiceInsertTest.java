package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Member;
import examples.daoexam.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class MemberServiceInsertTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MemberService memberService = applicationContext.getBean(MemberService.class);

        Member member = new Member();
        member.setName("joo");
        member.setEmail("0987someday@naver.com");
        member.setPassword("misun");
        member.setRegdate(new Date());

        Member result = memberService.addMember(member);
        System.out.println(result);
    }
}
