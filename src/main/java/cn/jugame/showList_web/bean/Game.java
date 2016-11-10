package cn.jugame.showList_web.bean;

import java.io.Serializable;

public class Game implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7781284381021155199L;
	private String gameId;
	private String gameName;
	private String gameInfo;
	private String gamePic;
	
	public Game() {
		// TODO 自动生成的构造函数存根
	}

	public Game(String gameId, String gameName, String gameInfo, String gamePic) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameInfo = gameInfo;
		this.gamePic = gamePic;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameInfo() {
		return gameInfo;
	}

	public void setGameInfo(String gameInfo) {
		this.gameInfo = gameInfo;
	}

	public String getGamePic() {
		return gamePic;
	}

	public void setGamePic(String gamePic) {
		this.gamePic = gamePic;
	}
	
	
}
