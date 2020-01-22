package com.java.springbootstarter.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springbootstarter.model.StudentEntity;
import com.java.springbootstarter.repository.StudentRepository;
import com.java.springbootstarter.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void save(StudentEntity student) {
		studentRepository.save(student);
		
	}

	@Override
	public StudentEntity findById(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}
	
	

	@Override
	public List<StudentEntity> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void update(long id, StudentEntity studentEntity) {
		studentRepository.delete(findById(id));
		studentEntity.setId(id);
		save(studentEntity);
		
	}
	

}
