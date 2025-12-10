/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Higor
 */
public class Categoria {
    String nome;
    ArrayList<Categoria> categoria = new ArrayList<>();
    
    
    public Categoria(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }
    
    
    
}
