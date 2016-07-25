/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.service.co;

import java.util.Date;




/**
 *
 * @author YangByeongSub
 * @since
 *
 */

public interface LogicalDateService {
	public Date getCurrentDate();
	public String getCurrentDateFormat();
	public String getCurrentDateFormat(String pattern);
}
