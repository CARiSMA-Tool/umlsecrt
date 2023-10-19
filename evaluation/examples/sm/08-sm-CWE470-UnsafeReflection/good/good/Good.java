package good;

public class Good {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName("secret.Secret");
		Object instance = clazz.newInstance();
		System.out.println(instance.toString());
	}
}
