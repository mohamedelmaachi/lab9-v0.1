package cs425.studentsMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs425.studentsMgmt.model.Student;
import cs425.studentsMgmt.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Iterable<Student> getAllStudents(){
		return studentRepository.findAll();
	}

}
