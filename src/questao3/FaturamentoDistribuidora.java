package questao3;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class FaturamentoDistribuidora {
	
	// Variáveis para armazenar o menor, o maior e a soma dos valores
    private double menorValor = Double.MAX_VALUE;
    private double maiorValor = Double.MIN_VALUE;
    private double somaValores = 0.0;
    private int diasComFaturamento = 0;
    
	private List<Faturamento> faturamentos;
	
	public FaturamentoDistribuidora() {
		try {
			// Carregar dados do arquivo JSON
			Gson gson = new Gson();
	        Type listType = new TypeToken<ArrayList<Faturamento>>(){}.getType();
	        faturamentos = gson.fromJson(new FileReader("json/dados.json"), listType);
	        
	        
	        // Calcular menor, maior valor e soma dos valores
	          for (Faturamento f : faturamentos) {
	              if (f.getValor() > 0) { // Ignorar dias sem faturamento
	                  if (f.getValor() < menorValor) {
	                      menorValor = f.getValor();
	                  }
	                  if (f.getValor() > maiorValor) {
	                      maiorValor = f.getValor();
	                  }
	                  somaValores += f.getValor();
	                  diasComFaturamento++;
	              }
	          }
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public double getMenorValor() {
		return menorValor;
	}


	public double getMaiorValor() {
		return maiorValor;
	}


	public double getSomaValores() {
		return somaValores;
	}


	public int getDiasComFaturamento() {
		return diasComFaturamento;
	}
	

	// Calcular a média mensal
	public double mediaMensal() {
		return somaValores / diasComFaturamento;
	}
    
	// Contar quantos dias tiveram faturamento superior à média
    public int getDiasAcimaDaMedia() {
    	 int diasAcimaDaMedia = 0;
    	 double mediaMensal = mediaMensal();
         for (Faturamento f : faturamentos) {
             if (f.getValor() > mediaMensal) {
                 diasAcimaDaMedia++;
             }
         }
    	return diasAcimaDaMedia;
    }
}
