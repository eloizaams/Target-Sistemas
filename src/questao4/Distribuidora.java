package questao4;
import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    private List<Estado> estados;

    public Distribuidora() {
        estados = new ArrayList<>();
    }

    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }

    public double calcularFaturamentoTotal() {
        double total = 0.0;
        for (Estado estado : estados) {
            total += estado.getFaturamento();
        }
        return total;
    }

    public void exibirPercentuais() {
        double totalFaturamento = calcularFaturamentoTotal();
        for (Estado estado : estados) {
            double percentual = (estado.getFaturamento() / totalFaturamento) * 100;
            System.out.printf("Estado: %s - Percentual: %.2f%%%n", estado.getNome(), percentual);
        }
    }
}