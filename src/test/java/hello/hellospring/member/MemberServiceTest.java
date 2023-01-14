package hello.hellospring.member;

import hello.hellospring.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MemberServiceTest {

    MemberService memberService;// = new MemberServiceImpl();

    @BeforeEach //Test를 실행하기전 무조건 실행된다
    public void beforeEach () {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    public void test_Join () {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.fingMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
