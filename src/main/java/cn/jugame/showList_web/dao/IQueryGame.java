package cn.jugame.showList_web.dao;

import java.util.List;

/**
 * 游戏查询的父接口
 * @author KayWen
 *
 */
public interface IQueryGame {
	
	/**
	 * 查询游戏列表
	 * @return
	 */
	 List<?> queryGameList();
	 
	 /**
	  * 查询所有游戏的总数
	  * @return
	  */
	 int queryGameCount();
}
