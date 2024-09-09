public class Aviao extends Veiculo {
    private int numeroMotores;
    private String companhiaAerea;
    private double capacidadeCombustivel;
    private double altitudeMaxima;
    private int numeroPassageiros;

    public Aviao(int r, int af, String m, String p, double v, double va, int nm, String ca, double cc, double am,
            int np) {
        super(r, af, m, p, v, va);
        this.numeroMotores = nm;
        this.companhiaAerea = ca;
        this.capacidadeCombustivel = cc;
        this.altitudeMaxima = am;
        this.numeroPassageiros = np;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void decolar() {
        System.out.println("Avião decolando...");
    }

    public void pousar() {
        System.out.println("Avião pousando...");
    }

    public void abastecer() {
        System.out.println("Avião abastecido com " + capacidadeCombustivel + " litros.");
    }

    public void exibirInformacoes() {
        System.out.println(
                "Modelo: " + getModelo() + ", Companhia: " + companhiaAerea + ", Passageiros: " + numeroPassageiros);
    }

    public static void main(String[] args) {
        Aviao aviao = new Aviao(6, 2018, "Boeing 747", "AB1234", 30000000, 25000000, 4, "Gol", 150000, 12000, 300);
        aviao.decolar();
        aviao.abastecer();
        aviao.exibirInformacoes();
        aviao.pousar();
    }
}
