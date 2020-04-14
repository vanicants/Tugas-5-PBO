public class Total {

	public static void main(String[] args){
		int[] angka = new int[80];

		int x = 1;
		//untuk memberi nilai pada tiap index
		for (int i = 0; i < angka.length; i++) {
			angka[i] = x;
			x++;
		}

		int total = 0;
		//untuk menjumlahkan nilai 1-80
		for (int i = 0; i < angka.length; i++) {
			total+=angka[i];
		}

		System.out.println(total);
	}

}