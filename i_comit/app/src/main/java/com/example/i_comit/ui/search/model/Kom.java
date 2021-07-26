package com.example.i_comit.ui.search.model;

import com.google.gson.annotations.SerializedName;

public class Kom {

	@SerializedName("coname")
	private String coname;

	@SerializedName("fkeg")
	private String fkeg;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("email_verified_at")
	private Object emailVerifiedAt;

	@SerializedName("kab")
	private String kab;

	@SerializedName("ins")
	private String ins;

	@SerializedName("password")
	private String password;

	@SerializedName("nama")
	private String nama;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("nowa")
	private String nowa;

	@SerializedName("logo")
	private String logo;

	@SerializedName("nohp")
	private String nohp;

	@SerializedName("id")
	private int id;

	@SerializedName("deskripsi")
	private String deskripsi;

	@SerializedName("remember_token")
	private Object rememberToken;

	@SerializedName("prov")
	private String prov;

	@SerializedName("email")
	private String email;

	@SerializedName("you")
	private String you;

	@SerializedName("status")
	private String status;

	public void setConame(String coname){
		this.coname = coname;
	}

	public String getConame(){
		return coname;
	}

	public void setFkeg(String fkeg){
		this.fkeg = fkeg;
	}

	public String getFkeg(){
		return fkeg;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setEmailVerifiedAt(Object emailVerifiedAt){
		this.emailVerifiedAt = emailVerifiedAt;
	}

	public Object getEmailVerifiedAt(){
		return emailVerifiedAt;
	}

	public void setKab(String kab){
		this.kab = kab;
	}

	public String getKab(){
		return kab;
	}

	public void setIns(String ins){
		this.ins = ins;
	}

	public String getIns(){
		return ins;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setNowa(String nowa){
		this.nowa = nowa;
	}

	public String getNowa(){
		return nowa;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setNohp(String nohp){
		this.nohp = nohp;
	}

	public String getNohp(){
		return nohp;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDeskripsi(String deskripsi){
		this.deskripsi = deskripsi;
	}

	public String getDeskripsi(){
		return deskripsi;
	}

	public void setRememberToken(Object rememberToken){
		this.rememberToken = rememberToken;
	}

	public Object getRememberToken(){
		return rememberToken;
	}

	public void setProv(String prov){
		this.prov = prov;
	}

	public String getProv(){
		return prov;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setYou(String you){
		this.you = you;
	}

	public String getYou(){
		return you;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"coname = '" + coname + '\'' + 
			",fkeg = '" + fkeg + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",email_verified_at = '" + emailVerifiedAt + '\'' + 
			",kab = '" + kab + '\'' + 
			",ins = '" + ins + '\'' + 
			",password = '" + password + '\'' + 
			",nama = '" + nama + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",nowa = '" + nowa + '\'' + 
			",logo = '" + logo + '\'' + 
			",nohp = '" + nohp + '\'' + 
			",id = '" + id + '\'' + 
			",deskripsi = '" + deskripsi + '\'' + 
			",remember_token = '" + rememberToken + '\'' + 
			",prov = '" + prov + '\'' + 
			",email = '" + email + '\'' + 
			",you = '" + you + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}