public class Bicicleta extends Veiculo {
    private String tipo;
    private int marchas;
    private boolean temSuspensao;
    private String materialQuadro;
    private boolean temFreioADisco;

    public Bicicleta(int r, int af, String m, String p, double v, double va, String t, int ma, boolean ts, String mq,
            boolean fd) {
        super(r, af, m, p, v, va);
        this.tipo = t;
        this.marchas = ma;
        this.temSuspensao = ts;
        this.materialQuadro = mq;
        this.temFreioADisco = fd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public boolean isTemSuspensao() {
        return temSuspensao;
    }

    public void setTemSuspensao(boolean temSuspensao) {
        this.temSuspensao = temSuspensao;
    }

    public String getMaterialQuadro() {
        return materialQuadro;
    }

    public void setMaterialQuadro(String materialQuadro) {
        this.materialQuadro = materialQuadro;
    }

    public boolean isTemFreioADisco() {
        return temFreioADisco;
    }

    public void setTemFreioADisco(boolean temFreioADisco) {
        this.temFreioADisco = temFreioADisco;
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void trocarMarcha(int novaMarcha) {
        System.out.println("Mudando para a marcha: " + novaMarcha);
    }

    public void parar() {
        System.out.println("Bicicleta parando...");
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo() + ", Tipo: " + tipo + ", Marchas: " + marchas);
    }

    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta(2, 2021, "Mountain Bike", "", 2000, 1800, "Montanha", 21, true, "Alumínio",
                true);
        bike.pedalar();
        bike.trocarMarcha(3);
        bike.exibirDetalhes();
        bike.parar();
    }
}
