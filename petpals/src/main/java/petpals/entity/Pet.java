package petpals.entity;

public class Pet {
	private String name;
    private int age;
    private String breed;
    private String dogBreed;
    private String catColor;
    public Pet(String name, int age, String breed,String dogBreed,String catColor) {
        if (age <= 0) throw new IllegalArgumentException("Age must be positive.");
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.dogBreed = dogBreed;
        this.catColor = catColor;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Pet [Name=" + name + ", Age=" + age + ", Breed=" + breed + ", Dog breed=" + dogBreed+ ", Cat color="+ catColor+"]";
    }

	public String getDogBreed() {
		// TODO Auto-generated method stub
		return dogBreed;
	}
	public void setDogBreed(String dogBreed) {
		// TODO Auto-generated method stub
		this.dogBreed=dogBreed;
	}
	public String getCatColor() {
		// TODO Auto-generated method stub
		return catColor;
	}
	public void setCatColor(String catColor) {
		// TODO Auto-generated method stub
		this.catColor=catColor;
	}
}
