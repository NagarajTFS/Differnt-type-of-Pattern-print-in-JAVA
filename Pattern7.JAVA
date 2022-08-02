public static void main(String[] args) {
		int i=5,j=5;
		for(i=1;i<=5;i++) {
			for(j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
			for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=5-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			}	
	}
