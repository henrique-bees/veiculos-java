public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoMoto;
    private boolean possuiABS;
    private String cor;
    private boolean temPartidaEletrica;

    public Moto(int r, int af, String m, String p, double v, double va, int cc, String tm, boolean abs, String c,
            boolean pe) {
        super(r, af, m, p, v, va);
        this.cilindradas = cc;
        this.tipoMoto = tm;
        this.possuiABS = abs;
        this.cor = c;
        this.temPartidaEletrica = pe;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public boolean isPossuiABS() {
        return possuiABS;
    }

    public void setPossuiABS(boolean possuiABS) {
        this.possuiABS = possuiABS;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    public void frear() {
        System.out.println("Moto freando...");
    }

    public void ligar() {
        System.out.println("Moto ligada.");
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo() + ", Cilindradas: " + cilindradas + "cc, Cor: " + cor);
    }

    public static void main(String[] args) {
        Moto moto = new Moto(2, 2019, "Harley-Davidson", "HD1234", 50000, 45000, 1200, "Custom", true, "Preta", true);
        moto.ligar();
        moto.acelerar();
        moto.exibirDetalhes();
        moto.frear();
    }
}
