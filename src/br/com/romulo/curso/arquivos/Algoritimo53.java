package br.com.romulo.curso.arquivos;

import java.util.HashMap;
import java.util.Map;

public class Algoritimo53 {
void main(){

    Map<String,Estudante> estudantes = new HashMap<>();

    IO.println("Java Doctor - Escola de Programação");
    Estudante e1= new Estudante("JP","ADS", 2025 );
    estudantes.put("MAT-1223", e1);
    Estudante e2= new Estudante("Ellias","ADS", 2025 );
    estudantes.put("MAT-9223", e2);
    Estudante e3= new Estudante("Jo","ADS", 2025 );
    estudantes.put("MAT-1823", e3);
    Estudante e4= new Estudante("Joakin","ADS", 2015 );
    estudantes.put("MAT-1225", e4);
    Estudante e5= new Estudante("Pedra","ADS", 2027 );
    estudantes.put("MAT-1293", e5);
    Estudante e6= new Estudante("Japi","ADS", 2028 );
    estudantes.put("MAT-1423", e6);
    Estudante e7= new Estudante("Jopa","ADS", 2028 );
    estudantes.put("MAT-1123", e7);
    Estudante e8= new Estudante("Jara","ADS", 2026 );
    estudantes.put("MAT-1023", e8);
    Estudante e9= new Estudante("Jomes","ADS", 2026 );
    estudantes.put("MAT-1723", e9);
    Estudante e10= new Estudante("Jon","ADS", 2016 );
    estudantes.put("MAT-1283", e10);
    Estudante e11= new Estudante("Duda","ADS", 2028 );
    estudantes.put("MAT-1229", e11);
    Estudante e12= new Estudante("Gomes","ADS", 2026 );
    estudantes.put("MAT-1220", e12);
 
    //listar todos estudantes e

    for(Estudante e : estudantes.values()){
        IO.println(e);   
        }

        for(String matricula : estudantes.keySet()){
        Estudante e = estudantes.get(matricula);

        IO.println(matricula + "->" +e);
        }

}
   
}

