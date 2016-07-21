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

import com.acube.common.domain.BaseDomain;
import com.acube.security.domain.DealerMaster;

/**
 * @author kangyou,choi
 */
public interface DealerService {

	DealerMaster getDealerMaster(DealerMaster dealerMaster);

	void addDealerMaster(DealerMaster dealer);

	void updateDealerMaster(DealerMaster dealer);

	void deleteDealerMaster(DealerMaster dealer);

	void deleteDealerMasters(BaseDomain base, List<DealerMaster> dealerMasters);

	void moveDealerMaster(DealerMaster dealer);

}
