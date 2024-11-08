package  com.example.demo.class_Master_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.class_Master_Entity.class_Master_Ent;
import com.example.demo.class_Master_Services.class_Master_Services;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/classes")
public class class_Master_Controller {

    @Autowired
    private class_Master_Services classMasterService;

    // POST: Add a new ClassMaster
    @PostMapping("/add")
    public ResponseEntity<String> addClass(@RequestBody class_Master_Ent classMasterEntity) {
        classMasterService.saveClass(classMasterEntity);
        return new ResponseEntity<>("Class data saved successfully", HttpStatus.CREATED);
    }

    // GET: Get all classes
    @GetMapping("/all")
    public ResponseEntity<List<class_Master_Ent>> getAllClasses() {
        List<class_Master_Ent> classes = classMasterService.getAllClasses();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    // GET: Get a class by its ID
    @GetMapping("/{id}")
    public ResponseEntity<class_Master_Ent> getClassById(@PathVariable int id) {
        Optional<class_Master_Ent> classMasterEntity = classMasterService.getClassById(id);
        return classMasterEntity.map(entity -> new ResponseEntity<>(entity, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // DELETE: Delete a class by its ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClass(@PathVariable int id) {
        classMasterService.deleteClass(id);
        return new ResponseEntity<>("Class deleted successfully", HttpStatus.OK);
    }
}
