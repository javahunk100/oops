
public class HtcSamsungMain {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile("Jacker","white",3000);
		System.out.println(mobile);
		mobile.ringtone();
		
		HTC htc=new HTC("Oieieie","pink",2334,"99388373733");
		System.out.println(htc);
		htc.call();
		htc.ringtone();
		htc.sms();
		///htc.vibrate();
		
		
		Samsung sam=new Samsung();
		System.out.println(sam);
		sam.ringtone();
		sam.call();
		sam.vibrate();
		//sam.sms();
		
		mobile=new HTC("Ilm","yellow",2000,"0394894848");
		mobile.call();
		mobile.ringtone();
		//mobile.sms();
		
		mobile=sam;
		mobile.call();
		mobile.ringtone();

	}

}
