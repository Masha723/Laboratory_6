
import java.util.Scanner;
/** The purpose of this class is to model a television 
 * 
 *  @author Mariia Leskovets  and 04.24.2024 
 */ 
public class Television
{
	/** an instance constant MANUFATURER, which represents the company title which produced TV*/ 
	private final String MANUFATURER;
	/** an instance constant SCREEN_SIZE, which represents screen size*/ 
	private final int SCREEN_SIZE;
	/** an instance field powerOn, which indicates if the TV is whether the TV is on or not*/ 
	private boolean powerOn;
	/**an instance field channel the channel number which is currently transmitted*/ 
	private int channel;
	/** an instance field volume, which indicates the current number of the TV's volume*/ 
	private int volume;
	
	
	/**
	 * 
	 * method return the current channel
	 * @return returns the current channel
	 */
	public int getChannel() {
		return this.channel;
	}
	/**
	 * method sets the channel field to the received value
	 * @param channel receives the channel № number
	 * 
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	/**
	 * 
	 * method  returns current value of volume field
	 * @return returns current value of volume field
	 */
	
	public int getVolume(){
		return this.volume;
	}
	/**
	 * 
	 * method returns constant of Manufacturer title
	 * @return returns constant of Manufacturer title
	 */
	public String getManufacturer() {
		return MANUFATURER;
	}
	
	/**
	 * 
	 * method returns an instance constant SCREEN_SIZE
	 * @return return an instance constant SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	/**
	 * 
	 * method switches the powerOn field from true to false and VS
	 */
	public void decreaseVolume() {
		this.volume--;
	}
	/**
	 * 
	 * method switches the powerOn field from true to false and VS
	 */
	public void increaseVolume() {
		this.volume++;
	}
	/**
	 * 
	 * method switches the powerOn field from true to false and VS
	 */
	public void power() {
		 if (this.powerOn==true) {
			 this.powerOn=false;
		 }
		 else {
			 this.powerOn=true;
		 }
	 }
	/**
	 *  it's parameterized constructor
	 * @param MANUFATURER an instance constant the television MANUFATURER company
	 * @param SCREEN_SIZE an instance constant SCREEN_SIZE screen size
	 */
	public Television(String MANUFATURER, int SCREEN_SIZE ) {
		this.MANUFATURER=MANUFATURER;
		this.SCREEN_SIZE=SCREEN_SIZE;
		this.volume=20;
		this.channel=2;
		this.powerOn=false;
		
	}
}