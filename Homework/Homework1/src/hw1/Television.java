package hw1;

public class Television {
	
	private int maxChannel;
	private int currentChannel;
	private double currentVolume;
	public static final double VOLUME_INCREMENT	= 0.07;
	/*
	 *  The volume is incremented or decremented by the value of the constant
	 */
	
	
	/*
	 * Constructs a new Television with channels 0 through givenChannelMax - 1
	 * Initially the volume is 0.5
	 */
	public Television(int givenChannelMax){
		
		currentChannel = 0;
		maxChannel = givenChannelMax - 1;
		currentVolume = 0.5;
		
	}

	public int getChannel() {
		return currentChannel;
	}
}
