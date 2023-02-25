package Bean;

public final class Personrepeat {
private String name;
private String surname;
private String gender;

private Personrepeat(PersonBuilder pb) {
	this.name=pb.name;
	this.surname=pb.surname;
	this.gender=pb.gender;
	
}
public String GetName() {
	return name;
}
public String GetSurname() {
	return surname;
}
public String GetGender() {
	return gender;
}
public static class PersonBuilder{
	private String name;
	private String surname;
	private String gender;
	
	public PersonBuilder SetName(String name) {
	this.name=name;
	return this;
	}
	public PersonBuilder SetSurname(String surname) {
		this.surname=surname;
		return this;
	}
	public PersonBuilder SetGender(String gender) {
		this.gender=gender;
		return this;
	}
	public Personrepeat Builder() {
		return new Personrepeat(this);
	}
}
}
