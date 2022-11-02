package Kodlama.io.Devs.business.concretes;

import java.util.List;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
		
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}



	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}



	@Override
	public void add(ProgrammingLanguage programmingLanguage)  throws Exception {
		if (programmingLanguage.getName().isBlank()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}
		
		for (ProgrammingLanguage inDbLanguage : programmingLanguageRepository.getList()) {
			if (inDbLanguage.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimli programlama dili zaten mevcut!");
			}
			if (inDbLanguage.getId() == programmingLanguage.getId()) {
				throw new Exception("İd tekrar edemez!");
			}
		}
		
		programmingLanguageRepository.add(programmingLanguage);
		
	}



	@Override
	public void delete(int id) throws Exception {
		for (ProgrammingLanguage inDbLanguage : programmingLanguageRepository.getList()) {
			if (inDbLanguage.getId() != id) {
				throw new Exception("Bu id ile ilgili bir obje bulunamadı!");
			}
			
			programmingLanguageRepository.delete(inDbLanguage);
		}
		
	}



	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName().isBlank()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}
		
		for (ProgrammingLanguage inDbLanguage : programmingLanguageRepository.getList()) {
			if (inDbLanguage.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimli programlama dili zaten mevcut!");
			}
		}
		
		programmingLanguageRepository.update(programmingLanguage);
		
	}



	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		
		return programmingLanguageRepository.getById(id);
	}

	
}
