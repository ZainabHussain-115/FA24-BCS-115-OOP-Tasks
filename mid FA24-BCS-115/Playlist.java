public class Playlist{
	String title;
	String genre;
	Track[] tracks=new Track[5];
	private int index=0;
	Playlist(String title, String genre, Track[] tracks){
		this.title=title;
		this.genre=genre;
		this.tracks=tracks;
	}
	
	public void addTrack(Track t){

		tracks[index++]=t;
		System.out.println("Track added.");
        	}
	

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nTitle: ").append(title);
		sb.append("\nGenre: ").append(genre);

		for(int i=0;i<tracks.length;i++){
			sb.append(i);
		}
		return toString();
	}

public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}

public void setGenre(String genre){
		this.genre=genre;
	}
	public String getGenre(){
		return genre;
	}


}