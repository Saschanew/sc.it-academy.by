package by.pvt.treasure.service;

public final class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();    
	
	private final TreasureService treasureServiceImpl = new TreasureServiceImpl();  


	private ServiceFactory(){
		
	}    
	
	public static ServiceFactory getInstance(){
		return instance;  
		}
    
	
	public TreasureService getTreasureServiceImpl() {
		return treasureServiceImpl;
	}
	

	
	
} 
