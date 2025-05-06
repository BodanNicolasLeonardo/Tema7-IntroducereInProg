import java.util.List;

public class ComercialProject extends Project {
	
	public ComercialProject(String titlu, String obiectiv, long fonduri, Programer manager, List<Programer> membru) {
		super(titlu, obiectiv, fonduri, manager );
		this.deadLine = deadLine;
		this.fonduriDeMarketing = fonduri /2;
		this.numarDeEchipe = numarDeEchipe;
	}



	private String deadLine;
	private long fonduriDeMarketing;
	private int numarDeEchipe;
	
	@Override
	
	public void addMember(Programer m) {
		if (membru.size() < 15) {
		super.addMember(m);
		} else {
		System.out.println("Limita de 15 membrii");
	}
	}
	public double getRisk() {
		if (getMemberCount() == 0 || fonduri == 0 ) return Double.MAX_VALUE;
			return (numarDeEchipe * 3 / getMemberCount() / fonduri-fonduriDeMarketing);

	}
	
	
	

}
