package laobi.git.springTransaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persion")
public class Persion {//60001---60003--604

	/**
	 * 
	 */
	private static final long serialVersionUID = 5127853981202454040L;//from5 501
	private int id;
	private String name;//from6 commit6
	private Integer age;//from6 commit7
	private String telephone;//from 6 commit7

	public Persion() {
		this.name = "adddaa";
		this.age = 9;
		this.telephone = "12309";
	}

	public Persion(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Persion(int id, String name, Integer age, String telephone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.telephone = telephone;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
