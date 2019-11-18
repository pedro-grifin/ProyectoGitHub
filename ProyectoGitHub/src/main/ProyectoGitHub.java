package main;

public class ProyectoGitHub {

    /**
     * @author PedroGuzman
     * @version Final
     */
    /**
     * Metodo que compara la calificacion deseada con la calificacion real y devuelve un comentario.
     * @param valor1 Valor de la calificacion deseada
     * @param valor2 Valor de la calificacion real del alumno.
     * @return String con el comentario sobre la comparativa.
     */
    public static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
        return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
         return "Te has confiado. Falta realismo.";
    }
    public static void main(String[] args) {
        String x=veredicto("7","8");
        System.out.println("La calificacion de "+args[0]+" : "+x);
      
      
    }
    
}
