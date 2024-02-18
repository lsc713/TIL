package com.mysite.sbb.question;

import com.mysite.sbb.answer.AnswerForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/list") //페이징 기능에 대해 첫 페이지번호는 0 이므로 기본값 0 설정.
    public String list(Model model, @RequestParam(value = "page", defaultValue = "0")int page) {
        Page<Question> paging = this.questionService.getList(page);
        model.addAttribute("paging", paging);
        /**
         *List<Question> questionList = this.questionService.getList();
         *         model.addAttribute("questionlist", questionList);
         *
         */
        //모델객체에 퀘스쳔리스트를 퀘스쳔리스트라고 넣었음.
        //1. 자바 클래스와 템플릿간 연결고리로 모델값을 담으면 템플릿에서 사용가능,
        //2. 모델객체는 생성필요없고 컨트롤러의 메서드에 매개변수로 지정하면 스프링에서 모델객체생성해줌.
        return "question_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id, AnswerForm answerForm) {
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail";
    }
    //변하는 id값을 얻을 때에는 @PathVariable을 사용한다.

    @GetMapping("/create")
    public String questionCreate(QuestionForm questionForm) {
        return "question_form";
    }

    @PostMapping("/create")
    public String questionCreate(@Valid QuestionForm questionForm, BindingResult
            bindingResult){//BindingResult 매개변수는 항상 발리드 매개변수 바로 뒤에 위치해야한다.
        if (bindingResult.hasErrors()) {
            return "question_form";
        }
        this.questionService.create(questionForm.getSubject(), questionForm.getContent());
        return "redirect:/question/list"; //질문 저장 후 질문 목록으로 이동
    }
}
