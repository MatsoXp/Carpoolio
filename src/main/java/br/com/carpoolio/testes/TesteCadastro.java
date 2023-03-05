package br.com.carpoolio.testes;

import br.com.carpoolio.Entity.StatusVeiculo;
import br.com.carpoolio.Entity.TipoVeiculo;
import br.com.carpoolio.Entity.Usuario;
import br.com.carpoolio.Entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.transaction.Status;

public class TesteCadastro {

	public static void main(String[] args) {
		//Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
		
		EntityManager em = null;
		
		
		try {
			em = Persistence.createEntityManagerFactory("carpoolio").createEntityManager();
		
			//cadastro de usu�rio
			
//			Usuario usuario = new Usuario();			
//			usuario.setNome("Matheus");
//			usuario.setEmail("teste123@gmail.com");
//			usuario.setSenha("12345");
//			usuario.setTelefone("999999999");
//			usuario.setCreditos(500);
			
			//cadastro de tipos de veiculos
			
//			TipoVeiculo tipoVeiculo = new TipoVeiculo();
//			tipoVeiculo.setDescricao("carro familiar");
//			
//			TipoVeiculo tipoVeiculo2 = new TipoVeiculo();
//			tipoVeiculo2.setDescricao("caminh�o");
			
			//cadastro status veiculo
			
//			StatusVeiculo statusVeiculo = new StatusVeiculo();
//			statusVeiculo.setDescricao("dispon�vel");
//			
//			StatusVeiculo statusVeiculo2 = new StatusVeiculo();
//			statusVeiculo2.setDescricao("alugado");
	
			
			
//			//cadastro de veiculo
			
			//recupera o status e tipo do banco atrav�s do indice para cadastrar no banco
//			StatusVeiculo consultaStatus = em.find(StatusVeiculo.class, 1);
//			TipoVeiculo consultaTipo = em.find(TipoVeiculo.class, 2);

//			Veiculo veiculo = new Veiculo();
//			veiculo.setTipo(consultaTipo);
//			veiculo.setStatus(consultaStatus);
//			veiculo.setPlaca("asd123");
//			veiculo.setCapacidade(5);
//			veiculo.setPrecoDiario(250);
			
			
			
			//cadastra no banco o objeto desejado
			
//			em.merge(usuario);
//			em.merge(tipoVeiculo);
//			em.merge(tipoVeiculo2);
//			em.merge(statusVeiculo);
//			em.merge(statusVeiculo2);
//			em.merge(tipoVeiculo);
//			em.merge(veiculo);
			
			
		
			
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			
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
