package month.design;

public class enumMethod {
	
	
	
	Month months;
	public enumMethod(Month months)
	{
		this.months=months;
	}
	
	public void WhichMonth()
	{
		switch (months) {
        case JANUARY:
            System.out.println("JANUARY is the first month of the Year ");
            break;
        case FEBRUARY:
            System.out.println("FEBRUARY is the second month of the Year ");
            break;
            
        case MARCH:
            System.out.println("MARCH is the third month of the Year ");
            break;
        case APRIL:
            System.out.println("APRIL is the fourth month of the Year ");
            break;
        case MAY:
            System.out.println("MAY is the fifth month of the Year ");
            break;
        case JUNE:
            System.out.println("JUNE is the sixth month of the Year ");
            break;
        case JULY:
            System.out.println("JULY is the seventh month of the Year ");
            break;
        case AUGUST:
            System.out.println("AUGUST is the eight month of the Year ");
            break;
        case SEPTEMBER:
            System.out.println("SEPTEMBER is the ninth month of the Year ");
            break;
        case OCTOBER:
            System.out.println("OCTOBER is the tenth month of the Year ");
            break;
           
        case NOVEMBER:
            System.out.println("NOVEMBER is the eleventh month of the Year ");
            break;
            
        default:
            System.out.println("DECEMBER is the twelvth month of the Year ");
            break;
             
           
               
	}
	}
}
	


