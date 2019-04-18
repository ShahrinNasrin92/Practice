package com.in28minutes.learning.maven.maven_in_few_steps;

public class Practice {

	private String nam;
	private String id;
	private int ammount;
	
	public void deposit()
	{
		System.out.println( "This is the deposit page" );
	}
	

	public Practice() {
		super();
	}


	public Practice(String nam, String id, int ammount) {
		super();
		this.nam = nam;
		this.id = id;
		this.ammount = ammount;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public void withdraw()
	{
		ammount+=10000;
		System.out.println( ammount );
	}
}




