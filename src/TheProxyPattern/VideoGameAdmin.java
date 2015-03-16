package TheProxyPattern;

import java.util.Hashtable;
import java.util.Scanner;


public class VideoGameAdmin implements VideoGameOwner
{
	public Hashtable makeGameList() 
	{
		Hashtable cds = new Hashtable();
		cds.put("Zelda Skyward Sword","http://stylefavor.com/wp-content/uploads/2012/10/Skyward_Sword_wallpaper_by_arkazain-800x600.jpg");
        cds.put("Resident Evil 6","http://hqwalls.org/wallpapers/resident_evil_6_wallpaper_2-800x600.jpg");
        cds.put("The Last of Us","http://wallpaper.pickywallpapers.com/800x600/the-last-of-us-main-art.jpg");
        cds.put("Pokemon X","http://www.gamestop.com/gs/ravecode/productpageimages/pokemonXY/Xerneas.jpg");
        cds.put("Fire Emblem","http://fireemblem.nintendo.com/downloads/img/wallpapers/FireEmblem_wallpaper_CrossedSwords_800x600.jpg");
        cds.put("Kingdom Hearts 1.5","http://images.khinsider.com/KINGDOM%20HEARTS%20HD%20ReMIX/Wallpapers/PC/800x600.jpg");
        cds.put("COD Ghosts","http://killstreakmedia.com/wp-content/uploads/2013/09/Call-of-Duty-Ghosts-es-oficial-aqu%C3%AD-su-tr%C3%A1iler-2-800x443.jpg");
        return cds;
	}
	public void addGame(Hashtable list) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Game's name");
		String name = in.nextLine();
		System.out.println("Enter Image URL");
		String URL = in.nextLine();
		list.put(name,URL);
		in.close();
	}
	public void removeGame(Hashtable list) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Game's name");
		String name = in.nextLine();
		list.remove(name);
		in.close();
	}
}

