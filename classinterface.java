import java.util.ArrayList;

public interface classinterface {
	public ClassRoom createRooms(String proj,String ac, String ClsId, String noofsys, String faculty, String name);
	public ClassRoom searchClassRoom(int ClsId,ArrayList<ClassRoom> list);
	public ArrayList<ClassRoom> availabilityOfRooms(int noofsystems,ArrayList<ClassRoom> list);
	public void allocateClassRooms(int noofsystems);
	public ClassRoom[] displayAllClassRoom();
	

}

