package television;
/*
 * consider television sets. Each TV is an object with:
 * states (current channel, current volume level, and power on or off) 
 * behaviors (change channels, adjust volume, and turn on/off)
 */

class TV {
	
	//Attributes / Variables / Data-fields
	int currChannel = 1;
	int currVolume = 1;
	boolean on = false;
	
	
	//Object Definition / Constructors
	TV(){
		
	}
		
	
	//Methods / Behaviors / Actions
	
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			currChannel = newChannel;
		}
	}
	
	public void channelUp() {
		if (on && currChannel < 120) {
			currChannel++;
		}
	}
	
	public void channelDown() {
		if (on && currChannel > 1) {
			currChannel--;
		}
	}
	
	public void setVolume (int newVolume) {
		if(on && newVolume >=1 && newVolume <= 100) {
			currVolume = newVolume;
		}
	}
	
	public void volumeUp() {
		if (on && currVolume < 100 ) {
			currVolume++;
		}		
	}
	
	public void volumeDown() {
		if(on && currVolume > 1) {
			currVolume--;
		}
	}

}
