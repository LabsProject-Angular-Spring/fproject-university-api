package labsproject.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import labsproject.api.entity.Building;
import labsproject.api.repository.IBuildingRepository;
import labsproject.api.service.IBuildingService;

@Service
public class BuildingService implements IBuildingService{

	@Autowired
	private IBuildingRepository buildingRepository;
	
	@Override
	public Iterable<Building> getAllList() {
		return buildingRepository.findAll();
	}

	@Override
	public Building getById(Long id) {
		return buildingRepository.findById(id).get();
	}
	
	@Override
	public Building Insert(Building building) {		
		return buildingRepository.save(building);
	}
	
	@Override
	public Building Update(Building building, Long id) {		
		building.setId(id);
		return buildingRepository.save(building);
	}
	
}
