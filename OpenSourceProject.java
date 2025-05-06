import java.util.List;

public class OpenSourceProject extends Project{

	private String mailingList;
	
	
	public OpenSourceProject(String titlu, String obiectiv, long fonduri, Programer manager, String mailingList) {
		super(titlu, obiectiv, fonduri, manager );
		this.mailingList = mailingList;
	}

	@Override
	public double getRisk() {
		if(getMemberCount() == 0  || fonduri  == 0) return Double.MAX_VALUE;
		return (double) getMemberCount() / fonduri;
		
	}

	

}
