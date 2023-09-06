package projetocolaborador;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Colaborador {
    //Atributos da classe
    private int matricula; 
    private String nome;
    private String setor;
    private float salario;
    ArrayList<Colaborador> ListaColab;
    ArrayList<Colaborador> listacolab;
     public Colaborador(ArrayList<Colaborador> listacolab) {
        this.listacolab = listacolab;
    }
        
    //Construtor 
    public Colaborador(){
       
    }
    
    //Métodos setter
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSetor(String setor){
        this.setor = setor; 
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
     public ArrayList<Colaborador> getListaColab(){
        
        return ListaColab;
    }
    public void setListaColab(ArrayList<Colaborador>ListaColab){
        this.listacolab = ListaColab;
    }
    
    
    
    //metodo getter
    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getSetor(){
        return setor;
    }
    public int getSalario(){
        return (int) salario;
    }
   
   
    
    
    
    //metodos para exibir na tela 
     void mostrarnome(){
        System.out.println(this.nome);
    }
    void mostrarmatricula(){
        System.out.println(this.matricula);
    }
    void mostrarsetor(){
        System.out.println(this.setor);
    }
    void mostrarsalario(){
        System.out.println(this.salario);
    }

    public void addColab(Colaborador C){
    ListaColab.add(C);
    }
    
    
    
    
    
    
}
