package mysql;

public class DAOfactory {
	public static StudentDAO getStudentDAOInstance(){
		return new StudentDAOProxy();
	}
}
