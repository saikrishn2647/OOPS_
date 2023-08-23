package oops;

public class FaceBookMain {
	public static void main(String[] args) {
		FaceBook fb = new FaceBook();

		fb.login("saikrishna", "password123");
		fb.login(8555839617L, "phonepass456");
		fb.login("sai@gmail.com", "saikrishna7462", true);
	}
}
