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
import labsproject.api.entity.Lab;
import labsproject.api.service.ILabService;


@RestController
@RequestMapping(path="/lab")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

public class LabController {
	
	@Autowired
	private ILabService labService;
	
	@GetMapping("/list")
	public Iterable<Lab> getList(){
		return labService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Lab getById(@PathVariable Long id) {
		return labService.getById(id);
	}
	
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json) {
		try {
			Lab lab = new Lab();
			lab.setName(json.get("name").toString());
			lab.setBuildingId(Long.parseLong(json.get("buildingid").toString()));
			labService.Insert(lab);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable Long id) {
		try {
			Lab lab = new Lab();
			lab.setName(json.get("name").toString());
			lab.setBuildingId(Long.parseLong(json.get("buildingid").toString()));
			labService.Update(lab,id);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	
}
