package TemplatePattern;

public class GameStore {

	public static void main(String[] args){
		
		Game3DS dsgame = new Game3DS();
		dsgame.makeGamePackage();
		
		GamePS3 psgame = new GamePS3();
		psgame.makeGamePackage();
		
		GamePS3SP psSPgame = new GamePS3SP();
		psSPgame.makeGamePackage();
		
		GameGBAdv gbadvgame = new GameGBAdv();
		gbadvgame.makeGamePackage();
		
		GameXbox xbgame = new GameXbox();
		xbgame.makeGamePackage();
		
		GameXboxSP xbSPgame = new GameXboxSP();
		xbSPgame.makeGamePackage();
		
		GameWii wiigame = new GameWii();
		wiigame.makeGamePackage();
		
		GameWiiUsed uWiigame = new GameWiiUsed();
		uWiigame.makeGamePackage();
		
	}

}
