package TheProxyPattern;

import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class VirtualProxyTest {
	VideoGameCovers imageComponent;
	JFrame frame = new JFrame("VG Art Viewer");
    JMenuBar menuBar;
    JMenu menu1,menu2;
	Hashtable cds = new Hashtable();
	static Hashtable Users = new Hashtable();
 
	public static void main (String[] args) throws Exception {
		VideoGameOwner Admin = new VideoGameAdmin();
		VideoGameOwner Joe = new Joe();
		VideoGameOwner Steve = new Steve();
		VideoGameOwner Cindy = new Cindy();
		
		Users.put("Admin",Admin);
		Users.put("Joe",Joe);
		Users.put("Steve",Steve);
		Users.put("Cindy",Cindy);
		
	
	VirtualProxyTest VideoGameCovers = new VirtualProxyTest();
	}
 
	public VirtualProxyTest() throws Exception{
		
		URL initialURL = new URL("http://stylefavor.com/wp-content/uploads/2012/10/Skyward_Sword_wallpaper_by_arkazain-800x600.jpg");
		menuBar = new JMenuBar();
		menu1 = new JMenu("Owners");
		menu2 = new JMenu("Owned Video Games");
        menuBar.add(menu1);
        menuBar.add(menu2);
        frame.setJMenuBar(menuBar);
        
		for(Enumeration e = Users.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
        	JMenuItem menuItem = new JMenuItem(name);
        	menu1.add(menuItem); 
        	menuItem.addActionListener(new ActionListener() {
          		  public void actionPerformed(ActionEvent event) {
           		    setownedlist(event.getActionCommand());
           		    menu2.removeAll();
           			for(Enumeration e = cds.keys(); e.hasMoreElements();) {
           				String name = (String)e.nextElement();
           	        	JMenuItem menuItem = new JMenuItem(name);
           	        	menu2.add(menuItem); 
           	        	menuItem.addActionListener(new ActionListener() {
           	          		  public void actionPerformed(ActionEvent event) {
           	           		     imageComponent.setIcon(new VirtualProxy(getCDUrl(event.getActionCommand())));
           						frame.repaint();
           	           	      }
           	        	});
           			}
           	      }
        	});
		}
 		
		// set up frame and menus
 
		Icon icon = new VirtualProxy(initialURL);
		imageComponent = new VideoGameCovers(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL((String)cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
	void setownedlist(String name) 
	{
			cds = ((VideoGameOwner)Users.get(name)).makeGameList();
	}
}
