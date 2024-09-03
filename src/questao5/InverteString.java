<<<<<<< HEAD
package questao5;
public class InverteString {

    private String texto;

    public InverteString(String texto) {
        this.texto = texto;
    }


    // Método para inverter a string
    private String inverteString() {
    	StringBuilder invertida = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida.append(texto.charAt(i));
        }

        return invertida.toString();
    }

    // Método para obter o texto invertido
    public String getTextoInvertido() {
        return inverteString();
    }
    
    // Método para obter o texto original
    public String getTextoOriginal() {
        return texto;
    }

  
}
=======
package questao5;
public class InverteString {

    private String texto;

    public InverteString(String texto) {
        this.texto = texto;
    }


    // Método para inverter a string
    private String inverteString() {
    	StringBuilder invertida = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida.append(texto.charAt(i));
        }

        return invertida.toString();
    }

    // Método para obter o texto invertido
    public String getTextoInvertido() {
        return inverteString();
    }
    
    // Método para obter o texto original
    public String getTextoOriginal() {
        return texto;
    }

  
}
>>>>>>> 32d9c163a05020e1d2203bba11dec98c4ce8ed6e
