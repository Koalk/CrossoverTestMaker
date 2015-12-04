package com.crossover.testmaker.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.model.Question;
import com.crossover.testmaker.service.ExamService;
import com.crossover.testmaker.service.QuestionService;
import com.crossover.testmaker.view.ExamView;
import com.crossover.testmaker.view.QuestionView;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Inject
	private QuestionService questionService;
	
	@Inject
	private ExamService examService;
	
	@RequestMapping(path = "/newquestion/{examId}", method = RequestMethod.GET)
	public ModelAndView getNewQuestion(@RequestParam(name = "examId", required = true)Integer examId){
		ModelAndView model = new ModelAndView("questionview");
		model.addObject("questionView",new QuestionView(examService.findExam(examId)));
		return model;
	}
	
	@RequestMapping(path = "/addquestion", method = RequestMethod.POST)
	public ModelAndView addNewQuestion(QuestionView questionView){
		ModelAndView model = new ModelAndView("exammodify");
		Exam exam = examService.findExam(questionView.getExamId());
		Question question = new Question(questionView,exam);
		questionService.save(question);
		exam.getQuestionList().add(question);
		model.addObject("examView",new ExamView(exam));
		return model;
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ModelAndView getQuestion(@RequestParam(name = "id", required = true) Integer id){
		ModelAndView model = new ModelAndView("questionview");
		model.addObject("questionView",new QuestionView(questionService.findQuestion(id)));
		return model;
	}
	
	@RequestMapping(path = "/examquestions/{id}", method = RequestMethod.GET)
	public ModelAndView getQuestionsByExam(@RequestParam(name = "id", required = true) Integer id){
		ModelAndView model = new ModelAndView("questionview");
		List<Question> questionList = questionService.findQuestionByExam(examService.findExam(id));
		List<QuestionView> questionViewList = questionList.stream().map(elem -> new QuestionView(elem)).collect(Collectors.toList());
		model.addObject("questionViewList",questionViewList);
		return model;
	}
	
	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}
	
	public void setExamService(ExamService examService) {
		this.examService = examService;
	}
}