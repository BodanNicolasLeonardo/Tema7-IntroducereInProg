import java.util.List;

public class MilitaryProject extends Project {
	
	private String deadLine;
	private String parola;
	
	
	public MilitaryProject(String titlu, String obiectiv, long fonduri, Programer manager, String parola, String deadLine) {
		super(titlu, obiectiv, fonduri, manager);
		this.parola = parola;
		this.deadLine = deadLine;
		
	}
	
	@Override
	public void addMember(Programer m) {
		if(membru.size() > 15) {
		super.addMember(m);
	
		} else {
		System.out.println("Limita de 15 membrii");
		}
	}

	@Override
	public double getRisk() {
		if(parola.length() == 0 || fonduri == 0) return Double.MAX_VALUE;
		return getMemberCount() / (double) parola.length() / fonduri;
		
	}

}
