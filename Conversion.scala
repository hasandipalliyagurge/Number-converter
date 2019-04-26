object Conversion{
	def main(args: Array[String]){
		 print("Enter your base : ");
		 var w = scala.io.StdIn.readInt();
		 print("Enter your Number : ");
		 var num =scala.io.StdIn.readLine();

		 w match{
		 	case 10 => dectobin(num); dectooct(num);dectohex(num);
		 	case 2 => bintodec(num); bintooct(num); bintohex(num);
		 	case 8 => octtobin(num); octtodec(num); octtohex(num);
		 	case 16 =>hextodec(num); hextobin(num); hextooct(num);
		 }



	}
	def bintodec(num:String){
		var x =Integer.parseInt(num,2);
		println("Decimal : "+x);
	}
	def bintooct(num:String){
		var x =Integer.parseInt(num,2);
		dectooct(x.toString);
	}
	def bintohex(num:String){
		var x =Integer.parseInt(num,2);
		dectohex(x.toString);
	}
	def dectobin(num:String){
		var n = num.toInt;
		var x = n.toBinaryString;
		println("Binary : "+x);
	}
	def dectooct(num:String){
		var n = num.toInt;
		var x = n.toOctalString;
		println("Octal : "+x);
	}
	def dectohex(num:String){
		var n = num.toInt;
		var x = n.toHexString;
		println("Hexadecimal : "+x);
	}
	def octtodec(num:String){
		var x =Integer.parseInt(num,8);
		println("Decimal : "+x);

	}
	def octtobin(num:String){
		var x =Integer.parseInt(num,8);

		dectobin(x.toString);
	}
	def octtohex(num:String){
		var x =Integer.parseInt(num,8);
		dectohex(x.toString);
	}
	
	def hextodec(num:String){
		var x =Integer.parseInt(num,16);
		println("Decimal : "+x);

	}
	def hextooct(num:String){
		var x =Integer.parseInt(num,16);
		dectooct(x.toString);
	}
	def hextobin(num:String){
		var x =Integer.parseInt(num,16);
		dectobin(x.toString);
	}
	
}

