package cs425.studentsMgmt.control;

import cs425.studentsMgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students/list")
	public ModelAndView getStudents() {
		ModelAndView model=new ModelAndView();
		model.addObject("students",studentService.getAllStudents());
		model.setViewName("student/list");
		return model;
	}
	
	
	
	

}
