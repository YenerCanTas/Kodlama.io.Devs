package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
	
	ProgrammingLanguage getProgrammingLanguageById(int id);
	
	
	
	
}
