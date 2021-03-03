import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welkome to Remote Program");
		
		Scanner scanner = new Scanner(System.in);
		
		String actions="Actions...\n"
					  +"1.Show Channels\n"
					  +"2.Add Channels\n"
					  +"3.Remove Channels\n"
					  +"4.Find out the number of channels\n "
					  +"Press q to exit ";
		
		Remote remote = new Remote();
		
		while(true) {
			System.out.println(actions);
			
			System.out.println("enter the transaction ");
			String  action = scanner.nextLine();
			
			if(action.equals("q")) {
				System.out.println("Exiting the program");
				break;
			}else if(action.equals("1")) {
				showChannels(remote);
			}else if(action.equals("2")) {
				System.out.println("The name of the channel");
				String channel_name =scanner.nextLine();
				remote.addChannel(channel_name);
				
			}else if(action.equals("3")) {
				System.out.println("The name of the channel");
				String channel_name =scanner.nextLine();
				remote.removeChannel(channel_name);
				
			}else if(action.equals("4")) {
				System.out.println("The number of Channels");
				remote.numberOfChannel();
			}
			else {
				System.out.println("Invalid action!!!");
			}
		}
		
	}
	
	public static void showChannels(Remote remote) {
	
		if(remote.numberOfChannel()==0) {
			System.out.println("No channels are currently available ");
		}else {
			for(String channel : remote) {
				System.out.println("Channel : " + channel);
			}
		}
		
	}

}
