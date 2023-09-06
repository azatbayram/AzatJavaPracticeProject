package Java.day44_OOP_Review.CallCenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa=new WhatsApp();
		wa.launch();
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="WhatsApp";
		wa.call("Azat");
		wa.sendMessage("Hello, how are you?");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		System.out.println("---------------");
		
		VoiceCallable obj = new WhatsApp();
		
		( (WhatsApp) obj).launch();
		
		( (MessagingApp) obj).allOSCompatible = false;
		
		obj.call("Mr Tom");
		
		( (WhatsApp) obj).videoCall();
		

	}

}
