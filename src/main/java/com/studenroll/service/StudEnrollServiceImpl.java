package com.studenroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studenroll.dao.Course;
import com.studenroll.dao.StudEnrollment;
import com.studenroll.dao.Student;
import com.studenroll.dao.StudentMapper;

@Component
public class StudEnrollServiceImpl implements StudEnrollService {

	@Autowired
	StudentMapper studentMapper;

	@Override
	public String getStudentList(String studentId) {
		int i=0;

		Student dao = new Student();
		dao.setContactName("Thalackal");
		dao.setStudentName("Tiger");
		int count = studentMapper.insertStudent(dao);
		
		System.out.println("Id of the new student" + dao.getStudentId());
		List<Course> courseList = new ArrayList<>();
		Course course = new Course();
		course.setCourseName("Science");
		course.setCourseDescription("Science is good");
		course.setStatus("Active");
		courseList.add(course);
		Course course2 = new Course();
		course2.setCourseName("English");
		course2.setCourseDescription("English is good");
		course2.setStatus("Active");
		courseList.add(course2);
		studentMapper.insertCourse(courseList);
		//int stud = studentMapper.getStudentId("cijo");
		//System.out.println("stud" + stud);
		 studentMapper.deleteEnrollmentInfo(1002);
         studentMapper.deleteStudentInfo(1002);
    
		if (count > 0) {
			List<String> subjectList = new ArrayList<>();
			subjectList.add("Maths");
			subjectList.add("English");
			List<Integer> courseLis = studentMapper.getCourseIdByName(subjectList);
			if (!courseLis.isEmpty())
			   studentMapper.insertEnrollment(dao.getStudentId(), studentMapper.getCourseIdByName(subjectList));
		}
		 
		int update1 =studentMapper.updateMarkForCourse("English", "Tiger", 40);
		System.out.println("catch"+update1);
		List<String> output = studentMapper.getStudentInfoByCourseName("English");
		System.out.println(output.toString());
		
		List<String> outpu  = studentMapper.getUnenrolledStudnetList();
		System.out.println(outpu.toString());

		//Student dao1 = studentMapper.getStudentDetails(studentId);
		// System.out.println("stud" +dao1.getStudentName());
		// System.out.println("stud" +dao1.getStudentId());
		StudEnrollment stEnrol = studentMapper.getStudentEnrolmentDetails("Tiger" +i);
		System.err.println(stEnrol);
		
		  
		return null;
	}

}
