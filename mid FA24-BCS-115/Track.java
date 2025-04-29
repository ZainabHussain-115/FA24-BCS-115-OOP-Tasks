public class Track{

	String title;
	String trackId;
	Artist artist;

	Track(String title, String trackId, Artist artist){
		this.title=title;
		this.trackId=trackId;
		this.artist=artist;
	}
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nTitle: ").append(title);
		sb.append("\n ID: ").append(trackId);
		sb.append("\n Artist: ").append(artist);
		return toString();
	}


/*
	@Override
	public boolean equals(Object obj){
		Track track= (Track) obj;
		return this.trackId.equals(obj);
	}
*/

	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}


	public void setTrackId(String trackId){
		this.trackId=trackId;
	}
	public String getTrackId(){
		return trackId;
	}




}