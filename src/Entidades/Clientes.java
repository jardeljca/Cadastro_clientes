package Entidades;

import java.util.HashMap;

import gui.ViewControler;
import javafx.scene.control.TextField;

public class Clientes {

    HashMap<String, String> clientes = new HashMap<>();

    public void adicionarDados(TextField txtCpfCliente, TextField txtNomeCliente) {
        
        String cpf = txtCpfCliente.getText();
        String nome = txtNomeCliente.getText();

        if (!clientes.containsKey(cpf)) {
            clientes.put(cpf, nome);
            System.out.println("Dados adicionados com sucesso!");
        } else {
            System.out.println("CPF já está cadastrado. Dados não foram adicionados.");
        }
        System.out.println(clientes);
    }
    
    public void buscarCliente(TextField txtCpfClienteBusca) {
    	String cpfBusca = txtCpfClienteBusca.getText();
    	
    	if(clientes.containsKey(cpfBusca)) {
    		System.out.println(cpfBusca + clientes.get(cpfBusca));

    	} else {
    		System.out.println("Esse CPF não consta em nossos registros");
    	}
    	
    }
}
