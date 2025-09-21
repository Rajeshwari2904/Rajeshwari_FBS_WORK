import java.util.Scanner;

class Player {
	String name;
	int numberOfMatchesPlayed;
	int runsScored;
	int wicketsTaken;
	int maxRunsScored;
	int maxWicketsTaken;
	
	Player() {
		this.name= "Rohit Sharma";
		this.numberOfMatchesPlayed= 5;
		this.runsScored= 20;
		this.wicketsTaken= 4;
	}

	Player(String name, int numberOfMatchesPlayed, int runsScored, int wicketsTaken) {
		
		this.name = name;
		this.numberOfMatchesPlayed = numberOfMatchesPlayed;
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNumberOfMatchesPlayed() {
		return numberOfMatchesPlayed;
	}

	void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
		this.numberOfMatchesPlayed = numberOfMatchesPlayed;
	}

	int getRunsScored() {
		return runsScored;
	}

	void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	int getwicketsTaken() {
		return wicketsTaken;
	}

	void setwicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
	
	void acceptInfo() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name of Player: ");
		this.name = sc.nextLine();
		
		System.out.println("Enter Number Of Matches Played: ");
		this.numberOfMatchesPlayed = sc.nextInt();
		
		System.out.println("Enter Runs Scored: ");
		this.runsScored = sc.nextInt();
		
		System.out.println("Enter Wickets Taken: ");
		this.wicketsTaken = sc.nextInt();	
	}
	
	void displayInfo() {
		System.out.println("Name: "+ this.name);
		System.out.println("Number Of Matches Played: "+ this.numberOfMatchesPlayed);
		System.out.println("Runs Scored: "+ this.runsScored);
		System.out.println("Wickets Taken: "+this.wicketsTaken);
	}
	
	
	

}

class Main{
	public static void main(String[] args) { 
		
		Player[] player= new Player[3];
		
		for(int i=0; i < player.length; i++) {
			
			player[i] = new Player();
			System.out.println("Enter details of Player: ");
			player[i].acceptInfo();
		}
		
		System.out.println("Player Information");
		for(int i=0; i < player.length; i++) {
			System.out.println("");
			player[i].displayInfo();
			
		}
		System.out.println("");
		
		System.out.println("Player who has Scored Maximun Runs");
		Player maxRunsScored = player[0];
		for (int i=0; i < player.length; i++) {
			if (player[i].getRunsScored() > maxRunsScored.getRunsScored()) {
				maxRunsScored = player[i];
				
				maxRunsScored.displayInfo();
			}
		 }
		
		System.out.println("");
		
		System.out.println("Player who has taken Maximun Wickets");
		Player maxWicketsTaken = player[0];
		for(int  i =0; i< player.length; i++) {
			if(player[i].getwicketsTaken() > maxWicketsTaken.getwicketsTaken()) {
				maxWicketsTaken = player[i];
				
				maxWicketsTaken.displayInfo();
			}
		}
	}
}
