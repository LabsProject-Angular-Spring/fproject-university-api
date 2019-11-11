package labsproject.api.service;

import labsproject.api.entity.Building;

public interface IBuildingService {
	public Iterable<Building> getAllList();
	public Building getById(Long id);
	public Building Insert(Building building);
	public Building Update(Building building, Long id);
}
