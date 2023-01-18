package com.mapping;

import javax.persistence.*;

@Entity
public class Questions {
	
	@Id
	@Column(name ="question_Id")
	private int questionId;
	
	private String question;
	
	@OneToOne
	private Answer answer;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Questions(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public Questions() {
		super();
	}
	
	
}
