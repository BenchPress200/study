package spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindTest {
    public static void main(String[] args) {
        // TODO
        // 유저 엔티티와 게시글 엔티티 생성
        // 게시글은 유저 아이디를 참조하는 조인칼럼추가 + 레이지 로딩
        // 게시글 조회할 때 id 기반 조회화 객체 조회 기반 나가는 쿼리와 성능 확인
        SpringApplication.run(FindTest.class, args);
    }
}
