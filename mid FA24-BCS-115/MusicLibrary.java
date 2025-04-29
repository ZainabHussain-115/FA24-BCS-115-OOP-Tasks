public class MusicLibrary{
	String name;
	Librarian librarian;
	Playlist[] playlists=new Playlist[2];
	private int index=0;
	private int index1=0;
	RegistredListener[] listeners=new RegistredListener[2];


		MusicLibrary(String name, Librarian librarian, Playlist[] playlists,RegistredListener[] registredListener){
		this.name=name;
		this.librarian=librarian;
		playlists=new Playlist[2];
		registredListener=new RegistredListener[2];
	}

	
	public void addPlaylist(Playlist p){
		playlists[index++]=p;
		System.out.print("PLaylist added");
	}

	public void addListener(RegistredListener l){
		listeners[index1++]=l;
		System.out.print("Listener added");

	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nName: ").append(name);
		sb.append("\nLibrarian: ").append(librarian);
		sb.append("Playlist");
		for(int i=0;i<playlists.length;i++){
			sb.append(i);
		}
		sb.append("Registered Listener");
		for(int i=0;i<listeners.length;i++){
			sb.append(i);
		}
		return toString();
	}


}