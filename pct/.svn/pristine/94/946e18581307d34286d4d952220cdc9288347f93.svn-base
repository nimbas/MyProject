package com.acube.sub.service;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.mapper.co.LogicalDateRepository;
import com.acube.common.pagination.Pagination;
import com.acube.security.service.SecurityService;
import com.acube.sub.domain.Counsel;
import com.acube.sub.domain.CounselInfo;
import com.acube.sub.domain.Order;
import com.acube.sub.repository.CounselRepository;

@Service
@Transactional
public class CounselServiceImpl implements CounselService {
	@Autowired CounselRepository counselRepository;
	@Autowired LogicalDateRepository dateRepository;
	@Autowired private SecurityService securityService;

	@Override
	public JQueryGrid<Counsel> getCounselList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<Counsel>(pagination, counselRepository.getCounselList(searchFilter, pagination));
	}

	@Override
	public int registCounselInfo(Counsel counsel) {
	/*	Date todayDate = dateRepository.getCurrentDate();
		//String nowDate = CmnDateUtils.addDate(0).replaceAll("-", "");
		String nowDate = todayDate.substring(0, 8);
		String dayTime = todayDate.substring(8);
		long time = System.currentTimeMillis(); 
		SimpleDateFormat sdf = new SimpleDateFormat("hhmmss");
		String dayTime = sdf.format(new Date(time));
		counsel.setOperator(securityService.getCurrentUser());
		counsel.setCounselSeqno(counselRepository.getCounselSeqno());
		counsel.setHopeDate(counsel.getHopeDate().replaceAll("-", ""));
		counsel.setHopeTime(counsel.getHopeTime()== null ? dayTime : counsel.getHopeTime());
		counsel.setRsvDate8(counsel.getHopeDate());
		counsel.setRsvTime(counsel.getHopeTime()== null ? dayTime : counsel.getHopeTime());
		counsel.setApplicationId("csCccs000");
		
		if ( StringUtils.isEmpty(counsel.getCounselTel())){
			String counselTel = counselRepository.getCounselTelByCustNo(counsel.getCustNo());
			if ( StringUtils.isNotEmpty(counselTel)){
				counsel.setCounselTel(counselTel);
			}
		}
		
		
		if("C".equals(counsel.getCounselStatus())){
			counsel.setCounselEndDate8(nowDate);
			counsel.setCounselEndTime(dayTime);
		}
		
		if ( counsel.getCounselId()== null || "".equals(counsel.getCounselId()) ){
			counsel.setCounselId(counselRepository.getCounselId());
			
			if (counsel.getOffers().size() > 0 ){
				for ( CrmOffer crmOffer :  counsel.getOffers()){
					crmOffer.setCounselId(counsel.getCounselId());
					for(RewardId rewardId : crmOffer.getRewardId()){
						rewardId.setCrmOffer(crmOffer);
						entranceRepository.addCrmOffer(rewardId);	
					}
				}
			}
			//가입번호 있을 시 맵핑 테이블에 인서트
			if ( counsel.getEntrNo()!=null && !"".equals(counsel.getEntrNo())){
				
				Order order = new Order();
				CounselInfo counselInfo = new CounselInfo();
				order.setEntrNo(counsel.getEntrNo());
				counselInfo.setCounselId(counsel.getCounselId());
				counselInfo.setActMode(counsel.getActMode());
				counselInfo.setEntrNo(counsel.getEntrNo());
				if( counselRepository.checkExistCounsel(counselInfo)> 0){
					throw new AcubeException("err.000011","err.000011");
				}
				
				order.setCounselInfo(counselInfo);
				if ( !("NAC".equals(counsel.getActMode()) || "NAA".equals(counsel.getActMode()))){
					counselRepository.addAbCcmEntrCounsel(order);
				}
				
				//가입번호 있는 상담등록시 설치주소도 insert
				String estbAddrNo = counselRepository.getEstbAddrNoByEntrNo(counsel.getEntrNo());
				
				if ( !StringUtils.isEmpty(estbAddrNo) ){
					CounselInfo counselInfo2 = counselRepository.getAddressByEstbAddrNo(estbAddrNo);
					counsel.setAddNum(counselInfo2.getAddNum());
					counsel.setCustVilgAbvAddr(counselInfo2.getCustVilgAbvAddr());
					counsel.setCustVilgBlwAddr(counselInfo2.getCustVilgBlwAddr());
					counsel.setDoorCode(counselInfo2.getDoorCode());
					if ( !"CIL".equals(counsel.getActMode()) ){
						counsel.setMduIp(counselInfo2.getMduIp());
						counsel.setMduPort(counselInfo2.getMduPort());
					}
				}
			}
			
			//상담등록
			counselRepository.addCounselInfo(counsel);
			//가개통 맵핑 테이블 인서트
			counselRepository.addCounselCustInfo(counsel);
			
			//고객 최소 정보로 고객 table insert
			if ( StringUtils.isEmpty(counsel.getCustNo())){
				//todo
				Customer customer = new Customer();
				
				customer.setCustName(counsel.getCounselName());
				customer.setCustName1(counsel.getCounselName2());
				customer.setCustName2(counsel.getCounselName3());
				customer.setCustDvCode(counsel.getCustType());
				
				if ( "1".equals(customer.getCustDvCode())){
					//개인 counsel에는 custKindCode가 없으므로 일단 강제 세팅
					customer.setCustKindCode("11");
				}else{
					//기업
					customer.setCustKindCode("21");
				}
				customer.setOperator(securityService.getCurrentMember());
				customer.setApplicationId("csCccs000");
				customer.setMarketCode(customer.getOperator().getBranch().getMarketCode());
				customer.setPhoneNo(counsel.getCounselTel());
				//고객등록
				customerRepository.addCustomer(customer);
				
				
				if ( !StringUtils.isEmpty(counsel.getAddNum())){
					//설치주소로 고객주소등록
					CsAddress csAddress = new CsAddress();
					csAddress.setCustomer(customer);
					//설치주소로 고객주소 등록 하므로 강제로 general로 세팅
					csAddress.setAddrDvCode("1");
					csAddress.setAddrNum(counsel.getAddNum());
					csAddress.setVilageAboveAddr(counsel.getCustVilgAbvAddr());
					csAddress.setVilageBelowAddr(counsel.getCustVilgBlwAddr());
					csAddress.setDoorCode(counsel.getDoorCode());
					csAddress.setFullAddress(counsel.getCustVilgAbvAddr() +" "+counsel.getCustVilgBlwAddr());
					csAddress.setOperator(securityService.getCurrentMember());
					csAddress.setApplicationId("csCccs000");
					
					//baseAddress true로 강제세팅
					csAddress.setBaseAddr(true);
					
					csAddressRepository.addCsAddress(csAddress);
				
				}
				
				counsel.setCustNo(customer.getCustNo());
				//고객번호 업데이트
				counselRepository.updateCustNo(counsel);
				
				
			}
			
			
			 * 테이블 변경으로 아래 로직 필요 없음 가입쪽에서 호출 할 때 ORDER 넣으면 됨.
			if ( counsel.getCustNo()!=null && !"".equals(counsel.getCustNo())){
				counsel.setOrderNum(counselRepository.getOrderNum());
				counselRepository.addOrder(counsel);
			}
		}else{
			counselRepository.modifyCounselInfo(counsel);
			
			if (counsel.getOffers().size() > 0 ){
				entranceRepository.deleteCrmOfferByCounselId(counsel.getCounselId());
				
				for ( CrmOffer crmOffer :  counsel.getOffers()){
					crmOffer.setCounselId(counsel.getCounselId());
					for(RewardId rewardId : crmOffer.getRewardId()){
						rewardId.setCrmOffer(crmOffer);
						entranceRepository.addCrmOffer(rewardId);	
					}
				}
			}
			
			counselRepository.modifyCounselCustInfo(counsel);
		}
		counselRepository.addCounselInfoHist(counsel);*/
		return 0;
	}

}
