package objects;
/**
 * Class that represents the gods.
 * @author sin
 *
 */
public class Gods {
	
	public GodsName name;
	public Sacrifies[] like;
	public Sacrifies[] hade;
	public GodsName[] likeG;
	public GodsName[] hadeG;
	public Candel[] likeC;
	public Candel[] hadeC;
	public int sympathy;
	
	public Gods(GodsName name, Sacrifies[] obj, Sacrifies[] hade, int i, GodsName[] likeG, GodsName[] hadeG, Candel[] likeC, Candel[] hadeC){
		this.name=name;
		this.like=obj;
		this.hade=hade;
		this.likeG=likeG;
		this.hadeG=hadeG;
		this.likeC=likeC;
		this.hadeC=hadeC;
		this.sympathy=i;
	}

	// GETTER
	public GodsName getName() {
		return name;
	}

	public Sacrifies[] getLike() {
		return like;
	}
	
	public int getSympathy() {
		return sympathy;
	}

	// SETTER
	public void setSympathy(int sympathy) {
		this.sympathy = sympathy;
	}
	
	// scale Sympathy
	public void addSympathy(int i){
		this.sympathy = this.sympathy + i ;
	}
	
	public void subSympathy(int i){
		this.sympathy = this.sympathy - 1;
	}
	
	// like an object?
	public boolean likeObject(Objects o){
		for(int i=0; i<this.like.length; i++){
			if(this.like[i].equals(o))return true;
		}
		return false;
	}
	
	public boolean hadeObject(Objects o){
		for(int i=0; i<this.like.length; i++){
			if(this.like[i].equals(o))return true;
		}
		return false;
	}
	
	// like a God?
	public boolean likeGod(GodsName god){
		for(int i=0; i<this.likeG.length; i++){
			if(this.likeG[i]==god)return true;
		}
		return false;
	}
	
	public boolean hadeGod(GodsName god){
		for(int i=0; i<this.hadeG.length; i++){
			if(this.hadeG[i]==god)return true;
		}
		return false;
	}
	
	//like/hade Candels
	public boolean likeCandel(Candel candel){
		for(int i=0; i<this.likeC.length; i++){
			if(this.likeC[i]==candel)return true;
		}
		return false;
	}
	
	public boolean hadeCandel(Candel candel){
		for(int i=0; i<this.hadeC.length; i++){
			if(this.hadeC[i]==candel)return true;
		}
		return false;
	}
}
