package by.pvt.treasure.dao;
	
	public final class DAOFactory {
		
		private static final DAOFactory instance = new DAOFactory();    
		
		private final TreasureDAO DbTreasureImpl = new DbTreasureDAO();  
		    
		
		private DAOFactory(){
			
		}    
		
		public static DAOFactory getInstance(){
			return instance;  
			}

		public TreasureDAO getDbTreasureImpl() {
			return DbTreasureImpl;
		}   
		
	
		
		
} 


