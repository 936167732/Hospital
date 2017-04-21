package cn.briup.util;

public enum DIAGNOSIS {
	YES_DIAGNOSIS("YES",1),
	NO_DIAGNOSIS("NO",0);
	private String name;
	private int index;
	private DIAGNOSIS(String name,int index){
		this.name=name;
		this.index=index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	};
	
}
