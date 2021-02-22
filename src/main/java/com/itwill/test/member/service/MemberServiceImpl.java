package com.itwill.test.member.service;

import com.itwill.test.member.Member;
import com.itwill.test.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberMapper;

  @Override
  public List<Member> findAll() {
    return memberMapper.findAll();
  }
}
