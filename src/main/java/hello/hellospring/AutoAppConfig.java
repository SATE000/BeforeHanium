package hello.hellospring;

import hello.hellospring.member.MemberRepository;
import hello.hellospring.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        basePackages = "hello.hellospring.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository") // 수동으로 입력한 빈을 우선으로 등록
    MemberRepository memberRepository () {
        return new MemoryMemberRepository();
    }

}
