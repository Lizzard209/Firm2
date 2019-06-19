
public class Staff {
	private StaffMember[] staffList;
	
	public Staff() {
		staffList = new StaffMember[2];
		
		staffList[0]= new Executive("Sam", "123 Main Line", "555-0469" , "123-45-6789" , 2423.07);
		
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		
		((Executive)staffList[0]).awardBonus(500.00);
		((Hourly)staffList[1]).addHours(40);
	}
public void payday() {
	double amount; 
	for(int count=0;count< staffList.length; count++) {
		
	System.out.print(staffList[count]);
	
			amount =staffList [count].pay();
			
			if (amount == 0.0)
				System.out.println("Thanks!");
			
			else
				System.out.println("Paid: " + amount);
			
			System.out.println("______________________________");
	}
}
}
