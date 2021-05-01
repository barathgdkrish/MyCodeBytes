package generics;

public class Main {

	public static void main(String[] args) {
	
		League<Team<FootballPlayer>,FootballPlayer> footballLeague = new League<>("AFL");
		Team<FootballPlayer> adelaide = new Team<FootballPlayer>("Adelaide");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//		Team<Player> baseballteam = new Team<>("Puppies");
		footballLeague.add(fremantle);
		footballLeague.add(hawthorn);
		footballLeague.add(melbourne);
		footballLeague.add(adelaide);
//		footballLeague.add(baseballteam);
		
		hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaide, 3, 8);

        adelaide.matchResult(fremantle, 2, 1);
        melbourne.matchResult(fremantle, 1, 5);
        melbourne.matchResult(adelaide, 3, 8);

        adelaide.matchResult(fremantle, 2, 1);
//        
//        Team rawTeam = new Team("Raw Team");
//        
//        footballLeague.add(rawTeam);
        footballLeague.printLeague();
	}
}
