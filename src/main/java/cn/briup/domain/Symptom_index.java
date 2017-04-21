package cn.briup.domain;
//搜索引擎表
public class Symptom_index {
//	主键
	private int siid;
//	病症表主键
	private String sindex;
	public int getSiid() {
		return siid;
	}
	public void setSiid(int siid) {
		this.siid = siid;
	}
	public String getIndex() {
		return sindex;
	}
	public void setIndex(String sindex) {
		this.sindex = sindex;
	}
	@Override
	public String toString() {
		return "Symptom_index [siid=" + siid + ", sindex=" + sindex + "]";
	}
	
	
	
}
