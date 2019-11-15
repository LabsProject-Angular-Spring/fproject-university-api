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
import labsproject.api.entity.Building;
import labsproject.api.service.IBuildingService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})
@RequestMapping(path="/building")
public class BuildingController {
	
	@Autowired
	private IBuildingService buildingService;
	
	@GetMapping("/list")
	public Iterable<Building> getList(){
		return buildingService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Building getById(@PathVariable Long id) {
		return buildingService.getById(id);
	}
	
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json) {
		try {
			Building building = new Building();
			building.setName(json.get("name").toString());
			building.setFacultyId(Long.parseLong(json.get("facultyid").toString()));
			buildingService.Insert(building);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable Long id) {
		try {
			Building building = new Building();
			building.setName(json.get("name").toString());
			building.setFacultyId(Long.parseLong(json.get("facultyid").toString()));
			buildingService.Update(building,id);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	
	
}
