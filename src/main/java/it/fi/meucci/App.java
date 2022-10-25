package it.fi.meucci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Alunno uno = new Alunno("lorenzo","salanitro",new Date(2004,4,29));
        Alunno due = new Alunno("lorenzo", "bruni", new Date(2004,10,15));
        Alunno tre = new Alunno("davide", "cazzato", new Date(2004,4,15));
        Alunno quattro = new Alunno("gioele", "falaschi", new Date(2004,4,9));

        ArrayList <Alunno> lista = new ArrayList<Alunno>();

        lista.add(uno);
        lista.add(due);
        lista.add(tre);
        lista.add(quattro);
        
        Classe classe = new Classe(5,"BIA","09-TWC",lista);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("Classe.xml"), classe);
        
    }

   



   
}
