package labsproject.api.service;

import labsproject.api.entity.Faculty;

public interface IFacultyService {
	public Iterable<Faculty> getAllList();
	public Faculty getById(Long id);
	public Faculty Insert(Faculty faculty);
	public Faculty Update(Faculty faculty, Long id);
}
