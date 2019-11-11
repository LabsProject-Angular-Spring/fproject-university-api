package labsproject.api.service;

import labsproject.api.entity.Lab;

public interface ILabService {
	public Iterable<Lab> getAllList();
	public Lab getById(Long id);
	public Lab Insert(Lab lab);
	public Lab Update(Lab lab, Long id);
}
