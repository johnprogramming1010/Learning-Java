public class CoinFlip{
public static void main(String[] args){

Coin myCoin = new Coin();

myCoin.flip();

System.out.println(myCoin);

if (myCoin.isHeadsup())
   System.out.println("You win!");
else
   System.out.println("better luck next time.");
   
  }
}