package com.kosa.scheduleManagement.global.dao;

import java.util.List;
import java.util.Map;

import com.kosa.scheduleManagement.global.dto.Project;
import com.kosa.scheduleManagement.global.dto.Project_Sub;

public interface ProjectDao {
	//전체 프로젝트
	List<Project> getAllProjectList();	
	
	//로그인한 사원의 프로젝트 리스트
	List<Project> getProjectList(int deptno);
	
	//프로젝트 생성
	int insertProject(Project project);
	
	//프로젝트 삭제
	int deleteProject(int project_num);
	
	//프로젝트 디테일
	Project projectDetail(int project_num);
	
	//시퀀스
	int getSeq();
	
	//프로젝트 이름
	List<Map<String, Object>> getprojectList(int user_id);
	
	List<Map<String, Object>> getprojectList_Admin(int deptno);
}