package com.mysite.sbb.question;

import com.mysite.sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //question엔티티로 리포지토리생성 엔티티의 기본키는 인티저임을 지정해줘야함.

    Question findBySubject(String subject);

    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);
}
