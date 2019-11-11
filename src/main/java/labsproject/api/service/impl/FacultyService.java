package labsproject.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labsproject.api.entity.Faculty;
import labsproject.api.repository.IFacultyRepository;
import labsproject.api.service.IFacultyService;


@Service
public class FacultyService implements IFacultyService{

	@Autowired
	private IFacultyRepository facultyRepository;
	
	@Override
	public Iterable<Faculty> getAllList() {
		return facultyRepository.findAll();
	}

	@Override
	public Faculty getById(Long id) {
		return facultyRepository.findById(id).get();
	}
	
	@Override
	public Faculty Insert(Faculty faculty) {		
		return facultyRepository.save(faculty);
	}
	
	@Override
	public Faculty Update(Faculty faculty, Long id) {		
		faculty.setId(id);
		return facultyRepository.save(faculty);
	}
	
}
