package hello.hellospring.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //private으로 외부에서 추가로 생성하는 것을 막는다
    private SingletonService () {}

    public void logic () {
        System.out.println("싱클톤 객체 로직 호출");
    }

}
