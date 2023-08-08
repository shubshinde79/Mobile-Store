package Mobile;

import java.util.*;
class Mobile {
	public void mobile()
	{
		System.out.println("WE HAVE THREE OPTIONS IN MOBILE");
		System.out.println("-=-=-=-=-=-=-=-");
		
		System.out.println("press 1 for Android ");
		System.out.println("press 2 for I-PHONE");
		System.out.println("press 3 for KEY-PAD PHONES");
		 Scanner i1 =new Scanner(System.in);
		 int j =i1.nextInt();
		 if(j==1) {
			 Android A1=new Android();
			 A1.android();
		 }
		 else if(j==2) {
			 IOS io1=new IOS();
			 io1.ios();
		 }
		 else if(j==3) {
			 KEYPAD kp=new KEYPAD();
			 kp.keypad();
		 }		 
	}
}
class Android extends Mobile{
	public void android(){
		System.out.println("WELCOME TO ANDROID");
		Brand u1=new Brand();
		u1.brand();		
	}
}
class IOS extends Mobile{
	public void ios() {
		System.out.println("WELCOME TO IOS");
		IO u2=new IO();
		u2.io();
		
		
	}
}
class KEYPAD extends Mobile{
	public void keypad(){
		System.out.println("WELCOME TO KEY-PAD PHONES");
		Key u3=new Key();
		u3.key();
	}
}







class Brand extends Android{
	public void brand(){
		System.out.println("+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("YOU SELECT ANDROID");
		System.out.println("press 1 for Samsung");
		System.out.println("press 2 for Redmi");
		System.out.println("press 3 for Oppo");
		System.out.println("press 4 for Vivo");
		System.out.println("press 5 for Realme");
		Scanner sc =new Scanner(System.in);
		int p =sc.nextInt();
		if (p==1){
		System.out.println("WELCOME TO Samsung");
		Samsung s1=new Samsung();
		s1.SAM();}
		else if(p==2){
			System.out.println("WELCOME TO Redmi");
			Redmi r1=new Redmi();
			r1.REM();}
		else if (p==3) {
			System.out.println("WELCOME TO Oppo");
			Oppo o1=new Oppo();
			o1.OPP();}
		else if (p==4) {
			System.out.println("WELCOME TO Vivo");
            Vivo v1=new Vivo();
			v1.VIV();}
		else if (p==5) {
			System.out.println("WELCOME TO Realme");
			Realme r2=new Realme();
			r2.REA();}
	}
}
class Samsung extends Brand{
	public void SAM() {
		System.out.println("YOU SELECT SAMSUNG");
		System.out.println("-------------------------------");
		System.out.println("press 1 FOR Samsung S21");
		System.out.println("press 2 FOR Samsung A 53");
		System.out.println("press 3 FOR Samsung M 53");
		System.out.println("press 4 FOR Samsung Z fold 3");
		System.out.println("press 5 FOR Samsung F 13 ");
		Scanner sc =new Scanner(System.in);
		int h=sc.nextInt();
		if(h==1) {
			System.out.println("------------------------");
			S21 w1=new S21();
			w1.s21();}
		else if (h==2) {
			System.out.println("----------------------------");
			A53 w2=new A53();
			w2.a53();}
		else if(h==3) {
			System.out.println("----------------------------");
			M53 w3=new M53();
			w3.m53();}
		else if(h==4) {
			System.out.println("---------------------------------");
			ZFOLD w4=new ZFOLD();
			w4.zfold();}
		else if(h==5) {
			System.out.println("-------------------------------");
			F13 w5=new F13();
			w5.f13();}
	}
}
class S21 extends Brand{
	public void s21() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Samsung S 21");
		System.out.println("------------------------------------");
		System.out.println("Price :- 59,000/- ");
		System.out.println("Colour :- Green / Black / Yellow ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");

	}
}

