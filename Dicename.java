import java.util.Scanner;
import java.util.Random;

class Exercise4 {
	public static void main(String[] args){
		Random rand = new Random();
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	String name;
	Scanner sc = new Scanner(System.in);
	a= rand.nextInt(6)+1;
	b= rand.nextInt(6)+1;
	c= rand.nextInt(6)+1;
	d= rand.nextInt(3)+1;
	System.out.println("What is name?");
	name = sc.nextLine();
	System.out.println("Hello, "+name+"!");
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " +a);
	System.out.println("Die 2: " +b);
	System.out.println("Die 3: " +c);
	System.out.println("Total value: " +(a+b+c));
	if((a+b+c) > 12){
	    System.out.println(name +" won");
	    System.out.println("やるやん!");
	    System.out.println("明日は俺にリベンジさせて");
	    System.out.println("では、どうぞ");
	}else{
	     System.out.println(name+" lose");
	    if(d == 1){
                 System.out.println("俺の勝ち!");
	         System.out.println("何で負けたか、明日まで考えといてください。");
	         System.out.println("そしたら何かが見えてくるはずです。");
	         System.out.println("ほな、いただきます。");
	    }else if(d == 2){
		 System.out.println("俺の勝ち!");
		 System.out.println("負けは次につながるチャンスです");
		 System.out.println("ネバーギブアップ!");
		 System.out.println("ほな、いただきます。");
	    }else{
		 System.out.println("俺の勝ち!");
		 System.out.println("たかがじゃんけん、そう思ってないですか?");
		 System.out.println("それやったら明日も、俺が勝ちますよ");
		 System.out.println("ほな、いただきます。");
	    }
	}
	
	
	
	}
}
