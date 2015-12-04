package com.crossover.testmaker.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crossover.testmaker.model.Exam;
import com.crossover.testmaker.service.ExamService;
import com.crossover.testmaker.view.ExamView;

@RestController
@RequestMapping("/exams")
@Transactional
public class ExamController {

	@Inject
	private ExamService examService;
	
	@RequestMapping(path = "/newexam", method = RequestMethod.GET)
	public ModelAndView getNewExam(){
		ModelAndView model = new ModelAndView("exammodify");
		model.addObject("examView",new ExamView());
		return model;
	}
	
	@RequestMapping(path = "/newexam", method = RequestMethod.POST)
	public ModelAndView addNewExam(Exam exam){
		ModelAndView model = new ModelAndView("exammodify");
		//TODO
		return model;
	}
	
	@RequestMapping(path = "/modifyExam", method = RequestMethod.PUT)
	public ModelAndView modifyExam(Exam exam){
		ModelAndView model = new ModelAndView();
		//TODO
		return model;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView findAll(){
		ModelAndView model = new ModelAndView("examlist");
		List<Exam> examList = examService.findAll();
		List<ExamView> examViewList = examList.stream().map(elem -> new ExamView(elem)).collect(Collectors.toList());
		model.addObject("examViewList", examViewList);
		return model;
	}
	
	@RequestMapping(path = "/{examId}", method = RequestMethod.GET)
	public ModelAndView addNewExam(@RequestParam(value = "examId", required = true) Integer examId){
		ModelAndView model = new ModelAndView("viewexam");
		ExamView examView = new ExamView(examService.findExam(examId));
		model.addObject("examView", examView);
		return model;
	}
	
	@RequestMapping(path = "/checktimer/{initTime}/{examId}", method = RequestMethod.GET)
	public ModelAndView checkTimer(@RequestParam(name = "initTime", required = true)Date initTime,
			@RequestParam(name = "examId", required = true)Integer examId){
		ModelAndView model = new ModelAndView();
		Exam exam = examService.findExam(examId);
		if (System.currentTimeMillis() - initTime.getTime() > exam.getDuration()*1000*60){
			model.setViewName("redirect:endexam?timer=false");
		}
		return model;
	}
	
	public void setExamService(ExamService examService) {
		this.examService = examService;
	}
}
