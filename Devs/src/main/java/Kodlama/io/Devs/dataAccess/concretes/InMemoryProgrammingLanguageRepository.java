package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository  {

	
	
	List<ProgrammingLanguage> programmingLanguages;
	
	
	
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}




	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}




	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}




	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
		
	}




	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage language : programmingLanguages) {
			if(language.getId() == programmingLanguage.getId()) {
				programmingLanguages.set(language.getId() -1, programmingLanguage);
			}
		}
		
	}




	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return programmingLanguages.get(id);
	}




	@Override
	public List<ProgrammingLanguage> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
