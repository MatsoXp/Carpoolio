package br.com.carpoolio.testes;

import br.com.carpoolio.Entity.StatusVeiculo;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TesteConsulta {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
			
			//consulta usuario pelo indicine fornecido
//			Usuario consultaUsuario = em.find(Usuario.class, 1);
//					
//			if(consultaUsuario != null) {
//				System.out.println("ID: " + consultaUsuario.getId());
//				System.out.println("Nome: " + consultaUsuario.getNome());
//				System.out.println("Email: " + consultaUsuario.getEmail());
//				System.out.println("Senha: " + consultaUsuario.getSenha());
//				System.out.println("Telefone: " + consultaUsuario.getTelefone());
//				System.out.println("Créditos: " + consultaUsuario.getCreditos());
//			}else {
//				System.out.println("Usuário não encontrado");
//			}em.close();
			
			//consulta veiculo
//			Veiculo consultaVeiculo = em.find(Veiculo.class, 1);
//			
//			if(consultaVeiculo != null) {
//				System.out.println("ID: " + consultaVeiculo.getId());
//				System.out.println("Capacidade: " + consultaVeiculo.getCapacidade());
//				System.out.println("Placa: " + consultaVeiculo.getPlaca());
//				System.out.println("Preço diário: " + consultaVeiculo.getPrecoDiario());
//				System.out.println("Status: " + consultaVeiculo.getStatus().getDescricao());
//				System.out.println("Tipo: " + consultaVeiculo.getTipo().getDescricao());
//			}else {
//				System.out.println("Veículo não encontrado");
//			}em.close();
			
			
			
		}catch (Exception e) {
			if(em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
			System.exit(0);
		}
		
	}

}