class A53 extends Brand{
	public void a53() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Samsung A 53");
		System.out.println("------------------------------------");
		System.out.println("Price :- 31,000/- ");
		System.out.println("Colour :- Gold / Black / White ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}

class M53 extends Brand{
	public void m53(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Samsung M 53");
		System.out.println("------------------------------------");
		System.out.println("Price :- 29,000/- ");
		System.out.println("Colour :- White / Black / Blue ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}

class ZFOLD extends Brand{
	public void zfold() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Samsung Z Fold 3");
		System.out.println("------------------------------------");
		System.out.println("Price :- 1,46,000/- ");
		System.out.println("Colour :- White / Black / Gold / Sky Blue ");
		System.out.println("RAM :- 12 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");

		
	}
}
class F13 extends Brand{
	public void f13() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Samsung  F 53");
		System.out.println("------------------------------------");
		System.out.println("Price :- 16,999/- ");
		System.out.println("Colour :- Black / Gold / Sky Blue ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 64 GB ");
		System.out.println(" Thanks For Visit !!!!!");

	}
}
 class Redmi extends Brand{
	 public void REM() {
		 System.out.println("_*_*__*_*_*_*_*_*_*_*_*");
		 System.out.println("you selected Redmi");

		 System.out.println("press 1 for Redmi S 10 ");
		 System.out.println("press 2 for Redmi NOTE 11 ");
		 System.out.println("press 3 for Redmi 9");
		 System.out.println("press 4 for Redmi K 50 i");
		 System.out.println("press 5 for Redmi 12 Pro ");
		 Scanner sc =new Scanner(System.in);
		 int c=sc.nextInt();
		 if(c==1) {
			 System.out.println("-------------------------");
			 S10 l =new S10();
			 l.s10();
		 }
		 if(c==2) {
			 System.out.println("-------------------------");
			 NOTE11 l1 =new NOTE11();
			 l1.note11();
		 }
		 if(c==3) {
			 System.out.println("-------------------------");
			 R9 l2 =new R9();
			 l2.r9();
		 }
		 if(c==4) {
			 System.out.println("-------------------------");
			K50  l3 =new K50();
			 l3.k50();
		 }
		 if(c==5) {
			 System.out.println("-------------------------");
			 P12 l4 =new P12();
			 l4.p12();
		 }
	 }
 }
 class S10 extends Redmi{
	 public void s10() {
		 System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("You Select Model Redmi S 10");
			System.out.println("------------------------------------");
			System.out.println("Price :- 14,999/- ");
			System.out.println("Colour :- Green / Black / Yellow ");
			System.out.println("RAM :- 6 GB");
			System.out.println("Rom :- 64 GB ");
			System.out.println(" Thanks For Visit !!!!!");	 
	 }
 }
		 
 class NOTE11 extends Redmi{
	 public void note11(){
		 System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("You Select Model Redmi Note 11");
			System.out.println("------------------------------------");
			System.out.println("Price :- 16,999/- ");
			System.out.println("Colour :- White / Black / Blue ");
			System.out.println("RAM :- 6 GB");
			System.out.println("Rom :- 128 GB ");
			System.out.println(" Thanks For Visit !!!!!");

		 
	 }
 }
class R9 extends Redmi{
	public void r9() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Redmi 9");
		System.out.println("------------------------------------");
		System.out.println("Price :- 10,999/- ");
		System.out.println("Colour :- White / Mat Black / Blue ");
		System.out.println("RAM :- 4 GB");
		System.out.println("Rom :- 64 GB ");
		System.out.println(" Thanks For Visit !!!!!");

	}
}

class K50 extends Redmi{
	public void k50(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Redmi K 50");
		System.out.println("------------------------------------");
		System.out.println("Price :- 30,990/- ");
		System.out.println("Colour :- White / Green / Blue ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");

		
		
		
	}
}
class P12 extends Redmi{
	public void p12() {
	    System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Redmi 12 Pro");
		System.out.println("------------------------------------");
		System.out.println("Price :- 48,990/- ");
		System.out.println("Colour :- White / Green / Blue / Black ");
		System.out.println("RAM :- 12 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}
class Oppo extends Brand{
	public void OPP() {
		System.out.println("YOU SELECT Oppo");
		System.out.println("press 1 for Oppo R 17 Pro");
		System.out.println("press 2 for Oppo Reno 8 Pro");
		System.out.println("press 3 for Oppo F3 Plus");
		System.out.println("press 4 for Oppo Reno 8");
		System.out.println("press 5 for Oppo F5");
		Scanner e =new Scanner(System.in);
		int q= e.nextInt();
		if(q==1) {
			System.out.println("-------------------");
			R17 b=new R17();
			b.r17();
		}
		if(q==2) {
			System.out.println("-------------------");
			R8 b1=new R8();
			b1.r8();
		}
		if(q==3) {
			System.out.println("-------------------");
			F3 b2=new F3();
			b2.f3();
		}
		if(q==4) {
			System.out.println("-------------------");
			RE8 b3=new RE8();
			b3.re8();
		}
		if(q==5) {
			System.out.println("-------------------");
			F5 b4=new F5();
			b4.f5();
		}
	}
}

class R17 extends Oppo{
	public void r17() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Oppo R 17 Pro");
		System.out.println("------------------------------------");
		System.out.println("Price :- 49,990/- ");
		System.out.println("Colour :- Green / Black / Yellow ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}
class R8 extends Oppo{
	public void r8() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Oppo Reno 8 Pro");
		System.out.println("------------------------------------");
		System.out.println("Price :- 45,999/- ");
		System.out.println("Colour :- White / Black / Blue ");
		System.out.println("RAM :- 12 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}
class F3 extends Oppo{
	public void f3() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Oppo F3 Plus");
		System.out.println("------------------------------------");
		System.out.println("Price :- 30,999/- ");
		System.out.println("Colour :- White / Mat Black / Gold ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 64 GB ");
		System.out.println(" Thanks For Visit !!!!!");

	}
}

class RE8 extends Oppo{
	public void re8() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Oppo Reno 8 ");
		System.out.println("------------------------------------");
		System.out.println("Price :- 30,990/- ");
		System.out.println("Colour :- White / Green / Blue ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}
class F5 extends Oppo{
	public void f5(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Oppo F5");
		System.out.println("------------------------------------");
		System.out.println("Price :- 25,990/- ");
		System.out.println("Colour :-   Green / Blue / Black ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
}
class Vivo extends Brand{
	public void VIV() {
		System.out.println("----------------------");
		System.out.println("YOU SELECTED Vivo ");
		System.out.println("Press 1 for Vivo X 80 Pro");
		System.out.println("Press 1 for Vivo X 60");
		System.out.println("Press 1 for Vivo V23 Pro;");	
		System.out.println("Press 1 for Vivo Y75");
		System.out.println("Press 1 for Vivo T1");
		Scanner sc =new Scanner (System.in);
		int z= sc.nextInt();
		if(z==1) {
			System.out.println("----------------------");
			X80 y =new X80();
			y.x80();
		}
		if(z==2) {
			System.out.println("----------------------");
			X60 y1=new X60();
			y1.x60();
			
		}
		if(z==3) {
			System.out.println("----------------------");
			V23 y2=new V23();
			y2.v23();
		}
		if(z==4) {
			System.out.println("----------------------");
			Y75 y3=new Y75();
			y3.y75();
			
		}
		if(z==5) {
			System.out.println("----------------------");
			T1 y4=new T1();
			y4.t1();
			
		}
	}
}

class X80 extends Vivo{
	public void x80(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Vivo X80 Pro");
		System.out.println("------------------------------------");
		System.out.println("Price :- 79,990/- ");
		System.out.println("Colour :- Green / Black / Yellow / White ");
		System.out.println("RAM :- 12 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");
	}
				  
}
class X60 extends Vivo{
	public void x60(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Vivo X 60");
		System.out.println("------------------------------------");
		System.out.println("Price :- 50,999/- ");
		System.out.println("Colour :- White / Black / Blue ");
		System.out.println("RAM :- 12 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
		}
}
class V23 extends Vivo{
	public void v23(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Vivo V23");
		System.out.println("------------------------------------");
		System.out.println("Price :- 43,999/- ");
		System.out.println("Colour :- White / Mat Black / Gold ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
		}
}
class Y75 extends Vivo{
	public void y75(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Vivo Y 75 ");
		System.out.println("------------------------------------");
		System.out.println("Price :- 21,990/- ");
		System.out.println("Colour :- White / Green / Blue ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
		}
}

class T1 extends Vivo{
	public void t1(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Vivo T1");
		System.out.println("------------------------------------");
		System.out.println("Price :- 19,990/- ");
		System.out.println("Colour :-   Green / White / Black ");
		System.out.println("RAM :- 6 GB");
		System.out.println("Rom :- 64 GB ");
		System.out.println(" Thanks For Visit !!!!!");		
	}
}

class Realme extends Brand{
	public  void REA(){
		System.out.println("-----------------");
		System.out.println("YOU SELECTED Realme");
		System.out.println("___________________________");
		System.out.println("press 1 forRealme GT 2Pro");
		System.out.println("press 2 forRealme X 50 ");
		System.out.println("press 3 forRealme GT Neo 3 ");
		System.out.println("press 4 forRealme 9 Pro ");
		System.out.println("press 5 forRealme 9 Se");
		Scanner sc =new Scanner(System.in);
		int f=sc.nextInt();
		if(f==1) {
			System.out.println("----------------------------");
			GT2 g=new GT2();
			g.gt();
		}
		if(f==2) {
			System.out.println("----------------------------");
			X50 g1=new X50();
			g1.x50();
		}
		if(f==3) {
			System.out.println("----------------------------");
			GT3 g2=new GT3();
			g2.gt3();
		}
		if(f==4) {
			System.out.println("----------------------------");
			P9 g3=new P9();
			g3.p9();
		}
		if(f==5) {
			System.out.println("----------------------------");
			SE9 g4=new SE9();
			g4.se9();
		}
	}
}

class GT2 extends  Realme{
	public void gt() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Realme GT 2 Pro");
		System.out.println("------------------------------------");
		System.out.println("Price :- 57,990/- ");
		System.out.println("Colour :- Green / Black / Yellow / White ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");	
	}

	public void gt3() {
	System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	System.out.println("You Select Model Realme GT Neo 3");
	System.out.println("------------------------------------");
	System.out.println("Price :- 42,999/- ");
	System.out.println("Colour :- White / Mat Black / Gold ");
	System.out.println("RAM :- 8 GB");
	System.out.println("Rom :- 256 GB ");
	System.out.println(" Thanks For Visit !!!!!");
	}
}

class X50 extends Realme{
	public void x50() {System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	System.out.println("You Select Model Realme X 50");
	System.out.println("------------------------------------");
	System.out.println("Price :- 47,999/- ");
	System.out.println("Colour :- White / Black / Blue ");
	System.out.println("RAM :- 12 GB");
	System.out.println("Rom :- 256 GB ");
	System.out.println(" Thanks For Visit !!!!!");
		
	}
}
class  GT3 extends Realme{
	public void gt3() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Realme GT Neo 3");
		System.out.println("------------------------------------");
		System.out.println("Price :- 42,999/- ");
		System.out.println("Colour :- White / Mat Black / Gold ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 256 GB ");
		System.out.println(" Thanks For Visit !!!!!");
		
	}
	}

class P9 extends Realme{
	public void p9(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Realme 9 Pro ");
		System.out.println("------------------------------------");
		System.out.println("Price :- 28,999/- ");
		System.out.println("Colour :- White / Black / Blue ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");	
	}
}
class SE9 extends Realme{
	public void se9() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Model Realme 9 SE");
		System.out.println("------------------------------------");
		System.out.println("Price :- 22,990/- ");
		System.out.println("Colour :-   Green / White / Black ");
		System.out.println("RAM :- 8 GB");
		System.out.println("Rom :- 128 GB ");
		System.out.println(" Thanks For Visit !!!!!");
		}
}

public class driver2 {
	 static
	 {
		 System.out.println("Welcome To Mobile Store");
		 System.out.println("--------------------");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile i =new Mobile();
		i.mobile();
		Name ref =new Name();
		System.out.println("PLEASE ENTER YOUR NAME");
		Scanner sc =new Scanner(System.in);
		String name =sc.next();
		
		ref.setName(name);
		System.out.println("Your Entered Name Is:"+name);
		System.out.println("your phone will be delivered");
		
		
		
	}
}

class IO extends IOS{
	public void io(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("WELCOME TO IOS");
		System.out.println("press 1 for Iphone11");
		System.out.println("press 1 for Iphone11 Pro");
		System.out.println("press 1 for Iphone 12 ");
	    System.out.println("press 1 for Iphone13");
		System.out.println("press 1 for Iphone14");
		Scanner sc =new Scanner(System.in);
		int r =sc.nextInt();
		switch(r) {
		case 1:System.out.println("welcome to I phone 11");
		I11 s=new I11();
		s.i11();
		break;
		case 2:System.out.println("welcome to I phone 11 Pro");
		I11P s1=new I11P();
		s1.i11p();
		break;
		case 3: System.out.println ("welcome to I phone 12");
		I12 s2=new I12();
		s2.i12();
		break;
		case 4: System.out.println("welcome to I phone 13");
		I13 s3=new I13();
		s3.i13();
		break;
		case 5:System.out.println("welcome to I phone 14");
		I14 s4=new I14();
		s4.i14();
		}
	}
}

	
class I11 extends IO{
	public void i11() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Iphone 11 ");
		System.out.println("___________________________________");
		System.out.println("Price :- 41,000 ");
		System.out.println("Colour :- White / Rose");
		System.out.println(" RAM :- 6 GB");
		System.out.println("ROM :- 128 GB");
		System.out.println("Thanks For Visit !!!!!! ");
	}
}

class I11P extends IO{
	public void i11p() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Iphone 11 Pro ");
		System.out.println("___________________________________");
		System.out.println("Price :- 79,990 ");
		System.out.println("Colour :- Gold / Silver");
		System.out.println(" RAM :- 8 GB");
		System.out.println("ROM :- 128 GB");
		System.out.println("Thanks For Visit !!!!!! ");

	}
}


class I12 extends IO{
	public void i12(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Iphone 12 ");
		System.out.println("___________________________________");
		System.out.println("Price :- 55,990 ");
		System.out.println("Colour :- White / Blue / Green / Red");
		System.out.println(" RAM :- 8 GB");
		System.out.println("ROM :- 128 GB");
		System.out.println("Thanks For Visit !!!!!! ");

		
		
	}
}
class I13 extends IO{
	public void i13(){
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Iphone 13 ");
		System.out.println("___________________________________");
		System.out.println("Price :- 75,990 ");
		System.out.println("Colour :- White / Pink / Blue / Starlight / Midlight Black");
		System.out.println(" RAM :- 6 GB");
		System.out.println("ROM :- 128 GB");
		System.out.println("Thanks For Visit !!!!!! ");
		
		
	}
}

class I14 extends IO{
	public void i14() {
		
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Iphone 14 ");
		System.out.println("___________________________________");
		System.out.println("Price :- 1,29,000 ");
		System.out.println("Colour :- White / Silver");
		System.out.println(" RAM :- 12 GB");
		System.out.println("ROM :- 1 TB");
		System.out.println("Thanks For Visit !!!!!! ");
			}
}








class Key extends KEYPAD{
	public void key() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("YOU CHOOSE KEY-PAD PHONE");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("press 1 for Nokia");
		System.out.println("press 2 for itel");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		if(a==1) {
		System.out.println("welcome to Nokia");
		Nokia c1=new Nokia();
		c1.nok();
		}
		else if(a==2) {
			System.out.println("welcome to itel");
			ITEL c2=new ITEL();
			c2.itel();
			}
	}
}

class Nokia extends Key{
	public void nok() {
		System.out.println("YOU SELECT Nokia");
		System.out.println("-------------------------------");
		System.out.println("press 1 FOR Nokia 8210");
		System.out.println("press 2 FOR Nokia  105");
		System.out.println("press 3 FOR Nokia 5310");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		if(i==1) {
			N8210 e5=new N8210();
			e5.n8210();
		}
		if(i==2) {
			NO105 e6=new NO105();
			e6.no105();
		}
		if(i==3) {
			NOK e7=new NOK();
			e7.nok();
		
			
		}
	}
}
		
class N8210 extends Nokia{
	public void n8210() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Nokia 8210");
		System.out.println("___________________________________");
		System.out.println("Price :- 3,561 ");
		System.out.println("Colour :- White / Silver");
		System.out.println("3wireless :- FM-Radio");
		System.out.println("SIM :- DUAL");
		System.out.println("Thanks For Visit !!!!!! ");
		
		
	}
}
	
	
class NO105 extends Nokia{
	public void no105() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Nokia 105");
		System.out.println("___________________________________");
		System.out.println("Price :- 1,299 ");
		System.out.println("Colour :- White / Silver/BLACK");
		System.out.println("wireless :- FM-Radio");
		System.out.println("SIM :- SINGLE");
		System.out.println("Thanks For Visit !!!!!! ");

		
	}
}




class NOK extends Nokia{
	public void nok() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select Nokia 5310");
		System.out.println("___________________________________");
		System.out.println("Price :- 3,990 ");
		System.out.println("Colour :- White / Silver/BLACK");
		System.out.println("wireless :- FM-Radio");
		System.out.println("SIM :- DUAL");
		System.out.println("Thanks For Visit !!!!!! ");
		
	}
}

class ITEL extends Key{
	public void itel() {
		System.out.println("YOU SELECT ITEL");
		System.out.println("-------------------------------");
		System.out.println("press 1 FOR itel it2163");
		System.out.println("press 2 FOR itel it2173 ");
		Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		if(d==1) {
			IT2163 pp1=new IT2163();
			pp1.it2163();
		}
		if(d==2) {
			IL pp2=new IL();
			pp2.it2173();
		}	
	}
}
class IT2163 extends ITEL{
		public void it2163() {
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("You Select itel 2163");
			System.out.println("___________________________________");
			System.out.println("Price :- 2,990 ");
			System.out.println("Colour :- White / Silver/BLACK");
			System.out.println("wireless :- FM-Radio");
			System.out.println("SIM :- DUAL");
			System.out.println("Thanks For Visit !!!!!! ");
			
		}
	}

class IL extends ITEL{
	public void it2173() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("You Select itel 2173");
		System.out.println("___________________________________");
		System.out.println("Price :- 3,500 ");
		System.out.println("Colour :- White / Silver/BLACK");
		System.out.println("wireless :- FM-Radio");
		System.out.println("SIM :- DUAL");
		System.out.println("Thanks For Visit !!!!!! ");
	}
}
class Name{
	private String name;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
}
	
	


