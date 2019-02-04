package by.htp.ellib.service;

import by.htp.ellib.service.impl.ClientServiceImpl;
import by.htp.ellib.service.impl.LibraryServiceImpl;

public class ServiceProvider {
	
private static final ServiceProvider instance = new ServiceProvider();
	
	private final ClientService clientService = new ClientServiceImpl();
	private final LibraryService libraryService = new LibraryServiceImpl();
	
	private ServiceProvider() {}
	
	public ClientService getClientService() {
		return clientService;
	}
	
	public LibraryService getLibraryService() {
		return libraryService;
	}
	
	public static ServiceProvider getInstance() {
		return instance;
	}

}
