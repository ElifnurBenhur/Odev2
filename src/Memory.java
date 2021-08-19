
/*
 * HMB STAJ MÝNÝ PROJE 2
 * Bu program java dilinde heap,stack ve static memory
 * kullanýmlarýný göstermek amacýyla hazýrlanmýþtýr.
 * 
 * Memory Class; Bu sýnýf static deðiþkenlerin hafýzada ki kullanýmýný
 * ve diðer deðiþkenlerden farkýný göstermek için gerekli deðiþkenleri
 * tanýmlar ve baþlatýr.
 * 
 *  @author ElifnurBenhür
 */
public class Memory {
	/*
	 * @param objectCount integer türünde statik bir deðiþkendir.
	 */
	private static int objectCount=0;
	/*
	 * @param oCount integer türünde  bir deðiþkendir.
	 */
	private int oCount;
	/*
	 * Kod bloðu,
	 * @param objectCount deðeri bir arttýrýlýr.
	 * @param objectCount statik bir deðiþken olduðu için
	 * @param oCount aksine "stack memory" de deðil "non-heap memory"
	 * 'nin Permagen kýsmýnda tutulur.
	 * Dolayýsýyla bu sýnýftan her obje örneði yaratýlýþýnda 
	 * deðeri bir artar. Yani Memory sýnýfýndan kaç obje yaratýldýðýnýn
	 * sayýsýný verir.
	 */
	{
	objectCount+=1;
	}
	/*
	 * @param oCount deðiþkeni "Constructor" tarafýndan baþlatýlarak
	 * 0 deðeri atanýr. Sonrasýnda deðeri bir arttýrýlýr. Böylece 
	 * Memory türünde bir obje oluþturulduðu zaman 
	 * @param oCount 1 deðerini tutar. Ancak "stack memory" de 
	 * tutulduðu için her yeni obje yaratýlýþýnda bu obje yeniden 
	 * tanýmlanýr ve sonuç olarak hep 1 deðerini tutar.
	 * 
	 */
	public Memory() {
		super();
		this.oCount=0;
		oCount++;
	}
	
	public void finalize() {
		try {
		super.finalize();
		}
		catch(Throwable t) {
			System.out.println("Bir istisna oluþtu!");
		}
	}
	
    /*
     * @param objectCount için "getter" methodu bu private deðiþkenin
     * deðerini alabilmemizi saðlar yani
     * @return objectCount deðiþkeninin tuttuðu deðeri döndürür.
     * 
     */
	public static int getObjectCount() {
		return objectCount;
	}
    /*
     * @param objectCount için "setter" methodu bu private deðiþkene
     * içine gönderdiðimiz deðeri atayabilmemizi  saðlar.
     */
	public static void setObjectCount(int objectCount) {
		Memory.objectCount = objectCount;
	}
	/*
     * @param oCount için "getter" methodu bu private deðiþkenin
     * deðerini alabilmemizi saðlar yani
     * @return oCount deðiþkeninin tuttuðu deðeri döndürür.
     * 
     */
	public int getoCount() {
		return oCount;
	}
	 /*
     * @param oCount için "setter" methodu bu private deðiþkene
     * içine gönderdiðimiz deðeri atayabilmemizi  saðlar.
     */
	public void setoCount(int oCount) {
		this.oCount = oCount;
	}
	
	

}
