package com.min.edu.vo;

public class StadiumVo {

	private String stadium_id;
	private String stadium_name;
	private String hometeam_id;
	private Integer seat_count;
	private String address;
	private String ddd;
	private String tel;

	public String getStadium_id() {
		return stadium_id;
	}

	public void setStadium_id(String stadium_id) {
		this.stadium_id = stadium_id;
	}

	public String getStadium_name() {
		return stadium_name;
	}

	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}

	public String getHometeam_id() {
		return hometeam_id;
	}

	public void setHometeam_id(String hometeam_id) {
		this.hometeam_id = hometeam_id;
	}

	public Integer getSeat_count() {
		return seat_count;
	}

	public void setSeat_count(Integer seat_count) {
		this.seat_count = seat_count;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "StadiumVo [stadium_id=" + stadium_id + ", stadium_name=" + stadium_name + ", hometeam_id=" + hometeam_id
				+ ", seat_count=" + seat_count + ", address=" + address + ", ddd=" + ddd + ", tel=" + tel + "]";
	}
}
