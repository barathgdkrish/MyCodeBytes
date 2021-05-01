package playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	public static void main(String[] args) {
		
		Album jeans = new Album("Jeans","AR Rehman");
		Album uyire = new Album("Uyire","AR Rehman");
		Album ghilli = new Album("Ghilli","Vidyasagar");
		
		jeans.addSong("Kannodu Kanbathellam", 4.5);
		jeans.addSong("Columbus Columbus", 3.25);
		jeans.addSong("Anbae Anbae", 3.75);
		jeans.addSong("Vaarayo Thozhi", 5.1);
		jeans.addSong("Poovukkul", 5.32);
	
		uyire.addSong("En uyire", 4.13);
		uyire.addSong("Poonkatrile", 3.35);
		uyire.addSong("Thaiyya Thaiyya", 4.0);
		
		ghilli.addSong("Kokarakokara Ko", 3.09);
		ghilli.addSong("Ghilli ghilli", 4.12);
		ghilli.addSong("Arjunaru Villu", 2.57);
		albums.add(uyire);
		albums.add(jeans);
		albums.add(ghilli);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("En Uyire", playList);
		albums.get(0).addToPlayList(1, playList);
		albums.get(0).addToPlayList("Aaluma Doluma", playList);
		albums.get(1).addToPlayList("Kannodu Kanbathellam", playList);
		albums.get(1).addToPlayList("Columbus", playList);
		albums.get(1).addToPlayList("Anbae Anbae", playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(5, playList);
		albums.get(2).addToPlayList("Ghilli ghilli", playList);
		albums.get(2).addToPlayList(2, playList);
		albums.get(2).addToPlayList("Vetta", playList);
		
		play(playList);
	}
	private static void play(LinkedList<Song> playList) {
		ListIterator<Song> listIterator = playList.listIterator();
		Scanner sc = new Scanner(System.in);
		boolean forward = true, quit = false;
		if(playList.size()==0) {
			System.out.println("No songs in Playlist");
		}else {
			System.out.println("Now Playing "+ listIterator.next().toString());
		}
		while(!quit) {
			
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			case 0: System.out.println("Playlist is complete.");
					quit = true;
					break;
			case 1: if(!forward) {
						if(listIterator.hasNext())
							listIterator.next();
					    forward = true;
					}
					if(listIterator.hasNext()) 
					{
						System.out.println("Now Playing "+listIterator.next().toString());
					}else {
						System.out.println("We have reached the end of playlist.");
						forward = false;
					}
					break;
			case 2: if(forward) {
						if(listIterator.hasPrevious())
							listIterator.previous();
					forward = false;
					}
					if(listIterator.hasPrevious()) {
						System.out.println("Now Playing "+listIterator.previous().toString());
					}else {
						System.out.println("We have reached the start of playlist.");
						forward = true;
					}
					break;
			case 3: if(forward){
						if(listIterator.hasPrevious())
						{
							System.out.println("Now Playing "+listIterator.previous().toString());
							forward = false;
						}else
						{
							System.out.println("We are at the start of the Playlist");
						}
					}else
					{
						if(listIterator.hasNext()) 
						{
							System.out.println("Now Playing "+listIterator.next().toString());
							forward = true;
						}
						else
						{
							System.out.println("We have reached the start of playlist.");
						}
					}
					break;
			case 4: printList(playList);
				    break;
			case 5: printMenu();
					break;
			}
		}
		sc.close();
	}
	public static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n"+
						   "1 - to play next song\n"+
						   "2 - to play the previous song\n"+
						   "3 - to replay the current song\n"+
						   "4 - to print the playlist\n"+
						   "5 - to print available actions");
	}
	public static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("=====================================");
		int i =1;
		while(iterator.hasNext()) {
			System.out.print(i+". "+iterator.next()+"\n");
		}
		System.out.println("=====================================");
	}
	
}
