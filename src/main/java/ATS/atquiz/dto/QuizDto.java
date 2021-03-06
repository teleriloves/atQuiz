package ATS.atquiz.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import ATS.atquiz.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuizDto implements Serializable{

	
	private static final long serialVersionUID = -2497382476162599801L;

	public String id;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
	public Date dateIni;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
	public Date dateEnd;
	
	Double mark;
	
	private User user;
	
	private List<QuestionDto> questions;
	
	public QuizDto() {}
	
	public QuizDto(String id, Date dateIni, Date dateEnd, Double mark, User user, List<QuestionDto> questions) {
		this.id = id;
		this.dateIni = dateIni;
		this.dateEnd = dateEnd;
		this.mark = mark;
		this.user = user;
		this.questions = questions;
	}
	
}
