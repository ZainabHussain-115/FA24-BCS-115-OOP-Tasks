public class Artist extends Person{
	String genre;

	Artist(String name, String genre){
		super(name);
		this.genre=genre;
	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nName: ").append(name);
		sb.append("\nGenre: ").append(genre);
		return toString();
	}


	public void setGenre(String genre){
		this.genre=genre;
	}
	public String getGenre(){
		return genre;
	}


}