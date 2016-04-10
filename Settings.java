import objects.*;

public class Settings {

	//String name;
	Objects item;
	int live;
	Gods[] gods;
	
	public void Settings(){
		this.live=100;
		this.setGods();
		this.item = new Objects();
	}
	
	public void setGods(){
		Sacrifies[] likeD = {Sacrifies.MILK, Sacrifies.PALE_FOOT, Sacrifies.SUGARED_WATER, Sacrifies.WHITE_ROSE, Sacrifies.JASMIN_FLOWER, Sacrifies.WHITE_CHICKEN, Sacrifies.COIN, Sacrifies.EGG};
		Sacrifies[] hadeD = {Sacrifies.BLOOD};
		GodsName[] likeGD = {GodsName.DAMBALLA, GodsName.AIDA_WEDO};
		GodsName[] hadeGD = {GodsName.BARON_SAMEDI, GodsName.LOA_PETRO, GodsName.GHEDES};
		Candel[] likeCD = {Candel.BLUE, Candel.RAINBOW, Candel.WHITE};
		Candel[] hadeCD = {Candel.BLACK, Candel.RED_BLACK, Candel.RED};
		Gods damballa = new Gods(GodsName.DAMBALLA, likeD, hadeD, 0, likeGD, hadeGD, likeCD, hadeCD);
		gods[0] = damballa;
		
		Sacrifies[] likePL = {Sacrifies.BREAD, Sacrifies.CORN, Sacrifies.SWEET, Sacrifies.MAIS, Sacrifies.RUM, Sacrifies.BARK};
		Sacrifies[] hadePL = {Sacrifies.BLOOD};
		GodsName[] likeGPL = {GodsName.PAPA_LEGBA, GodsName.LOCO, GodsName.BARON_SAMEDI};
		GodsName[] hadeGPL = {GodsName.GHEDES};
		Candel[] likeCPL = {Candel.GREEN, Candel.RED};
		Candel[] hadeCPL = {Candel.BLACK};
		Gods papaLegba = new Gods(GodsName.PAPA_LEGBA, likePL, hadePL, 0, likeGPL, hadeGPL, likeCPL, hadeCPL);
		gods[1] = papaLegba;
		
		Sacrifies[] likeE = {Sacrifies.PINK_ROSE, Sacrifies.PUMPKIN, Sacrifies.ORANGE, Sacrifies.HONEY, Sacrifies.SHELL, Sacrifies.COIN};
		Sacrifies[] hadeE = {Sacrifies.BLOOD, Sacrifies.FISH, Sacrifies.GOAT, Sacrifies.MEAL, Sacrifies.WHITE_CHICKEN, Sacrifies.YOUNG_PIG};
		GodsName[] likeGE = {GodsName.ERZULI, GodsName.LOCO};
		GodsName[] hadeGE = {GodsName.BARON_SAMEDI, GodsName.LOA_PETRO, GodsName.GHEDES};
		Candel[] likeCE = {Candel.GREEN, Candel.BLUE, Candel.PINK};
		Candel[] hadeCE = {Candel.BLACK, Candel.RED_BLACK};
		Gods erzulie = new Gods(GodsName.ERZULI, likeE, hadeE, 0, likeGE, hadeGE, likeCE, hadeCE);
		gods[2] = erzulie;
		
		Sacrifies[] likeL = {Sacrifies.CORN, Sacrifies.BARK, Sacrifies.FLOWERS, Sacrifies.JASMIN_FLOWER, Sacrifies.HONEY, Sacrifies.NUT, Sacrifies.PINK_ROSE, Sacrifies.WHITE_ROSE};
		Sacrifies[] hadeL = {Sacrifies.BLOOD, Sacrifies.FISH, Sacrifies.GOAT, Sacrifies.MEAL, Sacrifies.WHITE_CHICKEN, Sacrifies.YOUNG_PIG};
		GodsName[] likeGL = {GodsName.LOCO, GodsName.ERZULI, GodsName.DAMBALLA};
		GodsName[] hadeGL = {GodsName.BARON_SAMEDI, GodsName.LOA_PETRO, GodsName.GHEDES};
		Candel[] likeCL = {Candel.GREEN, Candel.WHITE};
		Candel[] hadeCL = {Candel.BLACK, Candel.BLUE, Candel.PINK, Candel.RED, Candel.RED_BLACK, Candel.YELLOW};
		Gods loco = new Gods(GodsName.LOCO, likeL, hadeL, 0, likeGL, hadeGL, likeCL, hadeCL);
		gods[3] = loco;
		
		Sacrifies[] likeAW = {Sacrifies.MILK, Sacrifies.PALE_FOOT, Sacrifies.SUGARED_WATER, Sacrifies.WHITE_ROSE, Sacrifies.JASMIN_FLOWER, Sacrifies.WHITE_CHICKEN, Sacrifies.COIN, Sacrifies.EGG, Sacrifies.OPAL};
		Sacrifies[] hadeAW = {Sacrifies.BLOOD};
		GodsName[] likeGAW = {GodsName.AIDA_WEDO, GodsName.DAMBALLA};
		GodsName[] hadeGAW = {GodsName.BARON_SAMEDI, GodsName.GHEDES};
		Candel[] likeCAW = {Candel.RAINBOW, Candel.WHITE, Candel.BLUE};
		Candel[] hadeCAW = {Candel.BLACK, Candel.RED_BLACK};
		Gods aidaWedo = new Gods(GodsName.AIDA_WEDO, likeAW, hadeAW, 0, likeGAW, hadeGAW, likeCAW, hadeCAW);
		gods[4] = aidaWedo;
		
		Sacrifies[] likeBS = {Sacrifies.PINK_ROSE, Sacrifies.JASMIN_FLOWER, Sacrifies.COIN, Sacrifies.RUM, Sacrifies.APPLE, Sacrifies.BANANA, Sacrifies.BERRY, Sacrifies.BLOOD, Sacrifies.BREAD, Sacrifies.CAKE, Sacrifies.CHAMPAGNER, Sacrifies.COOKIE, Sacrifies.CORN, Sacrifies.EGG, Sacrifies.FISH, Sacrifies.GOAT, Sacrifies.HONEY, Sacrifies.KIWI, Sacrifies.MAIS, Sacrifies.MEAL, Sacrifies.MILK, Sacrifies.NUT, Sacrifies.ORANGE, Sacrifies.PALE_FOOT, Sacrifies.PUMPKIN, Sacrifies.SUGARED_WATER, Sacrifies.SWEET, Sacrifies.WATERMELON, Sacrifies.WHITE_CHICKEN, Sacrifies.YOUNG_PIG};
		Sacrifies[] hadeBS = {Sacrifies.PEARL, Sacrifies.JEWEL};
		GodsName[] likeGBS = {GodsName.BARON_SAMEDI, GodsName.PAPA_LEGBA, GodsName.ERZULI};
		GodsName[] hadeGBS = {GodsName.LOCO, GodsName.AIDA_WEDO};
		Candel[] likeCBS = {Candel.BLACK, Candel.RED, Candel.RED_BLACK};
		Candel[] hadeCBS = {Candel.BLUE, Candel.GREEN};
		Gods baronSamedi = new Gods(GodsName.BARON_SAMEDI, likeBS, hadeBS, 0, likeGBS, hadeGBS, likeCBS, hadeCBS);
		gods[5] = baronSamedi;
		
		Sacrifies[] likeLP = {Sacrifies.RUM, Sacrifies.BLOOD, Sacrifies.WHITE_CHICKEN, Sacrifies.COIN};
		Sacrifies[] hadeLP = {Sacrifies.FLOWERS, Sacrifies.JASMIN_FLOWER, Sacrifies.PEARL, Sacrifies.PINK_ROSE};
		GodsName[] likeGLP = {GodsName.LOA_PETRO, GodsName.GHEDES};
		GodsName[] hadeGLP = {GodsName.ERZULI, GodsName.AIDA_WEDO};
		Candel[] likeCLP = {Candel.BLACK, Candel.RED, Candel.RED_BLACK};
		Candel[] hadeCLP = {Candel.BLUE, Candel.GREEN};
		Gods loaPetro = new Gods(GodsName.LOA_PETRO, likeLP, hadeLP, 0, likeGLP, hadeGLP, likeCLP, hadeCLP);
		gods[6] = loaPetro;
		
		Sacrifies[] likeG = {Sacrifies.RUM, Sacrifies.BLOOD, Sacrifies.WHITE_CHICKEN, Sacrifies.COIN};
		Sacrifies[] hadeG = {Sacrifies.FLOWERS, Sacrifies.JASMIN_FLOWER, Sacrifies.PEARL, Sacrifies.PINK_ROSE};
		GodsName[] likeGG = {GodsName.GHEDES};
		GodsName[] hadeGG = {GodsName.ERZULI};
		Candel[] likeCG = {Candel.BLACK, Candel.RED, Candel.RED_BLACK};
		Candel[] hadeCG = {Candel.BLUE, Candel.GREEN};
		Gods ghede = new Gods(GodsName.GHEDES, likeG, hadeG, 0, likeGG, hadeGG, likeCG, hadeCG);
		gods[7] = ghede;
	}
}
