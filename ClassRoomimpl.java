import java.util.ArrayList;


public class ClassRoomimpl implements classinterface {

	@Override
	public ClassRoom createRooms(String proj, String ac, String ClsId, String noofsys, String faculty, String name) 
	{
		ClassRoom cls = new ClassRoom();
		cls.setName(name);
		cls.setClsId(Integer.parseInt(ClsId));
		cls.setNoofsys(Integer.parseInt(noofsys));
		cls.setProj(Boolean.parseBoolean(proj));
		cls.setAc(Boolean.parseBoolean(ac));
		cls.setFaculty(faculty);
		cls.setAvailability(true);
		return cls;
	}

	@Override
	public ClassRoom searchClassRoom(int ClsId, ArrayList<ClassRoom> list) {
		for (ClassRoom room : list) {
			if (room.getClsId() == ClsId) {
				return room;
			}
		}
		return null;
	}

	@Override
	public void allocateClassRooms(int noofsystems) {
		// TODO Auto-generated method stub

	}

	public ArrayList<ClassRoom> availabilityOfRooms(int noofsys, ArrayList<ClassRoom> list) {

		ArrayList<ClassRoom> availablerooms = new ArrayList<ClassRoom>();
		for (ClassRoom room : list) {
			if (room.getNoofsys() >= noofsys && room.isAvailability() == true) {
				availablerooms.add(room);

			}
		}
		return availablerooms;
	}

	@Override
	public ClassRoom[] displayAllClassRoom() {
		// TODO Auto-generated method stub
		return null;
	}

}
