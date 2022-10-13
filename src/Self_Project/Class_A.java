package Self_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE TESTING\\Software & Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  // Object -->upcasting
			
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=nav_signin&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=16916146682354615349&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299648&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAjwrNmWBhA4EiwAHbjEQA6_zlS-GIE4LiZER_nIek06_rRyxN5Nn2WUHUrPXQV_QpGc3Aj5ORoCae8QAvD_BwE&");
		
			driver.get("https://www.amazon.in/dp/B09Y1LJX1G?ie=UTF8&viewID=&ref_=s9_acss_bw_cg_JulyM_4c1_w");
			
			driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcheckoutportal%2Fenter-checkout.html%3Fie%3DUTF8%26asin%3DB09Y1LJX1G%26buyNow%3D1%26cartCustomerID%3D0%26fromSignIn%3D1%26isBuyBack%3D0%26isGift%3D0%26offeringID%3DfC8Vq1bDimnUf8XMbIAvwDmpBOv4YgFmm20O9hNWsG%25252BbsWjzX%25252F73a%25252F0Z9ChJD7QuaFHJagQDvWx2bBAe%25252BckRxb6MdAO2h8LBPfk37L7BgpCQyBGxTSmb3VDoBiJKO71LhzEA8pP6AC5yz61xtf1%25252FL3OFZkpNwf%25252FN%26quantity%3D1%26sessionID%3D259-1196592-2909544&pageId=amazon_checkout_in&showRmrMe=0&siteState=IMBMsgs.&suppressSignInRadioButtons=0");
			
			// using above get method we open the amazon website in selenium
			
		}

	    }
