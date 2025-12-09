/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Higor
 */
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Carrinho {

    private static ArrayList<Jogo> itens = new ArrayList<>();
    
    
    
    public void AtualizarTabela(ArrayList<Jogo> carrinho, JTable tabela){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        for(Jogo jogo:carrinho){
<<<<<<< HEAD
            model.addRow(new Object[]{jogo.getNome(),jogo.getPreco(),jogo.getPlataforma(),jogo.getVersao()});
=======
            model.addRow(new Object[]{jogo.getNome(),jogo.getPreco(),jogo.getPlataforma(), jogo.getVersao()});
>>>>>>> bdd64aaf3ff243fd55aac5f977f6a3075d6db4e7
        
        }
    
    }

    public void adicionar(Jogo jogo) {
        itens.add(jogo);
    }

    public void remover(Jogo jogo) {
        itens.remove(jogo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Jogo jogo : itens) {
            total += jogo.getPreco();
        }
        return total;
    }
    
    public boolean temJogoDigital() {
    for (Jogo jogo : itens) {
        if (jogo instanceof JogoDigital) {
            return true;
        }
    }
    return false;
    }
    
    public boolean temJogoFisico() {
    for (Jogo jogo : itens) {
        if (jogo instanceof JogoFisico) {
            return true;
        }
    }
    return false;
    }

    public void limpar() {
        itens.clear();
    }
    
    public ArrayList<Jogo> getItens() {
    return itens;
    }
}
