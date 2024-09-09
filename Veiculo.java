
public class Veiculo {
    private int rodas;
    private int anoFabricacao;
    private String modelo;
    private String placa;
    private double valor;
    private double valorAtualComDepreciacao;

    public Veiculo(int r, int af, String m, String p, double v, double va) {
        this.rodas = r;
        this.anoFabricacao = af;
        this.modelo = m;
        this.placa = p;
        this.valor = v;
        this.valorAtualComDepreciacao = va;
    }

    public void setRodas(int r) {
        this.rodas = r;
    }

    public int getRodas() {
        return this.rodas;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setValor(double v) {
        this.valor = v;
    }

    public double getValor() {
        return this.valor;
    }

    public double depreciacao() {
        this.valorAtualComDepreciacao = (this.valor - ((2024 - this.anoFabricacao) * 1000));

        return this.valorAtualComDepreciacao;
    }

}