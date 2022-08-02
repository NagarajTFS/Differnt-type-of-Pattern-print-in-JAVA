public static void main(String[] args) {
		int i=4,j=8;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=5;j++) {
				System.out.print(1);
			}
			for(j=1;j<=i-1;j++) {
				System.out.print(1);
			}
			System.out.print("\n");
		}		
	}
