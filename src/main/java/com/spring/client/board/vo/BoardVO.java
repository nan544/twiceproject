package com.spring.client.board.vo;

import org.springframework.web.multipart.MultipartFile;
import com.spring.common.vo.CommonVO;

public class BoardVO extends CommonVO {
	private int		b_num		=0;		//글번호
	private String	b_name		="";	//작성자
	private String	b_title		="";	//제목
	private String 	b_content	="";	//내용
	private String	b_date		="";	//작성일
	private String	b_pwd		="";	//비밀번호
	
	// 파일 업로드를 위한 속성
	private MultipartFile file;	//첨부파일
	private String b_file="";	//실제서버에 저장한 파일명
	
	//Getters And Setters 새로 생성
}
