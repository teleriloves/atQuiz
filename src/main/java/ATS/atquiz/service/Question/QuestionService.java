package ATS.atquiz.service.Question;

import java.util.List;

import org.bson.types.ObjectId;

import ATS.atquiz.dto.QuestionDto;
import ATS.atquiz.model.Question;


public interface QuestionService {
	
	
	public Question map(QuestionDto dto);
	
	public QuestionDto map(Question a);

	/**
	 * Realiza la busqueda de todas las Questionas existentes (con paginacion)
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	public List<QuestionDto> findAll(Integer page, Integer size);
	
	/**
	 * Busca por Id
	 * 
	 * @param idQuestion
	 * @return
	 */
	public QuestionDto findById(String idQuestion)throws Exception;
	
	/**
	 * Crea una Questiona
	 * 
	 * @param c
	 * @return
	 */
	public QuestionDto create(QuestionDto a);
	
	/**
	 * Modifica una Questiona
	 * 
	 * @param c
	 */
	public void update(QuestionDto a);

	/**
	 * Borra una Questiona
	 * 
	 * @param c
	 */
	public void delete(String idQuestion);
	
}
