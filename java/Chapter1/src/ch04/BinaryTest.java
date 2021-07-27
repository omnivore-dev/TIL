package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010; // B는 식별자 Binary를 뜻한다.
		int oNum = 012;	// 8진수는 숫자 앞에 0을 넣어준다.
		int xNum = 0XA; // 16진수는 0X를 붙여준다.
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
