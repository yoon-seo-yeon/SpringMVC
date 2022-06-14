package kr.hs.study.beans;

public class Score {
	private String name;
	private int ko;
	private int en;
	private int ma;
	private int sp;
	private int total;
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public int total() {
		this.total = ko+en+ma+sp;
		return (ko+en+ma+sp);
	}
	public double avg() {
		return (total/4);
	}
}
