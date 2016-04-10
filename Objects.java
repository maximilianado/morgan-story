package objects;

public class Objects {
	
	private boolean candle;
	private Candel[] candleColor;
	private int[] candleColorNum;
	
	private boolean oil;
	private Oil[] kind;
	private int[] oilKindNum;
	
	private Plants[] herbage;
	private int[] herbageKindNum;
	
	private boolean cure;
	private int[] cureKindNum;
	
	private boolean stature;
	private boolean[] statureNum;
	
	private boolean sacrifice;
	private int[] sacrificeKindNum;
	
	//other = bag, knife, ...
	private int[] other;
	//hier können die boolean hin
	
	public Objects(){
		this.candle=false;
		this.candleColor = new Candel[8];
			this.candleColor[0] = Candel.WHITE;
			this.candleColor[1] = Candel.BLACK;
			this.candleColor[2] = Candel.BLUE;
			this.candleColor[3] = Candel.GREEN;
			this.candleColor[4] = Candel.RAINBOW;
			this.candleColor[5] = Candel.RED;
			this.candleColor[6] = Candel.RED_BLACK;
			this.candleColor[7] = Candel.YELLOW;
		this.candleColorNum = new int[8];
		for(int i=0; i<8; i++)
			this.candleColorNum[i]=0;
		
		this.oil=false;
		this.kind = new Oil[9];
			this.kind[0] = Oil.JASMINÖL;
			this.kind[1] = Oil.LAVENDELÖL;
			this.kind[2] = Oil.MAIGLÖCKCHEN;
			this.kind[3] = Oil.MANDELÖL;
			this.kind[4] = Oil.MOSCHUSÖL;
			this.kind[5] = Oil.OLIVENÖL;
			this.kind[6] = Oil.ROSENÖL;
			this.kind[7] = Oil.ROSMARINÖL;
			this.kind[8] = Oil.VOODOOSCHUTZÖL;
		this.oilKindNum = new int[9];
		for(int i=0; i<10; i++)
			this.oilKindNum[i]=0;
		
		//this.herbage = new Plants[];
				
	}
}
