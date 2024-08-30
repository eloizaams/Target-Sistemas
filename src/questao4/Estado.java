package questao4;

public class Estado {
	
    private String nome;
    private double faturamento;

    public Estado(String nome, double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public double getFaturamento() {
        return faturamento;
    }
}
