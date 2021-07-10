package com.genkwiz.starter.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.genkwiz.starter.Entity.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

	List<Question> findByQuestionGenreAndModeId(String questionGenre, int modeId);

	void deleteByQuestionGenre(String questionGenre);

	Question findByQuestionId(int questionId);

	@Transactional
	@Modifying
	@Query(value = "select * from question_bank where genre=:genre and mode_id=:modeId order by random() limit :noOfQuestions ;", nativeQuery = true)
	List<Question> getQuestions(@Param("genre") String genre, @Param("modeId") int modeId,
			@Param("noOfQuestions") int noOfQuestions);

}
