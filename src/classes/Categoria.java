/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Higor
 */
public class Categoria {
    String nome;
    public static ArrayList<Categoria> categorias = new ArrayList<>();
    
    
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
        return categorias;
    }
    
    public void AtualizarTabela(ArrayList<Categoria> Cat,JTable tabela){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        for (Categoria categoria:Cat) {
            model.addRow(new Object[]{categoria.nome});
        }
    
    }
    
    
}
