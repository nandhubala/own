
public class ClassRoom

{
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", ClsId=" + ClsId + ", noofsys=" + noofsys + ", proj=" + proj + ", ac=" + ac
				+ ", faculty=" + faculty + ", availability=" + availability + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClsId() {
		return ClsId;
	}

	public void setClsId(int clsId) {
		ClsId = clsId;
	}

	public int getNoofsys() {
		return noofsys;
	}

	public void setNoofsys(int noofsys) {
		this.noofsys = noofsys;
	}

	public boolean isProj() {
		return proj;
	}

	public void setProj(boolean proj) {
		this.proj = proj;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	private int ClsId;
	private int noofsys;
	private boolean proj;
	private boolean ac;
	private String faculty;
	private boolean availability;
	static int count;
	
	 static{
		 count=10;
		
	  } 
	 
	 ClassRoom()
	 {
		 
		 System.out.println(count);
		 count++;
	 }
	 }
	
	