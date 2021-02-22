package com.itwill.test.member.repository;


import com.itwill.test.member.Member;

import java.util.List;

public interface MemberRepository {
  List<Member> findAll();
}
