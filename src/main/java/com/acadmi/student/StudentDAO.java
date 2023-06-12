package com.acadmi.student;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.acadmi.board.BoardVO;
import com.acadmi.board.notice.NoticeVO;
import com.acadmi.lecture.LectureVO;
import com.acadmi.student.lecture.StudentLectureVO;
import com.acadmi.syllabus.ClassVO;
import com.acadmi.util.Pagination;

@Mapper
public interface StudentDAO {
	
	//현재 수강중인 강의
	public List<LectureVO> getCurrentLectureList() throws Exception;
	
	//내 수강 강좌
	public List<LectureVO> getMyLectureList(LectureVO lectureVO) throws Exception;
	public List<LectureVO> getMyCreditList(LectureVO lectureVO) throws Exception;
	
	//입학년도~재학년도
	public Integer getMaxYear(LectureVO lectureVO) throws Exception;
	public Integer getMinYear(LectureVO lectureVO) throws Exception;
	
	//메인페이지 공지사항
	 public List<BoardVO> getNoticeList() throws Exception; 
	 
	//강의 메인페이지
	 public LectureVO getLectureProfessor(LectureVO lectureVO) throws Exception; 
	 public List<ClassVO> getSyllabusClass(LectureVO lectureVO) throws Exception;
	 
	//강의 참여자 목록
	public List<LectureVO> getAttendeeList(Pagination pagination) throws Exception; 
}
