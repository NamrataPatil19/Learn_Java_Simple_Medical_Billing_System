package Program;
import java.util.Scanner;

public class Shop {
	
	int cb, cr,mb,mr,pb,pr;
	int p1,p2,p3,r1,r2,r3;
	int total,total_bill,return_bill,cashback;
	
	Scanner sc=new Scanner(System.in);
	
	void combiflam() {
		
	System.out.println("If you want medicine type quantity of medicine else type 0 ");	
    cb = sc.nextInt();
	
    System.out.println("If you return medicine type quantity of medicine else type 0");
    cr = sc.nextInt();
    
	if(cb>0)
		{
			p1 = ( cb*10);
			System.out.println("Combiflame:"+p1);
		}
	else
	    {
		   r1 = (cr*10);
		   System.out.println("Combiflam:"+r1);
	    }
	
	System.out.println("\n*****************************************************\n");
	
	}
	
	void multiVitamin() {
		
	System.out.println("If you want medicine type quantity of medicine else type 0 ");		
    mb = sc.nextInt();
    
    System.out.println("If you return medicine type quantity of medicine else type 0");
    mr = sc.nextInt();
	
	if(mb>0)
    	{
		    p2= (mb*15);
		    System.out.println("MultiVitamin:"+p2);
	    }
	else
	    {
		    r2 = (mr*15);
		    System.out.println("MultiVitamin:"+r2);
	    }
	
	System.out.println("\n*******************************************************\n");
	
	}
	
	void paracetmol() {
		
	System.out.println("If you want  medicine type quantity of medicine else type 0 ");	
	pb = sc.nextInt();	
	
	System.out.println("If you return medicine type quantity of medicine else type 0");
	pr = sc.nextInt();
		
	if(pb>0)
	    {
		    p3= (pb*5);
		    System.out.println("paracetmol:"+p3);
	    }
	else
    	{
		    r3= (pr*5);
		    System.out.println("paracetmol:"+r3);
	    }
	
	System.out.println("\n***************************************************************************\n");
	
    }
		
	
	void bill(){
		
		System.out.println("\t\t\t***Wel-Come***\t\t\t");
		System.out.println("Products \tBuy \t \tReturn \t \tPrice \t \tReturnP");
		System.out.println("Combiflam " +  "\t(" + cb + ")\t"+"\t("+cr+")\t\t"+ p1+"\t\t("+r1+")\t");
		System.out.println("MultiVitamine "+"\t (" + mb + ")\t"+"\t("+mr+")\t\t" +p2+"\t\t("+r2+")\t");
		System.out.println("Paracetmol " + "\t (" + pb + ")\t " + "\t("+pr+")\t\t" + p3+"\t\t("+r3+")\t");
		System.out.println("\n*******************************************************************************\n");
		
		total=p1+p2+p3;
		System.out.println("Bill:"+total);
		
		return_bill=r1+r2+r3;
		System.out.println("Return_Bill:"+return_bill);
	}
	
	void total_bill() {
		
		total_bill = total-return_bill;
		
		if(total_bill<0)
		{
			cashback= total_bill*(-1);
			System.out.println("CashBack:"+cashback);
		}
		else
		{
		    System.out.println("Total Bill : "+total_bill);
		}
    
	}
	
public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);	
		System.out.println("\t\t\t***Welcome***\n");
		
		
		Shop ms=new Shop();
		ms.combiflam();
		ms.multiVitamin();
		ms.paracetmol();
		ms.bill();
		ms.total_bill();
		
	}


}
