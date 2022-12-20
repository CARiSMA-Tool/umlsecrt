package example;

public class CloneClient {
	public CloneClient() {

		Teacher t1 = new Teacher("guddu", "22,nagar road");
//...
// Do some stuff to remove the teacher.
		Teacher t2 = (Teacher) t1.clone();
		System.out.println(t2.name);
	}

	public static void main(String[] args) {
		new CloneClient();
	}
}