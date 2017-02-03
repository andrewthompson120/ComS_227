package hw1;

public class TelevisionTest {

	public static void main(String[] argc) {
		
		Television tv = new Television(5);
		
		// Volume Control Testing
		System.out.println(tv.getVolume()); // Expected 0.5
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.getVolume()); // Expected 0.64
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.getVolume()); // Expected 0.85
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.getVolume()); // Expected 1.0
		
		// Setting Channels
		System.out.println(tv.getChannel()); // Expected 0
		tv.setChannel(4);
		System.out.println(tv.getChannel()); // Expected 4
		tv.channelUp();
		System.out.println(tv.getChannel()); // Expected 0
		tv.resetChannelMax(10);
		tv.setChannel(7);
		System.out.println(tv.getChannel()); //Expected 7
		tv.resetChannelMax(5);
		System.out.println(tv.getChannel()); //Expected 4
		tv.goToPreviousChannel();
		System.out.println(tv.getChannel()); //Expected 0
		
		
	}
	
}
