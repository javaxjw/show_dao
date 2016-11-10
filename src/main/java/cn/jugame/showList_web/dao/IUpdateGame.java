package cn.jugame.showList_web.dao;

import cn.jugame.showList_web.bean.Game;

/**
 * 
 * 更新游戏的接口
 * @author KayWen
 *
 */
public interface IUpdateGame {
	
	/**增加游戏
	 * @return
	 */
	int increatGame(Game game);
	
	/**
	 * 删除游戏
	 * @param game
	 * @return
	 */
	int deleteGame(Game game);
	
	/**
	 * 更改游戏名称
	 * 
	 * @param game
	 * @param gameName
	 * @return
	 */
	int updateGameName(Game game, String gameName);
}
