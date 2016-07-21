/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acube.security.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.BaseDomain;
import com.acube.security.domain.DealerMaster;
import com.acube.security.domain.OrgLayer;
import com.acube.security.mapper.DealerRepository;
import com.acube.security.mapper.OrgRepository;
import com.acube.security.mapper.UserRepository;

@Service
@Transactional
public class DealerServiceImpl implements DealerService {

	private static final Logger logger = LoggerFactory.getLogger(DealerServiceImpl.class);

	@Autowired
	private DealerRepository dealerRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	OrgRepository orgRepository ;

	@Override
	public DealerMaster getDealerMaster(DealerMaster dealerMaster) {
		return dealerRepository.getDealerMaster(dealerMaster);
	}

	@Override
	public void addDealerMaster(DealerMaster dealer) {
		dealerRepository.addDealerMaster(dealer);
	}

	@Override
	public void updateDealerMaster(DealerMaster dealer) {
		dealerRepository.updateDealerMaster(dealer);
	}
	
	@Override
	public void moveDealerMaster(DealerMaster dealer) {
		dealerRepository.moveUserByDealer(dealer);//소속사용자들 마켓 변경이 필요함..
		dealerRepository.updateDealerMaster(dealer);
	}

	@Override
	public void deleteDealerMaster(DealerMaster dealer) {
		/*List<User> users = userService.getUsersByDealer(dealer);
		if (users != null && users.size() > 0) {
			throw new AcubeException("sec.dealer.not.delete");
		}*/
		
		//하위 부서에 대한 삭제 처리도 숭행함...
		List<OrgLayer> ol = orgRepository.getOrgnizationList(dealer.getDlrCd());
		for(OrgLayer orgLayer : ol){
			DealerMaster dealerMstr = new DealerMaster();
			dealerMstr.setDlrCd(orgLayer.getDlrCd());
			dealerMstr.setBaseInfo(dealer);
			userService.deleteUser(dealerMstr);
			dealerRepository.deleteDealerMaster(dealerMstr);
		}
	}
	
	@Override
	public void deleteDealerMasters(BaseDomain base, List<DealerMaster> dealers) {
		for(DealerMaster dealerMaster : dealers){
			dealerMaster.setBaseInfo(base);
			deleteDealerMaster(dealerMaster);
		}
	}
}
