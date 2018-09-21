import java.util.*;
public class StudentManagement {
	public static Scanner sr = new Scanner(System.in);
	
	
	private static List<Student> mains = new LinkedList<Student>();
	public static boolean sameGroup(Student s1,Student s2) {
		if (s1.getGroup().equals(s2.getGroup())) return true;
		return false;
	}
	public static boolean StudentByGroup(Student tuan,String s)
	{
		if (tuan.getGroup().equals(s)) return true;
		return false;
	}
	public static void PrintByGroup() {
		
		HashSet<String> hs = new HashSet<String>();
		//s = new Student[n];
		for (int i=0;i<mains.size();i++)
		{
			hs.add(mains.get(i).getGroup());
			
		}
		for (String str : hs) {
			
			System.out.println("-----HOC SINH LOP "+ str + "-----");
			for (int i=0;i<mains.size();i++) {
				if (str.equals(mains.get(i).getGroup()))  
					System.out.println(mains.get(i).getName());
			}
		}
	}
	public static void removeStudent(String id) {
		
		for (int i=0;i<mains.size();i++) {
			if (id.equals(mains.get(i).getId()))   
				mains.remove(i);
		}
		
	}
	public static  void main(String[] args) {
		
		System.out.print("nhap so sinh vien : ");
		int n = sr.nextInt();
		sr.nextLine();
		//ArrayList<Student> mains = new ArrayList<Student>();

		
		for (int i=0;i<n;i++) {
			Student temp =new Student();
			temp.setInfo();
			mains.add(temp);
		}
		System.out.println("=======DANH SACH HOC SINH VUA NHAP=======");
		for (int i = 0;i<n;i++)
		{
			mains.get(i).getInfo();
		}
		System.out.print("Nhap ID sinh vien ban muon xoa : ");
		String delete = sr.nextLine();
		removeStudent(delete);
		PrintByGroup();
		sr.close();
	}
		
}
