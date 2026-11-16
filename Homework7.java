abstract class Printer{
 public String model;
 public int printedCount;
 public int availableCount;
 public abstract boolean print(){}
}

class InkietPrinter extends Printer {
 public InkietPrinter(String model, int availableCount){
 this.model = model;
 this.availableCount = availableCount;
 }
 @override
 public boolean print() {
  if (availableCount == 0){
   printf(“모델명: %d매째 인쇄 실패 - 잉크 부족.”, printedCount);
   return false; 
  }
  else {
   printedCount++;
   availableCount--;
  }
 }
}


class LaserPrinter extends Printer {
 public LaserPrinter(String model, int availableCount){
  this.model = model;
  this.availableCount = availableCount;
  }
 @override
 public boolean print() {
  if (availableCount == 0){
   printf(“모델명: %d매째 인쇄 실패 - 토너 부족.”, printedCount);
   return false; 
  }
  else {
   printedCount++;
   availableCount--;
  }
 }
}



public class Homework7 { 
 public static void main(String[] args) { 
  InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500); 
  LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500); 
  while (inkjet.print()); 
  while (laser.print()); 
  } 
 }
}
