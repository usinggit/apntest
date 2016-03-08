package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final int age;
    private final String name;

    public String getName() {
		return name;
	}

	public Greeting(long id, String content,int age,String name) {
        this.id = id;
        this.content = content;
        this.age = age;
        this.name=name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

	public int getAge() {
		return age;
	}
  
}