import java.util.Scanner;
import java.util.ArrayList;

public class ClsDemo {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		ClassRoom[] arrayOfClassRoom = null;
		ClassRoom c = new ClassRoom();
		ArrayList<ClassRoom> list=new ArrayList<ClassRoom>();
		
		System.out.println("number of objects:" + c.count);

		while (true) {
			System.out.println("Please enter option 1 to add new room" + " option 2 to search the rooms"
					+ " option 3 to display all the rooms" + " option 4 to allocate the room"
					+ " option 5 to exit the application");
			String option = scr.next();
			ClassRoomimpl mainClassRoomObj = new ClassRoomimpl();
			switch (option) {
			case "1":
				System.out.println("please enter total number of rooms");
				String noofrooms = scr.next();
				arrayOfClassRoom = new ClassRoom[Integer.parseInt(noofrooms)];

				 {
					System.out.println("please enter the classroom name");
					String name = scr.next();
					System.out.println("please enter Classroom Id");
					String ClsId = scr.next();
					System.out.println("please enter Number of systems");
					String noofsys = scr.next();
					System.out.println("Availability of projector");
					String proj = scr.next();
					System.out.println("Availability of AC");
					String ac = scr.next();
					System.out.println("The name of the faculty");
					String faculty = scr.next();
					System.out.println("Availability of room");
					String avail = scr.next();
					
					ClassRoom room= mainClassRoomObj.createRooms(proj, ac, ClsId, noofsys, faculty, name);
					list.add(room);
				break;
				 }
			case "2":
				System.out.println("please enter the room id:");
				String ClsId = scr.next();
				System.out.println(mainClassRoomObj.searchClassRoom(Integer.parseInt(ClsId), list));
				
			case "3":
				for (ClassRoom roomObj:list)
					System.out.println(roomObj);
				break;
			case "4":
				System.out.println("Specify the total number of systems needed");
				String noofsys = scr.next();
				System.out.println("number of rooms");
				String noOfRoomsNeeded = scr.next();
				ArrayList<ClassRoom> availableRooms = mainClassRoomObj.availabilityOfRooms(Integer.parseInt(noofsys),list);
				
			if(availableRooms.size()>=Integer.parseInt(noOfRoomsNeeded));
						for(ClassRoom avlRooms:availableRooms)
						{
							for(ClassRoom roomfromMainList:list) {
								if(avlRooms.getClsId()==roomfromMainList.getClsId())
								{
									System.out.println("Please enter faculty name");
									String  faculty=scr.next();
									roomfromMainList.setFaculty(faculty);
									roomfromMainList.setAvailability(false);
									break;
								}else 
									System.out.println("Don't have enough rooms");
							}
						}
			
			
			
			case "5":
				System.exit(0);

			
		}
		}
	}
	}

