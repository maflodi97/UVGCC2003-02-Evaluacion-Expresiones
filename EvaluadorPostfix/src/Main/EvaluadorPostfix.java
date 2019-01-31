package Main;

/**
 * 
 * @author Pablo Sao
 * @version 1.3
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class EvaluadorPostfix{
    
    final static String PATH_DATOS = "datos.txt";
    //identificador de los delimitadores para eliminarse en la informacion
    final static String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException{
        BufferedReader br = null;
        FileReader fr = null;
        //final String path = "data.txt";
        
        
        StringTokenizer token = new StringTokenizer(getDataFile(),DELIMITADOR);

        while(token.hasMoreTokens()){
            //System.out.println(token.nextToken()); //cambiar esto por el metodo que agrega a la pila
        
            //implementar el llenado del stack
            
            /*
            Utilizar esta parte en el flujo que interactua con el stack
            
            
            for (char c: linea.toCharArray()){
                        if (c == '+' || c == '-' || c == '/' || c == '*'){
                            // si esto se cumple es un operador

                        } else if (c == ' '){
                            continue;
                        } else if (!Integer.parseInt(c)){

                        } else {
                            
                        }
                    }
            
            
            //O utilizar algo más simple ya que se quitan letras del abecedario, signos, espacios, etc.
            switch(token.hasMoreTokens()){
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
        }
            
            
            
            */
        }
        
        
        
        
        
        
        
        
       
    }

    
    /***
     * Metodo para obtener en un string toda la información contenida dentro del archivo .txt
     * 
     * @return String todos los datos ingresados en el archivo de texto 
     */
    private static String getDataFile() throws IOException, FileNotFoundException{
        
        BufferedReader reader;
        File file;
        String linea,datos = "";
        try{
            if((new File(PATH_DATOS)).exists()){ //verificamos que el archivo exista
                
                
                reader = new BufferedReader(new FileReader(PATH_DATOS));
                
                while((linea = reader.readLine()) != null){
                    //concatenamos con un tabular la lectura de la linea,
                    //el tabular se eliminara al separar las expresiones.
                    datos += linea + "\t";
                }
                
                reader.close();
            }
            else{
                System.out.println("El archivo ingresado no fue encontrado.");
            }
            
        }
        //Tomaremos todo tipo de error en la ejecución del bloque de codigo dentro del catch
        catch(Exception e){
            e.printStackTrace();
        }
        
        return datos;
    }
    
}
