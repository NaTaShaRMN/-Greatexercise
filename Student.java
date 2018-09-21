

public class Student {
	private String name;
	private String id;
	private String group;
	private String email;
		public String getName()
		{
			return name;
		}
		public void setName(String n) {
			this.name = n;
		}
		public String getId()
		{
			return id;
		}
		public void setId(String n) {
			this.id = n;
		}
		public String getGroup()
		{
			return group;
		}
		public void setGroup(String n) {
			this.group = n;
		}
		public String getEmail()
		{
			return email;
		}
		public void setEmail(String n) {
			this.email = n;
		}
		public void getInfo() {
			System.out.println("Ho va ten       : "+ this.getName());
			System.out.println("Ma so sinh vien : "+this.getId());
			System.out.println("Lop             : "+this.getGroup());
			System.out.println("Email           : "+this.getEmail());
			System.out.println("*************************************************");
		}
		public Student() {
			this.name = "Student";
			this.id = "000";
			this.group = "K62/CF";
			this.email = "uet@vnu.edu.com";
			}
		public Student(String n,String id, String email) {
			this.name = n;
			this.id = id;
			this.email = email;
			this.group = "INT22041";
		}
		public Student(Student s) {
			this.name = s.name;
			this.id = s.id;
			this.group = s.group;
			this.email = s.email;
		}
		public  void setInfo() {
			String name;
			String mssv ;
			String lop ;
			String email ;
			System.out.print("nhap ten : ");
			name = StudentManagement.sr.nextLine();
			System.out.print("nhap mssv : ");
			mssv = StudentManagement.sr.nextLine();
			System.out.print("nhap ten lop: ");
			lop = StudentManagement.sr.nextLine();
			System.out.print("nhap email : ");
			email = StudentManagement.sr.nextLine();
			this.email = email;
			this.group = lop;
			this.id = mssv;
			this.name = name;
		}
		
		
}
