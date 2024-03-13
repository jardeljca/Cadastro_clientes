package Entidades;

import java.util.HashMap;

import gui.ViewControler;
import javafx.scene.control.TextField;

public class Clientes {

    private HashMap<String, String> clientes = new HashMap<>();

    public void adicionarDados(TextField txtCpfCliente, TextField txtNomeCliente) {
        
        String cpf = txtCpfCliente.getText();
        String nome = txtNomeCliente.getText();

        if (!getClientes().containsKey(cpf)) {
            getClientes().put(cpf, nome);
            System.out.println("Dados adicionados com sucesso!");
        } else {
            System.out.println("CPF já está cadastrado. Dados não foram adicionados.");
        }
        System.out.println(getClientes());
    }
    
    public void buscarCliente(TextField txtCpfClienteBusca) {
    	String cpfBusca = txtCpfClienteBusca.getText();
    	
    	if(getClientes().containsKey(cpfBusca)) {
    		System.out.println(cpfBusca + getClientes().get(cpfBusca));

    	} else {
    		System.out.println("Esse CPF não consta em nossos registros");
    	}
    	
    }

	public HashMap<String, String> getClientes() {
		return clientes;
	}

	public void setClientes(HashMap<String, String> clientes) {
		this.clientes = clientes;
	}
}
