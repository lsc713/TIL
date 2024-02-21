package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionService questionService;

	@Test
	void testJPA() {
		for (int i = 1; i < 300; i++) {
			String subject = String.format("테스트 데이터입니다.[%03d]", i);
			String content = "내용 없음";
			this.questionService.create(subject, content, null);
		}

//		Question q1 = new Question();
//		q1.setSubject("what is sbb");
//		q1.setContent("i want to know sbb");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("question about spring boot");
//		q2.setContent("is really auto generate id?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		//
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(6, all.size());
//
//		Question q = all.get(0);
//		assertEquals("what is sbb", q.getSubject());
		//


//		Optional<Question> oq = this.questionRepository.findById(1);
//		if (oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("what is sbb", q.getSubject());
//		}
		//
//		Question q = this.questionRepository.findBySubjectAndContent("what is sbb","i want to know sbb");
//		assertEquals(1, q.getId());
		//
//		List<Question> qList = this.questionRepository.findBySubjectLike("what%");
//		Question q = qList.get(0);
//		assertEquals("what is sbb", q.getSubject());
		//
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
		//
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());
		// ===================================================================Answer=====================

//		Optional<Question> oq = this.questionRepository.findById(4);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		q.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
		//
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(4, a.getQuestion().getId());
		//
//		Optional<Question> oq = this.questionRepository.findById(4);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		List<Answer> answerlist = q.getAnswerList();
//
//		assertEquals(1, answerlist.size());
//		assertEquals("네 자동으로 생성됩니다.", answerlist.get(0).getContent());
		//

	}


}
