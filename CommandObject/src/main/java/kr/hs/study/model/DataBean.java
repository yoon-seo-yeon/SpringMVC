package kr.hs.study.model;

public class DataBean {
	//변수 이름이 같아야 자동주입이 된다.
	private String data1;
	private String data2;
	
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
}