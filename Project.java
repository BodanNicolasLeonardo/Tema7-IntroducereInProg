import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {

	public String titlu;
	public String obiectiv;
	public long fonduri;
	public Programer manager;
	public List <Programer> membru;
	
	public Project(String titlu, String obiectiv, long fonduri, Programer manager ) {
		
		this.titlu = titlu;
		this.obiectiv = obiectiv;
		this.fonduri = fonduri;
		this.manager = manager;
		this.membru = new ArrayList<>();
	}
	
	public void addMember(Programer m) {
		membru.add(m);
		
	}
	
	
	public int getMemberCount() {
		return membru.size();
	}
	 	
	
	
	
}
