/*
 * ====
 * 陈德元：



 * ====
 */
package org.mengyun.tcctransaction.sample.dubbo.capital.api;

import org.mengyun.tcctransaction.sample.dubbo.capital.api.dto.CapitalTradeOrderDto;
import org.mengyun.tcctransaction.api.TransactionContext;

/**
 * Created by  on 4/1/16.
 */
public interface CapitalTradeOrderService {

	/**
	 * 创建资金帐户变更记录.
	 * 
	 * @param transactionContext
	 * @param tradeOrderDto
	 */
    public String record(TransactionContext transactionContext,CapitalTradeOrderDto tradeOrderDto);
    
}
