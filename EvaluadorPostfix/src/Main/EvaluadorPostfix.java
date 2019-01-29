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
        String path = "";
        //  tambien podria ser pasado como arg pero no se que es mas facil
        //  para los auxiliares.
        //  String path = args[0];


        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line;
            // while lines.


            while ((line = br.readLine()) != null){
                //  process line
                char[] chars = new char[line.length()];
                //  creo que no es ni necesario esto porque vamos a iterar un string.
            }

        } catch(IOException e){
            //} catch(IOException | FileNotFoundException e){
            //  podriamos poner Multicatch exceptions pero en este caso
            // FNFExcep es subclassed de IOExcep entonces cuenta por ambas.
            e.printStackTrace();
        }

    }
    
}
