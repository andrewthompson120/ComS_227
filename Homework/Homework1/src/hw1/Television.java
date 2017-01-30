package hw1;

public class Television {
	
	private int maxChannel;
	private int currentChannel;
	private int previousChannel;
	private int tempPrevChannel;
	
	private double currentVolume;
	private double maxVolume;
	private double minVolume;
	
	
	public static final double VOLUME_INCREMENT	= 0.07;
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

	
	public int getChannel() {
		return currentChannel;
	}
	/*
	 * Returns the current channel.
	 */
	
	public void channelDown() {
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
		currentChannel = channelNumber;
	}
	/*
	 * Sets the channel to the given channel number. 
	 * If the given value is greater than channelMax - 1, the channel is set to channelMax - 1. 
	 * If the given value is negative, the channel is set to zero.
	 */
	
	public void resetChannelMax(int givenMax) { 
		maxChannel = givenMax - 1;
		if (maxChannel < currentChannel) {
			currentChannel = maxChannel;
		}
		if (previousChannel > maxChannel) {
			previousChannel = maxChannel;
		}
	}
	/*
	 * Resets this Television so that its available channels are now from 0 through givenMax - 1. 
	 * If the current channel is greater than givenMax - 1, it is automatically adjusted to be givenMax - 1. 
	 * Likewise, if the previous channel is greater than givenMax - 1, it is automatically adjusted to be givenMax - 1.
	 */
	
	
	
	
}
