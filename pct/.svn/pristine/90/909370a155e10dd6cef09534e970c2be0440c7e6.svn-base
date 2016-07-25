package com.acube.security.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.security.domain.DealerMaster;
import com.acube.security.domain.Elements;
import com.acube.security.domain.User;

public interface UserRepository {

	int addUser(User user);

	int updateUser(User user);

	int deleteUser(User user);

	int deleteUserByDealer(DealerMaster dealerMaster);

	int moveUser(User user);

	User getUserByUserId(@Param("userId") String userId);

	User getUserByLoginId(User user);

	List<User> getUsersByDealer(@Param("dlrCd") String dlrCd);

	List<String> getProfileIdByUserId(@Param("userId") String userId);

	List<Elements> getElementsListByUserId(HashMap<String, String> map);

	List<User> getAvailableIp(User user);

	int usedIpAddress(User user);

	int updateAssignableIpAddress(User user);

	int getCheckLoginID(User user);
}