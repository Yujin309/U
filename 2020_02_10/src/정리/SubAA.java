package 정리;

class  SubAA extends AA{
	@Override
	void m1() {//#1, 6라고 하고 싶지만 #1번의 것을 가리고 있게 된다
		System.out.println("SubAA의 m1()");
	}
//	@Override overload
	void m1(double a) {//#6
		
	}
	
	void m1(int[] a) {//#7
		int sum=0;
		for( int data  : a   ) {
			sum+=data;
		}
		for( int data  : a   ) {
		    System.out.print(data+" ,");
		}
		
		System.out.println(sum);
	}
	void out() {
		m1();// this.m1();
		super.m1();
	}
}




