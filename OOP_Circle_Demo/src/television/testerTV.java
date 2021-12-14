package television;

public class testerTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(45);
		System.out.println("TV1 is current Channel is " + tv1.currChannel + 
				" and volume is " + tv1.currVolume);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		System.out.println("TV2 is current Channel is " + tv2.currChannel + 
				" and volume is " + tv2.currVolume);
		

	}

}
