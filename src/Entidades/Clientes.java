package Entidades;

import java.util.HashMap;

import gui.ViewControler;
import gui.util.Alerts;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Clientes {

    private HashMap<String, String> clientes = new HashMap<>();

    public void adicionarDados(TextField txtCpfCliente, TextField txtNomeCliente) {
        
        String cpf = txtCpfCliente.getText();
        String nome = txtNomeCliente.getText();

        if (!getClientes().containsKey(cpf)) {
            getClientes().put(cpf, nome);
            Alerts.showAlert("Informação", null, "Dados do cliente cadastrado com sucesso!", AlertType.INFORMATION);
        } else {
            Alerts.showAlert("Erro", null, "CPF já está cadastrado. Dados não foram adicionados!", AlertType.ERROR);
        }
        System.out.println(getClientes());
    }
    
    public void buscarCliente(TextField txtCpfClienteBusca) {
    	String cpfBusca = txtCpfClienteBusca.getText();
    	
    	if(getClientes().containsKey(cpfBusca)) {
    		System.out.println(cpfBusca + getClientes().get(cpfBusca));

    	} else {
    		Alerts.showAlert("Erro", null, "Esse CPF não consta em nossos registros!", AlertType.ERROR);
    	}
    	
    }

	public HashMap<String, String> getClientes() {
		return clientes;
	}

	public void setClientes(HashMap<String, String> clientes) {
		this.clientes = clientes;
	}
}
