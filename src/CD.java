import acm.graphics.*;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Font;
import java.applet.AudioClip;

public class CD extends GCompound
{
	private int radius;
	private Color color;
	private String title;
	private AudioClip song;
	private static final int PADDING = 20;
	
	public CD (int x, int y, int radius, Color color, String title, AudioClip song)
	{
		setLocation(x, y);
		this.radius = radius;
		this.color = color;
		this.title = title;
		this.song = song;
		
		//create an oval
		GOval outercircle = new GOval(0, 0, radius * 2, radius * 2);
		outercircle.setFilled(true);
		outercircle.setFillColor(color);
		
		//add it
		add(outercircle);
		
		//make the hole
		int holeRadius = radius/4;
		GOval innercircle = new GOval(radius - holeRadius, radius - holeRadius, holeRadius * 2, holeRadius*2);
		innercircle.setFilled(true);
		innercircle.setFillColor(Color.WHITE);
		add(innercircle);
		
		//make the label
		GLabel cdlabel = new GLabel(title, 0, radius * 2 + PADDING);
		cdlabel.setColor(Color.blue);
	    /*FontMetrics fz = getFontMetrics(getFont());
	    int messageLength = fz.stringWidth(title);
	    int messageHeight = fz.getHeight();
	    cdlabel = new GLabel(title, radius*2 - messageLength/2, radius*2 - messageHeight/2);
	    cdlabel.setColor(Color.BLACK);
		*/
		add(cdlabel);
	}

	public void playSong()
	{
		song.play();
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AudioClip getSong() {
		return song;
	}

	public void setSong(AudioClip song) {
		this.song = song;
	}

}
