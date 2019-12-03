/*
Å¬·¡½º
- ³ª: À½½Ä °´Ã¼¸¦ ¸ÔÀ» ¼ö ÀÖÀ½.
- ÇÜ¹ö°Å
- ¾ÆÀÌ½ºÅ©¸²
- ºù¼ö
- ±è¹ä
*/

class EatTest{
	public static void main(String [] args){
		//³»°¡ À½½Ä ¸Ô±â
		I i = new I();
		Hamburger h = new Hamburger();
		
		i.eat(h);
		i.eat(new IceCream());
		i.eat(new Stone());
	}
}

class Food{
	String name;
}
class Hamburger extends Food{
	Hamburger(){
		super.name = "ÇÜ¹ö°Å";
	}
}
class Bing extends Food{
	Bing(){
		super.name = "ºù¼ö";
	}
}
class IceCream extends Food{
	IceCream(){
		super.name = "¾ÆÀÌ½ºÅ©¸²";
	}
}
class Kim extends Food{
	Kim(){
		super.name = "±è¹ä";
	}
}
class Stone{}

class I{

	void eat(Object o){
		if(o instanceof Food) System.out.println(((Food)o).name + "(À»)¸¦ ¸Ô¾ú½À´Ï´Ù.");
		else System.out.println("À½½Ä¸¸ ¸Ô´Â´Ù¤Ñ¤Ñ");
			
	}
}