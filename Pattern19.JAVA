	public static void main(String[] args) {
		char word[]= {'P','R','O','G','R','A','M'};
		int i=6,j;
                for(i=0;i<=6;i++) {
			for(j=0;j<=6;j++) {       
				if(i==0||j==0||j==6||i==6) {					
					System.out.print(word[j]);		
				}
					else {
						System.out.print(" ");	
					}
				}
				System.out.print("\n");
			}
		
		}
