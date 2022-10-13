package Pop_Up;

public class Third_Party_Authentication_Popup {

	public static void main(String[] args) {
	

	}
	}
//b) Third party  Authentication PopUp
//This authentication is done from the other organization(Like google/Facebook).
//When we try to sign up to some website there we can see sign up with google. 
//When we click on that it will open anather window(Where we can see our mail ids or user another account).

//To switch to Authentication window,  we need to shift selenium focus from main page to Authentication popup.
//we use below code,
//First get address Authentication popup.

//			List<String> addresses = new arrayList<>(driver.getWindowHandles());
//			driver.switchto().window(addresses.get(1));

//now we can perform any actions on Authentication PopUp.