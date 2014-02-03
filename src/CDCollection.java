import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;
import acm.graphics.*;


public class CDCollection extends GraphicsProgram
{
	public void run()
	{
		//create a new cd, pass in null for the audio clip
		
		AudioClip clip1 = getAudioClip(getDocumentBase(), "music/bugsbunny.wav");
		CD cd = new CD(10, 20, 50, Color.RED, "I Love Your Hair", clip1);
		//add it to the canvas
		add(cd);
		
		AudioClip clip1 = getAudioClip(getDocumentBase(), "music/woody.wav");
		CD cd2 = new CD(150, 20, 50, Color.BLUE, "Woody", clip1);
		//add it to the canvas
		add(cd);
		
		//add mouse listeners, create mouse clicked method
		
		addMouseListeners();
		//then get the object that was clicked
		//cast it as a CD'
		//then call play song
		
		//cd.playSong();		
	}
	
	public void mouseClicked(MouseEvent e)
	{
		GObject maybeCD = getElementAt(e.getX(), e.getY());
		
		if(maybeCD == null) return;
		
		((CD)maybeCD).playSong();
	}
}
