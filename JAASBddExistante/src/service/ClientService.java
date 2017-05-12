package service;

import java.util.Collection;

import dao.Dao;
import dao.IDao;
import metier.Client;

public class ClientService implements IClientService, IClientServiceVip {

	private IDao idao = new Dao();

	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		System.out.println("BONJOUR");

	}

	@Override
	public void direAurevoir() {
		// TODO Auto-generated method stub
		System.out.println("AU REVOIR");
	}

	@Override
	public void jesuisVip() {
		// TODO Auto-generated method stub
		System.out.println("JE SUIS VIP");
	}

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		idao.ajouterClient(c);
	}

	@Override
	public void modifierClient(int id, String nom, String prenom, String couleuryeux, int age, String password) {
		idao.modifierClient(id, nom, prenom, couleuryeux, age, password);

	}

	@Override
	public void supprimerClient(int id) {
		// TODO Auto-generated method stub
		idao.supprimerClient(id);
	}

	@Override
	public Collection<Client> listerClients() {
		// TODO Auto-generated method stub
		return idao.listerClients();
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
			return idao.chercherParMC(mc);
	}

	@Override
	public Client chercherClient(int id) {
		return idao.chercherClient(id);
	}

}
