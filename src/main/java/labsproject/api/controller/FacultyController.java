package labsproject.api.controller;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import labsproject.api.entity.Faculty;
import labsproject.api.service.IFacultyService;

@RestController
@RequestMapping(path="/faculty")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

public class FacultyController {
	
	@Autowired
	private IFacultyService facultyService;
	
	@GetMapping("/list")
	public Iterable<Faculty> getList(){
		return facultyService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Faculty getById(@PathVariable Long id) {
		return facultyService.getById(id);
	}
	
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json) {
		try {
			Faculty faculty = new Faculty();
			faculty.setName(json.get("name").toString());
			facultyService.Insert(faculty);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable Long id) {
		try {
			Faculty faculty = new Faculty();
			faculty.setName(json.get("name").toString());
			facultyService.Update(faculty,id);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	
	
}
