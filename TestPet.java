public class TestPet
{
	public static void main(String[] args)
	{
		Pet pet = new Pet("Peter");
		pet.bark();
	}
}
class Pet
{
	String name;
	public Pet(String name)
	{
		System.out.println("Pet name is " + name);
	}
	public void bark()
	{
		System.out.println("Peter says aw aw!");
	}
}