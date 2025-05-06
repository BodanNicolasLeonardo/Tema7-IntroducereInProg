import java.util.ArrayList;
import java.util.List;

public class InvestmentCompany {
    private List<Project> projects;

    public InvestmentCompany() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        if (projects.isEmpty()) return null;

        Project best = projects.get(0);
        for (Project p : projects) {
            if (p.getRisk() < best.getRisk()) {
                best = p;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Programer p1 = new Programer("Andrei", 35);
        Programer p2 = new Programer("Garcea", 28);
        Programer p3 = new Programer("Marcel", 40);

        ComercialProject commercial = new ComercialProject("App", "Sales app ", 200_000, p1, 3);
        MilitaryProject military = new MilitaryProject("Radar", "Speed detectct systm", 150_000, p2, "parolaSecreta");
        OpenSourceProject openSource = new OpenSourceProject("Linux", "IOS", 100_000, p3, "ceva@yahoo.com");

        commercial.addMember(new Programer("Csabi", 30));
        commercial.addMember(new Programer("Zoli", 27));
        military.addMember(new Programer("Danut", 38));
        openSource.addMember(new Programer("Marco", 22));
        openSource.addMember(new Programer("Alexia", 25));
        openSource.addMember(new Programer("Ghita", 33));

        InvestmentCompany company = new InvestmentCompany();
        company.addProject(commercial);
        company.addProject(military);
        company.addProject(openSource);

        Project best = company.getBestInvestment();
        System.out.println("Cel mai bun proiect pentru investiție este: " + best.titlu + " (Risc = " + best.getRisk() + ")");
    }
}
