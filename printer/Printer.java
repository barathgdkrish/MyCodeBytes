package printer;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel>-1&&tonerLevel<=100?tonerLevel:-1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if((tonerAmount>-1&&tonerAmount<=100)&&((this.tonerLevel+tonerAmount)<100))
        		this.tonerLevel += tonerAmount;
        else return -1;
        return this.tonerLevel;
    }
    public int printPages(int pagesToPrint){
        pagesToPrint=(this.duplex)?((pagesToPrint/2)+(pagesToPrint%2)):pagesToPrint;
        this.pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
