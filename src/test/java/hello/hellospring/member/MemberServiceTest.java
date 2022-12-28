package hello.hellospring.member;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    public void test_Join () {
        Member member = new Member(1L, "TestMember", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.fingMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

}
