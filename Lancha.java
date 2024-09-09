public class Lancha extends Veiculo {
    private double potenciaMotor;
    private String tipoCombustivel;
    private double capacidadeTanque;
    private boolean temCamarote;
    private int numeroPessoas;

    public Lancha(int r, int af, String m, String p, double v, double va, double pm, String tc, double ct,
            boolean camarote, int np) {
        super(r, af, m, p, v, va);
        this.potenciaMotor = pm;
        this.tipoCombustivel = tc;
        this.capacidadeTanque = ct;
        this.temCamarote = camarote;
        this.numeroPessoas = np;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public boolean isTemCamarote() {
        return temCamarote;
    }

    public void setTemCamarote(boolean temCamarote) {
        this.temCamarote = temCamarote;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public void navegar() {
        System.out.println("Lancha navegando...");
    }

    public void ancorar() {
        System.out.println("Lancha ancorada.");
    }

    public void abastecer() {
        System.out.println("Abastecendo lancha com " + capacidadeTanque + " litros.");
    }

    public void exibirDetalhes() {
        System.out
                .println("Modelo: " + getModelo() + ", Potência: " + potenciaMotor + " HP, Pessoas: " + numeroPessoas);
    }

    public static void main(String[] args) {
        Lancha lancha = new Lancha(0, 2022, "Lancha Luxo", "NA1234", 500000, 480000, 500, "Diesel", 300, true, 12);
        lancha.navegar();
        lancha.abastecer();
        lancha.exibirDetalhes();
        lancha.ancorar();
    }
}
