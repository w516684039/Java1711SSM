package com.situ.ssm.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {

	void decreaseMoney(@Param("accountId")Integer fromAccountId, @Param("money")Integer money);

	void increaseMoney(@Param("accountId")Integer toAccountId, @Param("money")Integer money);
	
}
