package hello.hellospring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient /*implements InitializingBean, DisposableBean*/ {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url : " + url);
//        connect();
//        call("초기화 연결 메세지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect () {
        System.out.println("connect : " + url);
    }

    public void call (String message) {
        System.out.println("call : " + url + " message = " + message);
    }

    //서비스 종료시 호출
    public void disconnect () {
        System.out.println("close " + url);
    }

//    @Override
    @PostConstruct
    public void init () /*afterPropertiesSet() throws Exception*/ {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

//    @Override
    @PreDestroy
    public void close () /*destroy() throws Exception*/ {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
