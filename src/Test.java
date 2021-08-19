
/*
 * HMB STAJ MÝNÝ PROJE 2
 * Bu program java dilinde heap,stack ve static memory
 * kullanýmlarýný göstermek amacýyla hazýrlanmýþtýr.
 * 
 * Test Class; Bu sýnýf heap,stack ve static memory kullanýmýný
 * göstermek için gerekli objeleri yaratýr ve deðerlerini yazdýrýr.
 * 
 *  @author ElifnurBenhür
 */
import java.util.*;
public class Test {
 public static void main(String[] args) {
	 /*
	  * @param x  primitive türde bir deðiþkendir.
	  * Bu deðiþken "stack memory" kapsamýnda 5 deðerini tutar.
	  * 
	  */
	 int x=5;
	 /*
	  * "new" anahtar kelimesi "heap memory" de 
	  * 5 deðeri ile baþlatýlmýþ bir integer objesi yaratýr.
	  * bir obje yaratýr ve 
	  * @param i oluþturulan objenin adresini 
	  * "stack memory" de tutar.
	  */
	 Integer i=new Integer(5);
	 /*
	  * Devam eden kod, new anahtar kelimesi ile üç adet
	  * @see Memory objesi yaratýr.
	  */
	 Memory m1=new Memory();
	 Memory m2=new Memory();
	 Memory m3=new Memory();
	 /*
	  * Devam eden kod, m3 objesinin 
	  * @param objectCount ve @param oCount 
	  * deðiþkenlerinin tuttuðu deðerleri yazdýrýr.
	  */
	 System.out.println(""+m3.getObjectCount()+" "+m3.getoCount());
	 /*
	  * "Garbage Collector" 'u çaðýrýr. Böylelikle m3 objesi
	  * "heap memory" den silinmiþ olur. 
	  */
	 m3.finalize();
	 /*
	  * Devam eden kod, m3 objesinin 
	  * @param objectCount ve @param oCount 
	  * deðiþkenlerinin tuttuðu deðerleri yazdýrýr.
	  * m3 objesi "heap" memory den silindiði halde
	  *  @parameter objectCount statik bir deðiþken olduðu ve 
	  *  hafýzada baþka bir kýsýmda tutulduðu için hala 
	  *  3 deðerini tutar.
	  */
	 System.out.println(""+m2.getObjectCount());
 }
}