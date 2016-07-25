package com.acube.security.mapper;

import com.acube.security.domain.DealerMaster;

public interface DealerRepository {

	DealerMaster getDealerMaster(DealerMaster dealerMaster);

	int addDealerMaster(DealerMaster dealer);

	int updateDealerMaster(DealerMaster dealer);

	int deleteDealerMaster(DealerMaster dealer);

	int moveUserByDealer(DealerMaster dealer);

}