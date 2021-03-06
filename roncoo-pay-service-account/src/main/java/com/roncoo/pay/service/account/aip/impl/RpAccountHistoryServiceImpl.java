/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.aip.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.account.api.RpAccountHistoryService;
import com.roncoo.pay.service.account.dao.RpAccountHistoryDao;
import com.roncoo.pay.service.account.entity.RpAccountHistory;

/**
 * @类功能说明： 账户历史service实现类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
@Service("rpAccountHistoryService")
public class RpAccountHistoryServiceImpl implements RpAccountHistoryService{

	@Autowired
	private RpAccountHistoryDao rpAccountHistoryDao;
	
	@Override
	public void saveData(RpAccountHistory rpAccountHistory) {
		rpAccountHistoryDao.insert(rpAccountHistory);
	}

	@Override
	public void updateData(RpAccountHistory rpAccountHistory) {
		rpAccountHistoryDao.update(rpAccountHistory);
	}

	@Override
	public RpAccountHistory getDataById(String id) {
		return rpAccountHistoryDao.getById(id);
	}

	@Override
	public PageBean listPage(PageParam pageParam, RpAccountHistory rpAccountHistory) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		return rpAccountHistoryDao.listPage(pageParam, paramMap);
	}
}