package br.com.fiap.model.login;

import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args) {
		
		
		String registroUsuario = JOptionPane.showInputDialog("Digite o seu usuario para ser cadastrado.");
		String registroSenha = JOptionPane.showInputDialog("Digite o seu senha para ser cadastrado.");
		
		
		 String usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
		 String senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
		 int contador = 1;
	
		while (!senha.equals(registroSenha)||(!usuario.equals(registroUsuario) && contador<=2)) {
			JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
			JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (3 - contador));
			contador++;
			usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
			senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
			
		}if(senha.equals(registroSenha)) {
			JOptionPane.showMessageDialog(null,"Acesso liberado");
		}else {
			JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
		}
		 
		
		
	}
	
}
