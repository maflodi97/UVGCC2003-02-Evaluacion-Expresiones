package Main;

/**
 * 
 * @author Pablo Sao
 * @version 1.3
 */

import java.io.*;
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
        
        
        //Los delimitadores eliminaran los caracteres no deseados al momento de separar la informacion
        StringTokenizer token = new StringTokenizer(getDataFile(),DELIMITADOR);
        
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken()); //cambiar esto por el metodo que agrega a la pila
        }
        
        
        //  tambien podria ser pasado como arg pero no se que es mas facil
        //  para los auxiliares.
        //  String path = args[0];
        
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line;
//            // while lines.
//
//
//            while ((line = br.readLine()) != null){
//                //  process line, lee la linea actual en el bufferedreader
//                //  asigna a String line, si asigna null ya no hay mas lineas.
//                for (char c: line.toCharArray()){
//                    /*
//                    Asignar primer char a Stack luego de revisar su tipo?
//                    0 - 9
//                    operadores
//                    espacio
//                    else / default
//                     */
//                }
//            }
//
//        } catch(IOException e){
//            //} catch(IOException | FileNotFoundException e){
//            //  podriamos poner Multicatch exceptions pero en este caso
//            // FNFExcep es subclassed de IOExcep entonces cuenta por ambas.
//            e.printStackTrace();
//        }
            
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
                    for (char c: linea.toCharArray()){
                        if (c == '+' || c == '-' || c == '\\' || c == '*'){
                            // si esto se cumple es un operador

                        } else if (c == ' '){
                            continue;
                        } else if (Integer.parseInt(c)){

                        }
                    }
                
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
