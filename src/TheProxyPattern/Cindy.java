package TheProxyPattern;

import java.util.Hashtable;


public class Cindy implements VideoGameOwner
{

	@Override
	public Hashtable makeGameList() {
		Hashtable cds = new Hashtable();
		cds.put("Zelda Skyward Sword","http://stylefavor.com/wp-content/uploads/2012/10/Skyward_Sword_wallpaper_by_arkazain-800x600.jpg");
        cds.put("Kingdom Hearts 1.5","http://images.khinsider.com/KINGDOM%20HEARTS%20HD%20ReMIX/Wallpapers/PC/800x600.jpg");
		return cds;
	}

}
