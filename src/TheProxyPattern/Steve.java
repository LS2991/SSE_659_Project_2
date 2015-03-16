package TheProxyPattern;

import java.util.Hashtable;


public class Steve implements VideoGameOwner
{

	@Override
	public Hashtable makeGameList() {
		Hashtable cds = new Hashtable();
        cds.put("Pokemon X","http://www.gamestop.com/gs/ravecode/productpageimages/pokemonXY/Xerneas.jpg");
        cds.put("Fire Emblem","http://fireemblem.nintendo.com/downloads/img/wallpapers/FireEmblem_wallpaper_CrossedSwords_800x600.jpg");
        return cds;
	}

}

