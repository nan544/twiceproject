
package com.spring.admin.member.dao;

import java.util.*;

import com.spring.client.member.vo.MemberVO;

public interface AdminMemberDao {
	public List<MemberVO> memberList(MemberVO mvo);

	public Map<String, Integer> memberAgeList();

	public Map<String, Integer> memberGenderList();
}
