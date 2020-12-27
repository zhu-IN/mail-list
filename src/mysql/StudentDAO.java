
package mysql;
import java.util.*;

public interface StudentDAO {
	
	public boolean doCreate(Student student) throws Exception;
	
	public boolean doUpdate(Student student) throws Exception;
	
	public boolean doDelete(int sno) throws Exception;
	
	public Student findById(int sno) throws Exception;
	
	public List<Student> findAll(String keyWord) throws Exception;
}
