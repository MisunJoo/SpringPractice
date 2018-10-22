package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Member;
import examples.daoexam.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceSelectTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        MemberService memberService = applicationContext.getBean(MemberService.class);

        Member  member = memberService.getMember("0987someday@naver.com");
        System.out.println(member);
    }
}
