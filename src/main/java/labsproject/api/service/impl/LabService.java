package labsproject.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labsproject.api.entity.Lab;
import labsproject.api.repository.ILabRepository;
import labsproject.api.service.ILabService;

@Service
public class LabService implements ILabService{

	@Autowired
	private ILabRepository labRepository;
	
	@Override
	public Iterable<Lab> getAllList() {
		return labRepository.findAll();
	}

	@Override
	public Lab getById(Long id) {
		return labRepository.findById(id).get();
	}
	
	@Override
	public Lab Insert(Lab lab) {		
		return labRepository.save(lab);
	}
	
	@Override
	public Lab Update(Lab lab, Long id) {		
		lab.setId(id);
		return labRepository.save(lab);
	}
	
}
