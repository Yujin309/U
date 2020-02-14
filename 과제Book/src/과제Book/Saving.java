package 과제Book;

public class Saving {
	

		private String name;// 이름
		private int year;// 기간
		private int month;// 월입금액
		private int principal;// 원금
		private int total;// 만기시 금액
		private int interest;// 이자액
		private static double rate = 0.02;// 이율
	//	private int num = 100;// 계좌번호
	//	private int numb = 1;// 계좌번호
		private String accountNumStr;//고객의 계좌번호 
		private static int count;//적금 계좌를 만드는 고객의 총 수 
		private final String branchCode="100-";//지점코드
		private int totalMoney;
		
		public Saving( ) {
		}
		public Saving(String name, int year, int month) {
			this.name = name;
			this.year = year;
			this.month = month;
			//++count;
	//	 String.format("", count);
			accountNumStr =
					branchCode+String.format("%03d", ++count);
			
				//100-001
				totalNum();
		}
		public void totalNum() {
			this.principal=year*month;
			this.interest=(int)(principal*rate);
			this.total=principal+interest;
		//	this.numb=numb++;	
		}
		public void output() {
			System.out.printf("계좌번호\t이름\t월입금액\t기간\t이율\t총액\t이자액\t만기시환급액\n");
			System.out.printf("%s\t%3s\t%6d\t%6d\t%6d\t%6d\t%6d\t%10d\n",
					                name,month,year,
					                                   (int)(rate*100),principal,(int)(principal*rate),total);
			System.out.println();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getPrincipal() {
			return principal;
		}

		public void setPrincipal(int principal) {
			this.principal = principal;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public int getInterest() {
			return interest;
		}

		public void setInterest(int interest) {
			this.interest = interest;
		}

		public static double getRate() {
			return rate;
		}

		public static void setRate(double rate) {
			Saving.rate = rate;
		}


		public int getTotalMoney() {
			return totalMoney;
		}

		public void setTotalMoney(int totalMoney) {
			this.totalMoney = totalMoney;
		}
		
	}


