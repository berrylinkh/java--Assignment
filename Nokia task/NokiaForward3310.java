import java.util.Scanner;
public class NokiaForward3310{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
	
	String nokiaMenu ="""

	Application

	1  phoneBook
	2  Message
	3  Chat
	4  Call register
	5  Tones
	6  Settings
	7  Call Divert
	8  Games
	9  Calculator
	10 Reminder
	11 Clock
	12 Profiles
	13 Sim Service

	""";
System.out.println(nokiaMenu);
int nokiaMenuChoice = inputCollector.nextInt();
switch(nokiaMenuChoice){

	case 1: System.out.println("phoneBook");
	String phoneBookMenu = """

	1  search
	2  service number
	3  Add name
	4  Erase
	5  Edit
	6  Assign tones
	7  Send b'card
	8  Option
	9  Speed dial
	10 Voice tags
	""";
	System.out.println(phoneBookMenu);
	int option = inputCollector.nextInt();
	switch(option){
				
		case 1:  System.out.println("search"); break;
		case 2:  System.out.println("serviceNumber"); break;
		case 3:  System.out.println(" addName"); break;
		case 4:  System.out.println("erase"); break;
		case 5:  System.out.println("edit"); break;
		case 6:  System.out.println("assignTones"); break;
		case 7:  System.out.println("sendB'Card"); break;
		case 8:  System.out.println("option"); 
		String optionMenu = """

		1 Type of view
		2 Memory status
		""";
		System.out.println(optionMenu);
		int optionMenuList = inputCollector.nextInt();
		switch(optionMenuList){

			case 1:System.out.println("Type of view"); break;
			case 2:System.out.println("Memory status"); break;
			default:System.out.println("Invalid out"); break;
			}
		case 9:  System.out.println("speedDial"); break;
		case 10:  System.out.println("voiceTags");	
			}
			break;
	
case 2: System.out.println("message"); 
	String messageMenu = """

	1  Write message
	2  Inbox
	3  Outbox
	4  Picture
	5  Templates
	6  Smileys
	7  Message settings
	8  Info service
	9  Voice mailbox number
	10 Service command editor
	""";
	System.out.println(messageMenu);
	int messageSettings = inputCollector.nextInt();
	switch(messageSettings){

		case 1:  System.out.println(" Write message"); break;
		case 2:  System.out.println("Inbox"); break;
		case 3:  System.out.println(" Outbox"); break;
		case 4:  System.out.println(" Picture"); break;
		case 5:  System.out.println("Templates"); break;
		case 6:  System.out.println("Smileys"); break;
		case 7:  System.out.println("Message settings");
		
				String messageSettingsMenu = """
			1 Set 1
			2 Common
			""";
	System.out.println(messageSettingsMenu);
	int messageSettingsMenuList = inputCollector.nextInt();
	switch(messageSettingsMenuList){

case 1:System.out.println("Set 1");
String set1Menu = """

			1  Message centre number
			2  Message sent as
			3  Message validity
			""";
	System.out.println(set1Menu);
	int set1MenuList = inputCollector.nextInt();
	switch(set1MenuList){

		case 1:System.out.println("Message centre number"); break;
		case 2:System.out.println("Message sent as"); break;
		case 3:System.out.println("Message validity"); break;
		default:System.out.println("Invalid out"); 
			}
			break;
	
case 2:System.out.println("Common");
String commonMenu = """

			1 Delivery report
			2 Reply via same centre
			3 Character support
			""";
	System.out.println(commonMenu);
	int commonMenuList = inputCollector.nextInt();
	switch(commonMenuList){

		case 1:System.out.println(" Delivery report"); break;
		case 2:System.out.println("Reply via same centre"); break;
		case 3:System.out.println("Character support"); break;
		default:System.out.println("Invalid out");
		}
		break;

		default:System.out.println("Invalid out");
		}
		break;

		case 8:  System.out.println("Info service"); break;
		case 9:  System.out.println("Voice mailbox number"); break;
		case 10: System.out.println("Service command editor"); break;
		}
		break;

case 3: System.out.println("Chat");
String chatMenu  = """

		""";
 	System.out.println(chatMenu); break;

case 4: System.out.println("Call register");
String callRegisterMenu = """

			1  Missed calls
			2  Recieved calls
			3  Dialed number
			4  Erase recent call list
			5  Show all call duration
			6  Show call cost
			7  Call cost settings
			8  Perpaid credit
			""";

	System.out.println(callRegisterMenu);
	int callRegisterMenuList = inputCollector.nextInt();
	switch(callRegisterMenuList){

		case 1:  System.out.println("Missed calls"); break;
		case 2:  System.out.println("Recieved calls"); break;
		case 3:  System.out.println("Dialed number"); break;
		case 4:  System.out.println("Erase recent call list"); break;
		case 5:  System.out.println("Show all call Duration"); 
		String showAllCallDurationMenu  = """

			1  Last call duration
			2  All call duration
			3  Recieved call duration
			4  Dailed call duration
			5  Clear timer
			""";
	System.out.println(showAllCallDurationMenu);
	int showAllCallDurationMenuList = inputCollector.nextInt();
	switch(callRegisterMenuList){

		case 1:  System.out.println("Last call duration"); break;	
		case 2:  System.out.println("All call duration"); break;
		case 3:  System.out.println("Recieved call duration"); break;
		case 4:  System.out.println(" Call cost setting"); break;
		case 5:  System.out.println("Dailed call duration"); break;
		default: System.out.println("Invalid input"); 
		}
		break;

case 6:  System.out.println("Show call cost");
String showCallCostMenu = """

			1  Test call cost
			2  All cost call
			3  Clear counter
			""";

	System.out.println(showCallCostMenu);
	int showCallCostMenuList = inputCollector.nextInt();
	switch(callRegisterMenuList){

		case 1:System.out.println("Test call cost"); break;
		case 2:System.out.println("All cost call"); break;
		case 3:  System.out.println("Clear counter"); break;
		default:System.out.println("Invalid input"); 
		}
		break;

case 7: System.out.println(" Call cost setting");
String callCostSettingsMenu = """

			1  Call cost limit
			2  show cost in
			""";

	System.out.println(callCostSettingsMenu);
	int callCostSettingsMenuList = inputCollector.nextInt();
	switch(callCostSettingsMenuList){

		case 1:System.out.println("Call cost limit"); break;
		case 2:System.out.println("show cost in"); break;
		default:System.out.println("Invalid input"); 
		}
		break;

		case 8:  System.out.println("Perpaid credit"); break;
		default:System.out.println("Invalid input"); 
		}
		break;	


case 5: System.out.println("Tone"); 
String toneMenu = """

			1  Ringing tone
			2  Ringing volume
			3  Incoming call alert
			4  composer
			5  Message alert tone
			6  Keypad tones
			7  Warning and game tones
			8  viberating alert
			9  screen saver
			""";

	System.out.println(toneMenu);
	int toneMenuList = inputCollector.nextInt();
	switch(toneMenuList){

		case 1:  System.out.println("Ringing tone"); break;
		case 2:  System.out.println("Ringing volume"); break;
		case 3:  System.out.println("Incoming call alert"); break;
		case 4:  System.out.println("composer"); break;
		case 5:  System.out.println("Message alert tone");break;
		case 6:  System.out.println("Keypad tones"); break;
		case 7:  System.out.println("Warning and game tones"); break;
		case 8:  System.out.println("viberating alert"); break;
		case 9:  System.out.println("screen saver");break;
		}
		break;

case 6: System.out.println("Settings");
String settingsMenu = """

			1  Call settings
			2  Phone settings
			3  Security settings
			4  Restore factory settings
			""";
	System.out.println(settingsMenu);
	int tonesMenuList = inputCollector.nextInt();
	switch(tonesMenuList){

case 1:  System.out.println("Call settings");
String callSettingsMenu = """

			1 Automatic redial
			2 Speed dial
			3 Call waiting option
			4 Own number
			5 Phone in use
			6 Automatic answer
			""";

	System.out.println(callSettingsMenu);
	int callSettingsMenuList = inputCollector.nextInt();
	switch(callSettingsMenuList){

		case 1:  System.out.println("Automatic redial"); break;
		case 2:  System.out.println("Speed dial"); break;
		case 3:  System.out.println("Call waiting option"); break;
		case 4:  System.out.println("Own number"); break;
		case 5:  System.out.println("Phone in use");break;
		case 6:  System.out.println("Automatic answer"); break;
			}
			break;

case 2:  System.out.println("Phone settings"); 
String phoneSettingsMenu = """

			1 Language
			2 call info display
			3 Welcome note
			4 Network selection
			5 Touch
			6 Confirm sim service action
			""";

	System.out.println(phoneSettingsMenu);
	int phoneSettingsMenuList = inputCollector.nextInt();
	switch(phoneSettingsMenuList){

		case 1:  System.out.println("Language"); break;
		case 2:  System.out.println("call info display"); break;
		case 3:  System.out.println("Welcome note"); break;
		case 4:  System.out.println("Network selection"); break;
		case 5:  System.out.println("Touch");break;
		case 6:  System.out.println("Confirm sim service action"); break;
			}
			break;

case 3:  System.out.println("Security settings");
String securitySettingsMenu = """

			1 Pin code request
			2 Call barring service
			3 Fix dialing
			4 Closed user group
			5 Phone security
			6 Change access code
			""";
	System.out.println(securitySettingsMenu);
	int securitySettingsMenuList = inputCollector.nextInt();
	switch(securitySettingsMenuList){

		case 1:  System.out.println("Language"); break;
		case 2:  System.out.println("call info display"); break;
		case 3:  System.out.println("Welcome note"); break;
		case 4:  System.out.println("Network selection"); break;
		case 5:  System.out.println("Touch");break;
		case 6:  System.out.println("Confirm sim service action"); break;
			}
			break;
		case 4:  System.out.println("Restore factory settings"); break;
			}
			break;

case 7: System.out.println("Call divert");
String calldivertMenu  = """
			""";
 	System.out.println(calldivertMenu); break;

case 8: System.out.println("Games");
String gamesMenu  = """
			""";

 	System.out.println(gamesMenu); break;

case 9: System.out.println("Calculator");
String calculatorMenu  = """
			""";

 	System.out.println(calculatorMenu); break;

case 10: System.out.println("Reminder");
	String reminderMenu  = """
			""";

 	System.out.println(reminderMenu); break;


case 11: System.out.println("Clock"); 
String clockMenu = """

			1  Alarm clock
			2  Clock settings
			3  Date setting
			4  Stopwatch
			5  Countdown time
			6  Auto update date and time
			""";
	System.out.println(clockMenu);
	int clockMenuList = inputCollector.nextInt();
	switch(clockMenuList){

		case 1:  System.out.println("Alarm clock"); break;
		case 2:  System.out.println("Clock settings"); break;
		case 3:  System.out.println("Date setting"); break;
		case 4:  System.out.println("Stopwatch"); break;
		case 5:  System.out.println("Countdown time");break;
		case 6:  System.out.println("Auto update date and time"); break;
			}
			break;

case 12: System.out.println("Profile");
	String profileMenu  = """
			""";

 	System.out.println(profileMenu); break;


case 13: System.out.println("Sim service");
String simServiceMenu  = """
			""";

 	System.out.println(simServiceMenu); break;

}		
}	
}
