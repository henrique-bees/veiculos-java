public class Carro extends Veiculo {
    private String tipoCombustivel;
    private int portas;
    private boolean possuiArCondicionado;
    private String cor;
    private boolean cambioAutomatico;

    public Carro(int r, int af, String m, String p, double v, double va, String tc, int pt, boolean ac, String c,
            boolean ca) {
        super(r, af, m, p, v, va);
        this.tipoCombustivel = tc;
        this.portas = pt;
        this.possuiArCondicionado = ac;
        this.cor = c;
        this.cambioAutomatico = ca;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frear() {
        System.out.println("Carro freando...");
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo() + ", Cor: " + cor + ", Ar Condicionado: " + possuiArCondicionado);
    }

    public static void main(String[] args) {
        Carro carro = new Carro(4, 2020, "Civic", "XYZ1234", 100000, 95000, "Gasolina", 4, true, "Preto", true);
        carro.ligar();
        carro.acelerar();
        carro.exibirDetalhes();
        carro.frear();
    }
}
