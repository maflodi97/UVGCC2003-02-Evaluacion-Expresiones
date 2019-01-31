/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */

import java.io.*;
import java.util.Vector;

public class EvaluadorPostfix{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException{
        BufferedReader br = null;
        FileReader fr = null;
        final String path = "data.txt";
        //  tambien podria ser pasado como arg pero no se que es mas facil
        //  para los auxiliares.
        //  String path = args[0];


        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line;
            // while lines.


            while ((line = br.readLine()) != null){
                //  process line, lee la linea actual en el bufferedreader
                //  asigna a String line, si asigna null ya no hay mas lineas.
                for (char c: line.toCharArray()){
                    /*
                    Asignar primer char a Stack luego de revisar su tipo?
                    0 - 9
                    operadores
                    espacio
                    else / default
                     */
                }
            }

        } catch(IOException e){
            //} catch(IOException | FileNotFoundException e){
            //  podriamos poner Multicatch exceptions pero en este caso
            // FNFExcep es subclassed de IOExcep entonces cuenta por ambas.
            e.printStackTrace();
        }

    }
    
}
