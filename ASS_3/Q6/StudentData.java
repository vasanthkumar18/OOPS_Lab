package pack1;
public class StudentData
{
        private String id;
        private String name;
        public void addStudentData(String id, String name)
        {
        	this.id=id;
        	this.name=name;
        }
        // use getter methods so that we can access private members for other packages
        public String getId()
        {
        	return id;
        }
        public String getName()
        {
        	return name;
        }
}

