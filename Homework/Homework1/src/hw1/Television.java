package hw1;

public class Television {
	
	private int maxChannel;
	private int currentChannel;
	private int previousChannel;
	private int tempPrevChannel;
	
	private double currentVolume;
	
	
	public static final double VOLUME_INCREMENT	= 0.070;
	/*
	 *  The volume is incremented or decremented by the value of the constant
	 */
	
	
	/*
	 * Constructs a new Television with channels 0 through givenChannelMax - 1
	 * Initially the volume is 0.5
	 */
	public Television(int givenChannelMax) {
		currentChannel = 0;
		maxChannel = givenChannelMax - 1;
		currentVolume = 0.5;		
	}

	
	public String display() {
		return "Channel " + currentChannel + " Volume " + currentVolume*100 + "%";
	}
	/*
	 * Returns a string representing the current channel and volume in the form "Channel x Volume y%",
	 * where x is the current channel and y is the volume, multiplied by 100 and rounded to the nearest integer. 
	 * For example, if the channel is 8 and the volume is .765, this method returns the exact string "Channel 8 Volume 77%".
	 */


	public void channelDown() {
		previousChannel = currentChannel;
		if (currentChannel > 0) {
			currentChannel = currentChannel - 1;
		}
		else {
			currentChannel = maxChannel;
		}
	}
	/*
	 * Changes the channel down by 1, wrapping around to channelMax - if the current channel is zero.
	 */
	
	public void channelUp() {
		previousChannel = currentChannel;
		if(currentChannel < maxChannel){
			currentChannel = currentChannel + 1;
		}
		else{
			currentChannel = 0;
		}
	}
	/*
	 * Changes the channel up by 1, wrapping around to zero if the current channel ischannelMax - 1.
	 */
	
	public void goToPreviousChannel() {
		tempPrevChannel = currentChannel;
		currentChannel = previousChannel;
		previousChannel = tempPrevChannel;
	}
	/*
	 * Sets the current channel to the most recent previous channel.
	 * If no channel has ever been set for this Television using one of the methods channelDown, 
	 * channelUp, or setChannel, this method sets the channel is 0.
	 */
	
	public void setChannel(int channelNumber) {
		previousChannel = currentChannel;
		if(channelNumber > 0) {
			if(channelNumber > maxChannel) {
				currentChannel = maxChannel;
			}
			else {
				currentChannel = channelNumber;
			}
		}
		else {
			currentChannel = 0;
		}
	}
	/*
	 * Sets the channel to the given channel number. 
	 * If the given value is greater than channelMax - 1, the channel is set to channelMax - 1. 
	 * If the given value is negative, the channel is set to zero.
	 */
	
	public void resetChannelMax(int givenMax) { 
		maxChannel = 0;
		if(givenMax > 0) {
			maxChannel = givenMax -1;
		}
		else {
			maxChannel = 0;
		}
		if(currentChannel > maxChannel) {
			currentChannel = maxChannel;
		}
	}
	/*
	 * Resets this Television so that its available channels are now from 0 through givenMax - 1. 
	 * If the current channel is greater than givenMax - 1, it is automatically adjusted to be givenMax - 1. 
	 * Likewise, if the previous channel is greater than givenMax - 1, it is automatically adjusted to be givenMax - 1.
	 */
	
	public int getChannel() {
		return currentChannel;
	}
	/*
	 * Returns the current channel.
	 */
	
	
	public double getVolume() {
		return currentVolume;
	}
	/*
	 * Returns the current volume.
	 */
	
	public void volumeDown() {
		if (currentVolume > -0.01 + VOLUME_INCREMENT) {
			currentVolume = currentVolume - VOLUME_INCREMENT + .000000000000001;
		}
		else {
			currentVolume = 0;
		}
	}
	/*
	 * Lowers the volume by VOLUME_INCREMENT, but not below 0.0
	 */
	
	public void volumeUp() {
		if (currentVolume < 1.01 - VOLUME_INCREMENT) {
			currentVolume = currentVolume + VOLUME_INCREMENT ;
		}
		else {
			currentVolume = 1.0;
		}
	}
	/*
	 * Raises the volume by VOLUME_INCREMENT, but not above 1.0
	 */
	
	
}
