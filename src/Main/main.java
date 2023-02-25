package Main;

import Bean.Person;


public class main {

	public static void main(String[] args) {
		
	
   Person pb=new Person.PersonBuilder().SetName("Qerib").SetSurname("Kerimli").SetGender("Kisi").Build();
   System.out.print(pb.GetName()+pb.GetSurname()+pb.GetGender());
	}

}
