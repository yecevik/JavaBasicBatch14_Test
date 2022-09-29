package Study;

public class WhileLoop {

	public static void main(String[] args) {

		int a = 50;

		while (a >= 20) {
			System.out.println(a);
			a--;
		}

		System.out.println("-----------");

		int i = 1;

		while (i <= 20) {
			System.out.print(i + 1);
			i += 2;
		}

		System.out.println("-----------");

		int q = 100;
		while (q >= 1) {
			System.out.print(q + " ");
			q--;
		}

		System.out.println("-----------");

		int w = 20;
		while (w <= 200) {
			System.out.print(w + " ");
			w += 2;
		}

		System.out.println("-----------");

		int e = 99;
		while (e >= 1) {
			System.out.print(e + " ");
			e -= 1;
		}

		System.out.println("-----------");

		int r = 99;
		while (r >= 1) {
			if (r % 2 != 0) {
				System.out.print(r + " ");}
				r -= 1;
			

		}
	}
}