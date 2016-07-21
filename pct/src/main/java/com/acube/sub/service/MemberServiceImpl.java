package com.acube.sub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.sub.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired MemberRepository memberRepository;

	@Override
	public String getMarketCode(String userId) {
		// TODO Auto-generated method stub
		return memberRepository.getMarketCode(userId);
	}

}
