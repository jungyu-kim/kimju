package chap08;

public class DaoMain {

	public static void main(String[] args) {
		dbwork(new OracleDao());

	}

	private static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
		
		
		
	}

}
