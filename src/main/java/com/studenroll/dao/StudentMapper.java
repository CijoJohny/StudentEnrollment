package com.studenroll.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

@Mapper
@Transactional
public interface StudentMapper {
	
	int getStudentId(String studentName);
	
	List<Integer> getCourseIdByName(List<String> courseName);
	
	Student getStudentDetails(String studentId);
	
	int insertStudent(Student studentEnrollDao);
	
	int insertCourse(List<Course> course);
	
	int deleteStudentInfo(@Param("studentId") int studentId);
	
	int deleteEnrollmentInfo(@Param("studentId") int studentId);
	
	List<String> getStudentInfoByCourseName(@Param("courseName")  String courseName);
	List<String> getUnenrolledStudnetList();
	
	int updateMarkForCourse(@Param("courseName")  String courseName,@Param("studentName") String studentName,@Param("score")  int score);
	
	int insertEnrollment(@Param("studentId") int studentId,@Param("courseIdList")  List<Integer> courseIdList);
	  
	StudEnrollment getStudentEnrolmentDetails(@Param("studentName") String studentName);
	  
	

}
