package TheProxyPattern;

import java.util.Hashtable;


public class Joe implements VideoGameOwner
{

	@Override
	public Hashtable makeGameList() {
		Hashtable cds = new Hashtable();
        cds.put("Resident Evil 6","http://hqwalls.org/wallpapers/resident_evil_6_wallpaper_2-800x600.jpg");
        cds.put("The Last of Us","http://wallpaper.pickywallpapers.com/800x600/the-last-of-us-main-art.jpg");
        cds.put("COD Ghosts","http://killstreakmedia.com/wp-content/uploads/2013/09/Call-of-Duty-Ghosts-es-oficial-aqu%C3%AD-su-tr%C3%A1iler-2-800x443.jpg");
        return cds;
	}

}
